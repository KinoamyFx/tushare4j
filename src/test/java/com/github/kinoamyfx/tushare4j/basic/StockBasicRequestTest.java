package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TuShareException;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import com.github.kinoamyfx.tushare4j.enums.IsHs;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static com.github.kinoamyfx.tushare4j.TuShareClientTest.client;
import static com.github.kinoamyfx.tushare4j.enums.ListStatus.L;

public class StockBasicRequestTest {

    @Test
    public void testCall() throws IOException, TuShareException {

        StockBasicRequest request = new StockBasicRequest()
                .listStatus(L)
                .isHs(IsHs.H)
                .exchange(Exchange.SSE);

        request.listStatus();
        request.isHs();
        request.exchange();

        List<StockBasic> results = client.call(request);

        Assert.assertFalse(results.isEmpty());
        results.parallelStream().forEach(result -> {
            try {
                Field[] fields = result.getClass().getDeclaredFields();

                for (Field field : fields) {
                    Method set = result.getClass().getDeclaredMethod(field.getName(), field.getType());
                    Method get = result.getClass().getDeclaredMethod(field.getName());

                    Object v = get.invoke(result);

                    if ("delist_date".equals(field.getName())) {
                        Assert.assertNotNull(set.invoke(result, v));
                        continue;
                    }
                    Assert.assertNotNull(v);
                    Assert.assertNotNull(set.invoke(result, v));
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
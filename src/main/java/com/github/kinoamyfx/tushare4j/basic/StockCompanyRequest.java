package com.github.kinoamyfx.tushare4j.basic;

import com.github.kinoamyfx.tushare4j.core.TsParam;
import com.github.kinoamyfx.tushare4j.core.TsRequest;
import com.github.kinoamyfx.tushare4j.enums.Exchange;
import lombok.Data;

@Data
public class StockCompanyRequest implements TsRequest<StockCompany> {

    @TsParam(name = "exchange")
    private Exchange exchange = Exchange.SSE;

    @Override
    public String apiName() {
        return "stock_company";
    }

}

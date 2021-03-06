package com.github.kinoamyfx.tushare4j.rate;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class ShiborTest {
    String c = "<tbody><tr>\n" +
            "<td>date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>on</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>隔夜</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1w</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>1周</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>2w</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>2周</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1m</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>1个月</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>3m</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>3个月</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>6m</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>6个月</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>9m</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>9个月</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1y</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>1年</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(c);
    }
}
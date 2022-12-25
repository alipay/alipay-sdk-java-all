package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

public class AlipayTradeCreateResponse extends AlipayResponse {
    private static final long serialVersionUID = 2155185786985859981L;

    @ApiField("out_trade_no")
    private String outTradeNo;

    @ApiField("trade_no")
    private String tradeNo;

    public void setOutTradeNo(String outTradeNo) { this.outTradeNo = outTradeNo; }

    public String getOutTradeNo() { return this.outTradeNo; }

    public void setTradeNo(String tradeNo) { this.tradeNo = tradeNo; }

    public String getTradeNo() { return this.tradeNo; }
}

package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

public class AlipayOpenOperationOpenbizmockBizQueryResponse extends AlipayResponse {
    private static final long serialVersionUID = 4454438339953611299L;

    @ApiField("result")
    private String result;

    public void setResult(String result) { this.result = result; }

    public String getResult() { return this.result; }
}

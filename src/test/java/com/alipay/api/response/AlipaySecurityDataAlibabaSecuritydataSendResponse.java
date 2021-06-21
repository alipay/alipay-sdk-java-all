/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * @author junying
 * @version : AlipaySecurityDataAlibabaSecuritydataSendResponse.java, v 0.1 2021年03月09日 11:23 下午 junying Exp $
 */
public class AlipaySecurityDataAlibabaSecuritydataSendResponse extends AlipayResponse {
    private static final long serialVersionUID = 2518898633559727621L;
    @ApiField("data_id")
    private String dataId;

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }


    public String getDataId() {
        return this.dataId;
    }
}

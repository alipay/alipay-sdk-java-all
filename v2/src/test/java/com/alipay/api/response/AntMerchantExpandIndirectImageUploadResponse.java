/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * @author junying
 * @version : AntMerchantExpandIndirectImageUploadResponse.java, v 0.1 2020年12月28日 10:02 下午 junying Exp $
 */
public class AntMerchantExpandIndirectImageUploadResponse extends AlipayResponse {
    private static final long serialVersionUID = 6314488822345249741L;
    @ApiField("image_id")
    private String imageId;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    public String getImageId() {
        return this.imageId;
    }
}
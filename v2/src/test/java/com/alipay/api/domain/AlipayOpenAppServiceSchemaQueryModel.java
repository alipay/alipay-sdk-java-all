package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;


public class AlipayOpenAppServiceSchemaQueryModel
        extends AlipayObject {
    private static final long serialVersionUID = 6862586748722949163L;
    @ApiField("category_id")
    private String categoryId;

    public String getCategoryId() {
        return this.categoryId;
    }


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}

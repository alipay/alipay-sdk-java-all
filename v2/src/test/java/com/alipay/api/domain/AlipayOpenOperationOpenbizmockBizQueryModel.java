package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放基础业务模拟查询接口
 *
 * @author auto create
 * @since 1.0, 2019-01-17 16:36:43
 */
public class AlipayOpenOperationOpenbizmockBizQueryModel extends AlipayObject {

    private static final long serialVersionUID = 4524752312315297744L;

    /**
     * 业务编码
     */
    @ApiField("biz_no")
    private String bizNo;

    public String getBizNo() {
        return this.bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户信息
 *
 * @author auto create
 * @since 1.0, 2018-02-07 11:15:02
 */
public class SubMerchant extends AlipayObject {

    private static final long serialVersionUID = 2616557314321435279L;

    /**
     * 间连受理商户的支付宝商户编号，通过间连商户入驻后得到。间连业务下必传，并且需要按规范传递受理商户编号。
     */
    @ApiField("merchant_id")
    private String merchantId;

    /**
     * 商户id类型，
     */
    @ApiField("merchant_type")
    private String merchantType;

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantType() {
        return this.merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

}

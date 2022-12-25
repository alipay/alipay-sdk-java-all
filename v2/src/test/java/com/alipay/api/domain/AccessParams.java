package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约接入信息
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:33:22
 */
public class AccessParams extends AlipayObject {

    private static final long serialVersionUID = 7173725484973574853L;

    /**
     * 目前支持以下值： 1. ALIPAYAPP  （钱包h5页面签约） 2. QRCODE(扫码签约) 3. QRCODEORSMS(扫码签约或者短信签约)
     */
    @ApiField("channel")
    private String channel;

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}

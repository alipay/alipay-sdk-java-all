package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约接入信息
 *
 * @author auto create
 * @since 1.0, 2026-03-06 11:27:55
 */
public class AccessParams extends AlipayObject {

	private static final long serialVersionUID = 5146748323989221747L;

	/**
	 * 传参示例：
1. ALIPAYAPP  （钱包h5页面签约）
2. QRCODE(扫码签约)
3. QRCODEORSMS(扫码签约或者短信签约)
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantagreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:36:49
 */
public class AlipayOpenInstantdeliveryMerchantagreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8632615945549617486L;

	/** 
	 * 授权二维码的url, 必须用传入的uid进行扫码
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}

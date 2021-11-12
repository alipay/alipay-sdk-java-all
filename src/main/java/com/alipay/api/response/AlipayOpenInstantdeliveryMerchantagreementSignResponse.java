package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantagreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-02 14:12:30
 */
public class AlipayOpenInstantdeliveryMerchantagreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8537483418688747611L;

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

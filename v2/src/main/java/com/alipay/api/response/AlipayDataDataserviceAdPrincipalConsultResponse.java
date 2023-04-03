package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:23:05
 */
public class AlipayDataDataserviceAdPrincipalConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3527448597462193376L;

	/** 
	 * 签约平台地址
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

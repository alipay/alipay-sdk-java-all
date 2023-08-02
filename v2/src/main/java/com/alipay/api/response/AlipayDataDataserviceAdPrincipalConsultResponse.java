package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:21:52
 */
public class AlipayDataDataserviceAdPrincipalConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3843349165264324574L;

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

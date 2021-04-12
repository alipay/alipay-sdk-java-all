package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-11 16:08:35
 */
public class AlipayDataDataserviceAdPrincipalConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3655293889277474817L;

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

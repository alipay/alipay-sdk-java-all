package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.verify response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-01 17:21:36
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3313684751823184869L;

	/** 
	 * 返回用于唤起认证页面的认证url
	 */
	@ApiField("certify_url")
	private String certifyUrl;

	public void setCertifyUrl(String certifyUrl) {
		this.certifyUrl = certifyUrl;
	}
	public String getCertifyUrl( ) {
		return this.certifyUrl;
	}

}

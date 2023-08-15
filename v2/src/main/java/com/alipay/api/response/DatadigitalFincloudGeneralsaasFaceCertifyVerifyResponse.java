package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:20:35
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4234426871548934449L;

	/** 
	 * 返回用于唤起刷脸页面的url
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

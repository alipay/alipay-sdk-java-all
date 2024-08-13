package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.face.certify.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 10:12:04
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8656635955779674818L;

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

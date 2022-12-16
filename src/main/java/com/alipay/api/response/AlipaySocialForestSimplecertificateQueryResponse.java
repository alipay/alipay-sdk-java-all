package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.forest.simplecertificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:58:38
 */
public class AlipaySocialForestSimplecertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8293258453573628555L;

	/** 
	 * 证书ID
	 */
	@ApiField("cert_id")
	private String certId;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setCertId(String certId) {
		this.certId = certId;
	}
	public String getCertId( ) {
		return this.certId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}

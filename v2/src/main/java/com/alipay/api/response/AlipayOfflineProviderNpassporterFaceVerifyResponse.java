package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.face.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-09 20:37:45
 */
public class AlipayOfflineProviderNpassporterFaceVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3847696589382286156L;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 加密证件号
	 */
	@ApiField("encrypt_cert_no")
	private String encryptCertNo;

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setEncryptCertNo(String encryptCertNo) {
		this.encryptCertNo = encryptCertNo;
	}
	public String getEncryptCertNo( ) {
		return this.encryptCertNo;
	}

}

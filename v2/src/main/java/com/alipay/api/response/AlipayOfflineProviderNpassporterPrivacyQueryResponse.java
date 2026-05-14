package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.privacy.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 10:12:45
 */
public class AlipayOfflineProviderNpassporterPrivacyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4241648738372495368L;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * null
	 */
	@ApiListField("encrypt_cert_no_list")
	@ApiField("string")
	private List<String> encryptCertNoList;

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setEncryptCertNoList(List<String> encryptCertNoList) {
		this.encryptCertNoList = encryptCertNoList;
	}
	public List<String> getEncryptCertNoList( ) {
		return this.encryptCertNoList;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件信息
 *
 * @author auto create
 * @since 1.0, 2021-07-28 12:10:09
 */
public class TransferCredential extends AlipayObject {

	private static final long serialVersionUID = 5879449424456828784L;

	/**
	 * 证件号码
	 */
	@ApiField("credential_no")
	private String credentialNo;

	/**
	 * 证件类型
	 */
	@ApiField("credential_type")
	private String credentialType;

	public String getCredentialNo() {
		return this.credentialNo;
	}
	public void setCredentialNo(String credentialNo) {
		this.credentialNo = credentialNo;
	}

	public String getCredentialType() {
		return this.credentialType;
	}
	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 颁发方VC配置查询
 *
 * @author auto create
 * @since 1.0, 2026-03-17 13:02:43
 */
public class AlipaySecurityProdIssuerVcconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7468984853939698516L;

	/**
	 * 分布式认证体系下的凭证类型
	 */
	@ApiField("credential_type")
	private String credentialType;

	/**
	 * 颁发方调用sdk拌饭凭证时，出入自己的did标识
	 */
	@ApiField("issuer_did")
	private String issuerDid;

	public String getCredentialType() {
		return this.credentialType;
	}
	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	public String getIssuerDid() {
		return this.issuerDid;
	}
	public void setIssuerDid(String issuerDid) {
		this.issuerDid = issuerDid;
	}

}

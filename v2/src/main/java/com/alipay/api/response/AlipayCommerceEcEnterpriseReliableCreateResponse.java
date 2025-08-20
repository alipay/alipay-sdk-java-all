package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.reliable.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 19:47:37
 */
public class AlipayCommerceEcEnterpriseReliableCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3385197767814945835L;

	/** 
	 * 因公付共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 企业码企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

}

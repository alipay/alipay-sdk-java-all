package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-19 11:52:48
 */
public class AlipayCommerceEcEnterpriseUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6527873398935852997L;

	/** 
	 * 入参传的共同账户id，出参也会返回共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 解约链接
	 */
	@ApiField("unsign_url")
	private String unsignUrl;

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

	public void setUnsignUrl(String unsignUrl) {
		this.unsignUrl = unsignUrl;
	}
	public String getUnsignUrl( ) {
		return this.unsignUrl;
	}

}

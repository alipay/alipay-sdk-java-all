package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.companyclerk.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 14:42:40
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyclerkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3478463213125844555L;

	/** 
	 * 营业员认证链接地址
	 */
	@ApiField("clerk_auth_url")
	private String clerkAuthUrl;

	/** 
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/** 
	 * 外部营业员ID
	 */
	@ApiField("out_clerk_id")
	private String outClerkId;

	public void setClerkAuthUrl(String clerkAuthUrl) {
		this.clerkAuthUrl = clerkAuthUrl;
	}
	public String getClerkAuthUrl( ) {
		return this.clerkAuthUrl;
	}

	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}
	public String getCompanyClerkId( ) {
		return this.companyClerkId;
	}

	public void setOutClerkId(String outClerkId) {
		this.outClerkId = outClerkId;
	}
	public String getOutClerkId( ) {
		return this.outClerkId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ClerkInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.invoiceclerk.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 18:02:26
 */
public class AlipayCommerceEcRecyclinginvoiceInvoiceclerkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7834888784954266419L;

	/** 
	 * 员工信息列表
	 */
	@ApiField("clerk_info_list")
	private ClerkInfo clerkInfoList;

	public void setClerkInfoList(ClerkInfo clerkInfoList) {
		this.clerkInfoList = clerkInfoList;
	}
	public ClerkInfo getClerkInfoList( ) {
		return this.clerkInfoList;
	}

}

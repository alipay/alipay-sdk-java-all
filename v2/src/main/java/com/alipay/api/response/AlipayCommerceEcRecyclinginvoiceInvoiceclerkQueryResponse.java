package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ClerkInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.invoiceclerk.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 10:22:45
 */
public class AlipayCommerceEcRecyclinginvoiceInvoiceclerkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3551696625389773281L;

	/** 
	 * 员工信息列表
	 */
	@ApiField("clerk_info_list")
	private ClerkInfo clerkInfoList;

	/** 
	 * 员工信息列表
	 */
	@ApiListField("clerk_list")
	@ApiField("clerk_info")
	private List<ClerkInfo> clerkList;

	public void setClerkInfoList(ClerkInfo clerkInfoList) {
		this.clerkInfoList = clerkInfoList;
	}
	public ClerkInfo getClerkInfoList( ) {
		return this.clerkInfoList;
	}

	public void setClerkList(List<ClerkInfo> clerkList) {
		this.clerkList = clerkList;
	}
	public List<ClerkInfo> getClerkList( ) {
		return this.clerkList;
	}

}

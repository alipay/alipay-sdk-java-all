package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.clerkquota.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:02:51
 */
public class AlipayCommerceEcRecyclinginvoiceClerkquotaModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8775415828622249788L;

	/** 
	 * 额度流水ID
	 */
	@ApiField("clerk_quota_id")
	private String clerkQuotaId;

	public void setClerkQuotaId(String clerkQuotaId) {
		this.clerkQuotaId = clerkQuotaId;
	}
	public String getClerkQuotaId( ) {
		return this.clerkQuotaId;
	}

}

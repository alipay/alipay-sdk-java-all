package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.leads.expand.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 19:22:16
 */
public class AlipayOpenSpLeadsExpandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6854823565855129514L;

	/** 
	 * 商机id
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}

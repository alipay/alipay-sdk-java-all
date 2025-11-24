package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.leads.expand.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:38:25
 */
public class AlipayOpenSpLeadsExpandCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1674455492322344244L;

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

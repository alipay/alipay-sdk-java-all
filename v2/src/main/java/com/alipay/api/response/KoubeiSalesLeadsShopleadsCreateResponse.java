package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.leads.shopleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:35
 */
public class KoubeiSalesLeadsShopleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4492217616453337382L;

	/** 
	 * 导入成功的LeadsId
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

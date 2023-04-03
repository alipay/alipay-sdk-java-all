package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.leads.shopleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:25:51
 */
public class KoubeiSalesLeadsShopleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1132779632219343575L;

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

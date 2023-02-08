package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.leads.shopleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:06:34
 */
public class KoubeiSalesLeadsShopleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5749498182978362463L;

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

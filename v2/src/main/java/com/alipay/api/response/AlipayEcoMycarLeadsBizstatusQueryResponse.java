package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.leads.bizstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 14:02:51
 */
public class AlipayEcoMycarLeadsBizstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2444752562792365156L;

	/** 
	 * 线索业务状态
	 */
	@ApiField("leads_biz_status")
	private String leadsBizStatus;

	public void setLeadsBizStatus(String leadsBizStatus) {
		this.leadsBizStatus = leadsBizStatus;
	}
	public String getLeadsBizStatus( ) {
		return this.leadsBizStatus;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.decoration.leads.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 15:57:41
 */
public class AlipayEbppIndustryDecorationLeadsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7881122377356295825L;

	/** 
	 * true已保存留资反馈；false未保存留资反馈
	 */
	@ApiField("leads_feedback")
	private Boolean leadsFeedback;

	public void setLeadsFeedback(Boolean leadsFeedback) {
		this.leadsFeedback = leadsFeedback;
	}
	public Boolean getLeadsFeedback( ) {
		return this.leadsFeedback;
	}

}

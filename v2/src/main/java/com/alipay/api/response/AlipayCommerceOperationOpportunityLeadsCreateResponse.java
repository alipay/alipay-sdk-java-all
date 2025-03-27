package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.opportunity.leads.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-26 17:02:05
 */
public class AlipayCommerceOperationOpportunityLeadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3572764919812712957L;

	/** 
	 * 商机id
	 */
	@ApiField("opportunity_id")
	private String opportunityId;

	/** 
	 * 商机ID的商机状态
	 */
	@ApiField("opportunity_status")
	private String opportunityStatus;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}
	public String getOpportunityId( ) {
		return this.opportunityId;
	}

	public void setOpportunityStatus(String opportunityStatus) {
		this.opportunityStatus = opportunityStatus;
	}
	public String getOpportunityStatus( ) {
		return this.opportunityStatus;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}

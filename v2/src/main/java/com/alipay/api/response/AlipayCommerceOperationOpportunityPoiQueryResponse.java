package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.opportunity.poi.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-29 23:02:25
 */
public class AlipayCommerceOperationOpportunityPoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6268177245986924892L;

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
	 * 商机状态信息，在门店 POI 匹配失败时传入失败原因
	 */
	@ApiField("opportunity_status_info")
	private String opportunityStatusInfo;

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

	public void setOpportunityStatusInfo(String opportunityStatusInfo) {
		this.opportunityStatusInfo = opportunityStatusInfo;
	}
	public String getOpportunityStatusInfo( ) {
		return this.opportunityStatusInfo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}

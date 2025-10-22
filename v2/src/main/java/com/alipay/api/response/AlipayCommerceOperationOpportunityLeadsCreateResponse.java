package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.opportunity.leads.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 19:22:37
 */
public class AlipayCommerceOperationOpportunityLeadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5598677548549673174L;

	/** 
	 * 安装码
	 */
	@ApiField("installation_code")
	private String installationCode;

	/** 
	 * 线索ID
	 */
	@ApiField("leads_id")
	private String leadsId;

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
	 * 商机状态信息，在门店 Leads 创建失败时传入创建失败原因
	 */
	@ApiField("opportunity_status_info")
	private String opportunityStatusInfo;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 饿了么专项渠道标识
	 */
	@ApiField("source")
	private String source;

	public void setInstallationCode(String installationCode) {
		this.installationCode = installationCode;
	}
	public String getInstallationCode( ) {
		return this.installationCode;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

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

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

}

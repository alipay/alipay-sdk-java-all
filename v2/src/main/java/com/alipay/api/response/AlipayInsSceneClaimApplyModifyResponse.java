package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 18:07:05
 */
public class AlipayInsSceneClaimApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4566899929325188352L;

	/** 
	 * 报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/** 
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}
	public String getClaimReportNo( ) {
		return this.claimReportNo;
	}

	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}
	public String getPartnerOrgId( ) {
		return this.partnerOrgId;
	}

}

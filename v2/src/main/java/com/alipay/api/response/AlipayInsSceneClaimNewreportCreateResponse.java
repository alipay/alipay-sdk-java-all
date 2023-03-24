package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.newreport.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:30:31
 */
public class AlipayInsSceneClaimNewreportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4186448283487522667L;

	/** 
	 * 保单单据号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}
	public String getClaimReportNo( ) {
		return this.claimReportNo;
	}

}

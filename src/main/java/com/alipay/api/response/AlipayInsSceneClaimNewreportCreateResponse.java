package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.newreport.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-08 09:48:35
 */
public class AlipayInsSceneClaimNewreportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2224217911821533957L;

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

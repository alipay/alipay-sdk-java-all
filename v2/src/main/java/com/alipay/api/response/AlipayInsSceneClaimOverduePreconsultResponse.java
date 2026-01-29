package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.overdue.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 09:57:41
 */
public class AlipayInsSceneClaimOverduePreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3185192895492676328L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 业务受理流水
	 */
	@ApiField("overdue_pre_consult_flow_id")
	private String overduePreConsultFlowId;

	/** 
	 * 不准入原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setOverduePreConsultFlowId(String overduePreConsultFlowId) {
		this.overduePreConsultFlowId = overduePreConsultFlowId;
	}
	public String getOverduePreConsultFlowId( ) {
		return this.overduePreConsultFlowId;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}

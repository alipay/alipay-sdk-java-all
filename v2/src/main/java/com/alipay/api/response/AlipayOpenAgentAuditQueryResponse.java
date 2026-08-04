package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.audit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:49:02
 */
public class AlipayOpenAgentAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2679946134298994896L;

	/** 
	 * 当前审核单状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 核驳回时的原因，非驳回为空
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}

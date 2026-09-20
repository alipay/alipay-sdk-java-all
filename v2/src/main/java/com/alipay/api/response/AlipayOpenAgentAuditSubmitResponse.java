package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.audit.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-31 14:12:51
 */
public class AlipayOpenAgentAuditSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3465614645221269434L;

	/** 
	 * 修改审核单号，触发审核时返回，可直接查
	 */
	@ApiField("audit_id")
	private String auditId;

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}
	public String getAuditId( ) {
		return this.auditId;
	}

}

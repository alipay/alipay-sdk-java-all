package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.audit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpMcpAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7263892155659381154L;

	/** 
	 * 审核结果：true-通过, false-未通过
	 */
	@ApiField("audit_result")
	private Boolean auditResult;

	public void setAuditResult(Boolean auditResult) {
		this.auditResult = auditResult;
	}
	public Boolean getAuditResult( ) {
		return this.auditResult;
	}

}

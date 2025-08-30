package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券openapi接口接入送审，查询详情接口需要透出审核结果
 *
 * @author auto create
 * @since 1.0, 2025-08-14 10:24:46
 */
public class AuditResultInfo extends AlipayObject {

	private static final long serialVersionUID = 3283134557593281472L;

	/**
	 * 审核驳回的原因
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 审核结果
SUBMIT：审核中
APPROVE：审核通过
REJECT：审核驳回
	 */
	@ApiField("audit_result")
	private String auditResult;

	/**
	 * 审核类型
UNIFY_ACCESS_CHECK：统一接入平台审核
	 */
	@ApiField("audit_type")
	private String auditType;

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public String getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getAuditType() {
		return this.auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

}

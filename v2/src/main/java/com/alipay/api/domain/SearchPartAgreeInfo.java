package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审核提效部分剔除数据的信息
 *
 * @author auto create
 * @since 1.0, 2023-07-25 10:38:23
 */
public class SearchPartAgreeInfo extends AlipayObject {

	private static final long serialVersionUID = 6168417668439865447L;

	/**
	 * 剔除数据名称
	 */
	@ApiField("audit_info")
	private String auditInfo;

	/**
	 * 审核operator信息
	 */
	@ApiField("audit_operator")
	private String auditOperator;

	/**
	 * 审核原因
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 剔除数据类型
	 */
	@ApiField("audit_type")
	private String auditType;

	public String getAuditInfo() {
		return this.auditInfo;
	}
	public void setAuditInfo(String auditInfo) {
		this.auditInfo = auditInfo;
	}

	public String getAuditOperator() {
		return this.auditOperator;
	}
	public void setAuditOperator(String auditOperator) {
		this.auditOperator = auditOperator;
	}

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public String getAuditType() {
		return this.auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

}

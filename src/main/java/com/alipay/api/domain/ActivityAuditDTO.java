package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动审核模型
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:47:19
 */
public class ActivityAuditDTO extends AlipayObject {

	private static final long serialVersionUID = 1539966176159195529L;

	/**
	 * 审核id
	 */
	@ApiField("audit_id")
	private String auditId;

	/**
	 * INIT:初始化;AUDITING:审核中;REJECT:审核驳回;PASS:审核通过;CANCEL:审核撤销;FAIL:审核失败
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 操作人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * SALES:口碑内部小二;PROVIDER:外部服务商;PROVIDER_STAFF:外部服务商员工
	 */
	@ApiField("creator_type")
	private String creatorType;

	/**
	 * 操作时间
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 审核通过或者审核驳回的原因
	 */
	@ApiField("reason")
	private String reason;

	public String getAuditId() {
		return this.auditId;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorType() {
		return this.creatorType;
	}
	public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}

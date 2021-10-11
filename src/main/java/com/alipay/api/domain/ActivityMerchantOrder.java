package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动报名申请单明细
 *
 * @author auto create
 * @since 1.0, 2021-08-31 02:53:21
 */
public class ActivityMerchantOrder extends AlipayObject {

	private static final long serialVersionUID = 3535421121885279532L;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 审核结果，99通过，-1失败，901审核中
	 */
	@ApiField("audit_result")
	private String auditResult;

	/**
	 * 失败理由
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 申请单ID
	 */
	@ApiField("order_id")
	private String orderId;

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}

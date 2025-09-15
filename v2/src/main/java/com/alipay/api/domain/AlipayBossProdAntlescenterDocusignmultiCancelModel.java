package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Docusign取消签约
 *
 * @author auto create
 * @since 1.0, 2025-04-22 14:45:24
 */
public class AlipayBossProdAntlescenterDocusignmultiCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6187489147621865533L;

	/**
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 操作方工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 取消签署原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 签署id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}

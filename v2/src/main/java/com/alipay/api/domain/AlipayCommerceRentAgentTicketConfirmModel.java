package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁agent派单确认接口
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:17:56
 */
public class AlipayCommerceRentAgentTicketConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7541242478682566284L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 指派记录ID，来源于派单通知中的 assignment_id
	 */
	@ApiField("assignment_id")
	private String assignmentId;

	/**
	 * 执行结果，action 为 REJECT 或 FAIL 时必填
	 */
	@ApiField("result")
	private DisResInfo result;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAssignmentId() {
		return this.assignmentId;
	}
	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public DisResInfo getResult() {
		return this.result;
	}
	public void setResult(DisResInfo result) {
		this.result = result;
	}

}

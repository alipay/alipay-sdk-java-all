package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请单进度列表
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:49:09
 */
public class EcoApplySchedule extends AlipayObject {

	private static final long serialVersionUID = 2674656371791239375L;

	/**
	 * 批语
	 */
	@ApiField("audit_comment")
	private String auditComment;

	/**
	 * 审批时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("audit_time")
	private String auditTime;

	/**
	 * 编辑标识：0-不可编辑，1-可编辑，2-需重新提交。
	 */
	@ApiField("edit_flag")
	private Long editFlag;

	/**
	 * 申请单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 审批顺序
	 */
	@ApiField("order_num")
	private Long orderNum;

	/**
	 * 审批阶段状态编码如(1,2,3)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 审批阶段状态描述(审核中，通过，拒绝)
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 审批阶段编码
	 */
	@ApiField("step")
	private String step;

	/**
	 * 审批阶段描述如：初审，提交材料，市局审批，受理中心
	 */
	@ApiField("step_desc")
	private String stepDesc;

	public String getAuditComment() {
		return this.auditComment;
	}
	public void setAuditComment(String auditComment) {
		this.auditComment = auditComment;
	}

	public String getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	public Long getEditFlag() {
		return this.editFlag;
	}
	public void setEditFlag(Long editFlag) {
		this.editFlag = editFlag;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getStep() {
		return this.step;
	}
	public void setStep(String step) {
		this.step = step;
	}

	public String getStepDesc() {
		return this.stepDesc;
	}
	public void setStepDesc(String stepDesc) {
		this.stepDesc = stepDesc;
	}

}

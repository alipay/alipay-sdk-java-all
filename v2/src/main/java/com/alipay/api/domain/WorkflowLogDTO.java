package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批记录
 *
 * @author auto create
 * @since 1.0, 2023-08-18 11:12:50
 */
public class WorkflowLogDTO extends AlipayObject {

	private static final long serialVersionUID = 2125531285954969822L;

	/**
	 * 审批角色
	 */
	@ApiField("approval_role")
	private String approvalRole;

	/**
	 * 审批时间
	 */
	@ApiField("approve_time")
	private Date approveTime;

	/**
	 * 审批人
	 */
	@ApiField("approver")
	private PersonDTO approver;

	/**
	 * 审批附件
	 */
	@ApiListField("attachments")
	@ApiField("file_d_t_o")
	private List<FileDTO> attachments;

	/**
	 * 审批意见
	 */
	@ApiField("comments")
	private String comments;

	/**
	 * 审批动作
	 */
	@ApiField("operation")
	private String operation;

	public String getApprovalRole() {
		return this.approvalRole;
	}
	public void setApprovalRole(String approvalRole) {
		this.approvalRole = approvalRole;
	}

	public Date getApproveTime() {
		return this.approveTime;
	}
	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public PersonDTO getApprover() {
		return this.approver;
	}
	public void setApprover(PersonDTO approver) {
		this.approver = approver;
	}

	public List<FileDTO> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<FileDTO> attachments) {
		this.attachments = attachments;
	}

	public String getComments() {
		return this.comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}

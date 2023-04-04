package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批流程节点
 *
 * @author auto create
 * @since 1.0, 2022-12-07 17:08:16
 */
public class ApprovalFlowInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3387637689618472519L;

	/**
	 * 审批结果
	 */
	@ApiField("approve_status")
	private String approveStatus;

	/**
	 * 审批时间
	 */
	@ApiField("approve_time")
	private Date approveTime;

	/**
	 * 审批人域账号
	 */
	@ApiField("approver")
	private String approver;

	/**
	 * 审批流关联附件列表，list中的值为文件id，具有唯一性
	 */
	@ApiListField("attachement_list")
	@ApiField("create_e_sign_task_file_v_o")
	private List<CreateESignTaskFileVO> attachementList;

	/**
	 * 审批意见
	 */
	@ApiField("comments")
	private String comments;

	/**
	 * 流程审批节点编号
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 审批环节
	 */
	@ApiField("node")
	private String node;

	public String getApproveStatus() {
		return this.approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Date getApproveTime() {
		return this.approveTime;
	}
	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public String getApprover() {
		return this.approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}

	public List<CreateESignTaskFileVO> getAttachementList() {
		return this.attachementList;
	}
	public void setAttachementList(List<CreateESignTaskFileVO> attachementList) {
		this.attachementList = attachementList;
	}

	public String getComments() {
		return this.comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public String getNode() {
		return this.node;
	}
	public void setNode(String node) {
		this.node = node;
	}

}

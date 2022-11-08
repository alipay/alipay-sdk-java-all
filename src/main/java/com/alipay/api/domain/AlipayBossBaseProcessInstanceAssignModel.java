package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程转交
 *
 * @author auto create
 * @since 1.0, 2022-03-18 10:20:32
 */
public class AlipayBossBaseProcessInstanceAssignModel extends AlipayObject {

	private static final long serialVersionUID = 4186377522834463722L;

	/**
	 * 指派给谁(域账号)， assignee和assignee_work_no 二选一， assignee_work_no >assignee
	 */
	@ApiField("assignee")
	private String assignee;

	/**
	 * 指派给谁，工号(选填)
assignee和assignee_work_no 二选一， assignee_work_no >assignee
	 */
	@ApiField("assignee_work_no")
	private String assigneeWorkNo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 流程实例节点
	 */
	@ApiField("node")
	private String node;

	/**
	 * 处理人ID,若未填写，则认为是系统处理(选填)
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("pu_id")
	private String puId;

	/**
	 * 原任务处理人，普通任务留空，但若转交的是会签任务,则必填.仅将对应taskOperatorId的任务转交出去.且接收人只能是单人
	 */
	@ApiField("task_operator_id")
	private String taskOperatorId;

	public String getAssignee() {
		return this.assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getAssigneeWorkNo() {
		return this.assigneeWorkNo;
	}
	public void setAssigneeWorkNo(String assigneeWorkNo) {
		this.assigneeWorkNo = assigneeWorkNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNode() {
		return this.node;
	}
	public void setNode(String node) {
		this.node = node;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getPuId() {
		return this.puId;
	}
	public void setPuId(String puId) {
		this.puId = puId;
	}

	public String getTaskOperatorId() {
		return this.taskOperatorId;
	}
	public void setTaskOperatorId(String taskOperatorId) {
		this.taskOperatorId = taskOperatorId;
	}

}

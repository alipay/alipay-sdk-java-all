package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CPA任务转化回传
 *
 * @author auto create
 * @since 1.0, 2026-09-08 11:44:32
 */
public class AlipayEbppInstserviceCpaNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4317427656223567111L;

	/**
	 * 该值是CPA任务投放全链路进行唯一归因的标记。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * CPA子任务ID
	 */
	@ApiField("sub_task_id")
	private String subTaskId;

	/**
	 * CPA任务的完成节点，比如曝光，到访，点击等。
	 */
	@ApiField("task_node")
	private String taskNode;

	/**
	 * 任务完成的时间。
	 */
	@ApiField("task_node_finished")
	private Date taskNodeFinished;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getSubTaskId() {
		return this.subTaskId;
	}
	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}

	public String getTaskNode() {
		return this.taskNode;
	}
	public void setTaskNode(String taskNode) {
		this.taskNode = taskNode;
	}

	public Date getTaskNodeFinished() {
		return this.taskNodeFinished;
	}
	public void setTaskNodeFinished(Date taskNodeFinished) {
		this.taskNodeFinished = taskNodeFinished;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户任务信息详情
 *
 * @author auto create
 * @since 1.0, 2023-07-27 09:49:12
 */
public class QueryUserTaskListResponse extends AlipayObject {

	private static final long serialVersionUID = 1788758296472474717L;

	/**
	 * 用户下信用单生成的芝麻单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户创建活动时使用的奖品名
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品所对应的价格，单位元
	 */
	@ApiField("prize_price")
	private String prizePrice;

	/**
	 * 商户创建的任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 商户创建的活动名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务所对应的资金状态 INIT：初始化 WAIT_USER_CONFIRM：待用户确认扣款 PAYING：扣款中 PAYED：已扣款 NON_PAY：无需扣款
	 */
	@ApiField("task_pay_status")
	private String taskPayStatus;

	/**
	 * 用户的任务状态 NON_SIGN_UP：未报名 SIGN_UP：已报名 GOING：参与中 TIMEOUT：任务超期 DONE：任务结束
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 用户任务id
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizePrice() {
		return this.prizePrice;
	}
	public void setPrizePrice(String prizePrice) {
		this.prizePrice = prizePrice;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskPayStatus() {
		return this.taskPayStatus;
	}
	public void setTaskPayStatus(String taskPayStatus) {
		this.taskPayStatus = taskPayStatus;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

}

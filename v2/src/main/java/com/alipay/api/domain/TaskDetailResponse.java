package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务详情返回
 *
 * @author auto create
 * @since 1.0, 2023-11-27 18:48:20
 */
public class TaskDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 3569832695926851245L;

	/**
	 * 创建人id
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 创建人id
	 */
	@ApiField("creator_open_id")
	private String creatorOpenId;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 奖品信息返回值
	 */
	@ApiField("prize_response")
	private PrizeResponse prizeResponse;

	/**
	 * 二级商户appid
	 */
	@ApiField("second_merchant_appid")
	private String secondMerchantAppid;

	/**
	 * 任务条件
	 */
	@ApiField("task_condition")
	private String taskCondition;

	/**
	 * 任务合约周期(单位是月)
	 */
	@ApiField("task_contract_period")
	private String taskContractPeriod;

	/**
	 * 任务有效期结束
	 */
	@ApiField("task_end")
	private String taskEnd;

	/**
	 * 任务条件
	 */
	@ApiField("task_free")
	private String taskFree;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 参与任务的用户数量
	 */
	@ApiField("task_join_count")
	private Long taskJoinCount;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务有效期-开始
	 */
	@ApiField("task_start")
	private String taskStart;

	/**
	 * 任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	/**
	 * 任务标题
	 */
	@ApiField("task_title")
	private String taskTitle;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorOpenId() {
		return this.creatorOpenId;
	}
	public void setCreatorOpenId(String creatorOpenId) {
		this.creatorOpenId = creatorOpenId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public PrizeResponse getPrizeResponse() {
		return this.prizeResponse;
	}
	public void setPrizeResponse(PrizeResponse prizeResponse) {
		this.prizeResponse = prizeResponse;
	}

	public String getSecondMerchantAppid() {
		return this.secondMerchantAppid;
	}
	public void setSecondMerchantAppid(String secondMerchantAppid) {
		this.secondMerchantAppid = secondMerchantAppid;
	}

	public String getTaskCondition() {
		return this.taskCondition;
	}
	public void setTaskCondition(String taskCondition) {
		this.taskCondition = taskCondition;
	}

	public String getTaskContractPeriod() {
		return this.taskContractPeriod;
	}
	public void setTaskContractPeriod(String taskContractPeriod) {
		this.taskContractPeriod = taskContractPeriod;
	}

	public String getTaskEnd() {
		return this.taskEnd;
	}
	public void setTaskEnd(String taskEnd) {
		this.taskEnd = taskEnd;
	}

	public String getTaskFree() {
		return this.taskFree;
	}
	public void setTaskFree(String taskFree) {
		this.taskFree = taskFree;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Long getTaskJoinCount() {
		return this.taskJoinCount;
	}
	public void setTaskJoinCount(Long taskJoinCount) {
		this.taskJoinCount = taskJoinCount;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStart() {
		return this.taskStart;
	}
	public void setTaskStart(String taskStart) {
		this.taskStart = taskStart;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskTitle() {
		return this.taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}

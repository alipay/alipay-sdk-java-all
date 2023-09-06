package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PrizeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-28 14:41:43
 */
public class AlipayCommerceWaterTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5521848385876178281L;

	/** 
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 创建人
	 */
	@ApiField("creator_open_id")
	private String creatorOpenId;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 奖品信息
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
	 * 任务有效期-结束
	 */
	@ApiField("task_end")
	private String taskEnd;

	/** 
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 参与任务的用户数量
	 */
	@ApiField("task_join_count")
	private String taskJoinCount;

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

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setCreatorOpenId(String creatorOpenId) {
		this.creatorOpenId = creatorOpenId;
	}
	public String getCreatorOpenId( ) {
		return this.creatorOpenId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setPrizeResponse(PrizeResponse prizeResponse) {
		this.prizeResponse = prizeResponse;
	}
	public PrizeResponse getPrizeResponse( ) {
		return this.prizeResponse;
	}

	public void setSecondMerchantAppid(String secondMerchantAppid) {
		this.secondMerchantAppid = secondMerchantAppid;
	}
	public String getSecondMerchantAppid( ) {
		return this.secondMerchantAppid;
	}

	public void setTaskCondition(String taskCondition) {
		this.taskCondition = taskCondition;
	}
	public String getTaskCondition( ) {
		return this.taskCondition;
	}

	public void setTaskContractPeriod(String taskContractPeriod) {
		this.taskContractPeriod = taskContractPeriod;
	}
	public String getTaskContractPeriod( ) {
		return this.taskContractPeriod;
	}

	public void setTaskEnd(String taskEnd) {
		this.taskEnd = taskEnd;
	}
	public String getTaskEnd( ) {
		return this.taskEnd;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTaskJoinCount(String taskJoinCount) {
		this.taskJoinCount = taskJoinCount;
	}
	public String getTaskJoinCount( ) {
		return this.taskJoinCount;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName( ) {
		return this.taskName;
	}

	public void setTaskStart(String taskStart) {
		this.taskStart = taskStart;
	}
	public String getTaskStart( ) {
		return this.taskStart;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskTitle( ) {
		return this.taskTitle;
	}

}

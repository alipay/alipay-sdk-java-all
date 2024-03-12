package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.promotask.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-04 13:44:01
 */
public class AlipayMerchantIndirectPromotaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198794174369992959L;

	/** 
	 * 任务当前的进度完成值，当任务领取后返回数值
	 */
	@ApiField("curent_cnt")
	private Long curentCnt;

	/** 
	 * 任务结束时间，商家领取的任务存在一定的有效期，该时间即为有效期截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 任务过期日期 (商户任务报名通过后，生成的任务存在一定的有效期)。当任务领取后才会存在任务过期。
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 任务完成时间，当任务未完成时该字段为空
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 针对统一商户下多个smid账号集合的定义
	 */
	@ApiField("group_mid")
	private String groupMid;

	/** 
	 * 商户权益申领提交时间(商户提报自己的申领账号)
	 */
	@ApiField("reward_apply_time")
	private Date rewardApplyTime;

	/** 
	 * 活动关联的权益类型编码
	 */
	@ApiField("reward_code")
	private String rewardCode;

	/** 
	 * 任务权益的描述介绍
	 */
	@ApiField("reward_desc")
	private String rewardDesc;

	/** 
	 * 任务领取时间
	 */
	@ApiField("take_time")
	private Date takeTime;

	/** 
	 * 任务目标值
	 */
	@ApiField("target_cnt")
	private Long targetCnt;

	/** 
	 * 任务类型编码标识，用以区分不同类型的任务
	 */
	@ApiField("task_code")
	private String taskCode;

	/** 
	 * 商家在任务报名通过后生成的唯一任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	/** 
	 * 任务状态
	 */
	@ApiField("task_state")
	private String taskState;

	public void setCurentCnt(Long curentCnt) {
		this.curentCnt = curentCnt;
	}
	public Long getCurentCnt( ) {
		return this.curentCnt;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getFinishTime( ) {
		return this.finishTime;
	}

	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}
	public String getGroupMid( ) {
		return this.groupMid;
	}

	public void setRewardApplyTime(Date rewardApplyTime) {
		this.rewardApplyTime = rewardApplyTime;
	}
	public Date getRewardApplyTime( ) {
		return this.rewardApplyTime;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}
	public String getRewardCode( ) {
		return this.rewardCode;
	}

	public void setRewardDesc(String rewardDesc) {
		this.rewardDesc = rewardDesc;
	}
	public String getRewardDesc( ) {
		return this.rewardDesc;
	}

	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}
	public Date getTakeTime( ) {
		return this.takeTime;
	}

	public void setTargetCnt(Long targetCnt) {
		this.targetCnt = targetCnt;
	}
	public Long getTargetCnt( ) {
		return this.targetCnt;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}
	public String getTaskCode( ) {
		return this.taskCode;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}
	public String getTaskState( ) {
		return this.taskState;
	}

}

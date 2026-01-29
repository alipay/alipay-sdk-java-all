package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连营销任务
 *
 * @author auto create
 * @since 1.0, 2023-04-04 11:42:21
 */
public class IndirectPromoTask extends AlipayObject {

	private static final long serialVersionUID = 5137766436924193537L;

	/**
	 * 任务当前完成进度值
	 */
	@ApiField("curent_cnt")
	private Long curentCnt;

	/**
	 * 任务结束时间，商家领取的任务存在一定的有效期，该时间即为有效期截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 任务过期日期 (商户任务报名通过后，生成的任务存在一定的有效期)
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 任务完成时间。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 商户账号组ID，平台侧对同一商户下多个smid账号的结合定义
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
	 * 商户完成任务后获得的权益描述介绍
	 */
	@ApiField("reward_desc")
	private String rewardDesc;

	/**
	 * 服务商账号对应的2088
	 */
	@ApiField("source_pid")
	private String sourcePid;

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
	 * 营销任务编码，用以区分任务类型
	 */
	@ApiField("task_code")
	private String taskCode;

	/**
	 * 营销任务ID，用以区分商户领取的任务实例
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务状态
	 */
	@ApiField("task_state")
	private String taskState;

	public Long getCurentCnt() {
		return this.curentCnt;
	}
	public void setCurentCnt(Long curentCnt) {
		this.curentCnt = curentCnt;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public String getGroupMid() {
		return this.groupMid;
	}
	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public Date getRewardApplyTime() {
		return this.rewardApplyTime;
	}
	public void setRewardApplyTime(Date rewardApplyTime) {
		this.rewardApplyTime = rewardApplyTime;
	}

	public String getRewardCode() {
		return this.rewardCode;
	}
	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getRewardDesc() {
		return this.rewardDesc;
	}
	public void setRewardDesc(String rewardDesc) {
		this.rewardDesc = rewardDesc;
	}

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

	public Date getTakeTime() {
		return this.takeTime;
	}
	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}

	public Long getTargetCnt() {
		return this.targetCnt;
	}
	public void setTargetCnt(Long targetCnt) {
		this.targetCnt = targetCnt;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskState() {
		return this.taskState;
	}
	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

}

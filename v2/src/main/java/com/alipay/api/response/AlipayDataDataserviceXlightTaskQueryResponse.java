package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.xlight.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-26 11:52:08
 */
public class AlipayDataDataserviceXlightTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6316321988979687345L;

	/** 
	 * 任务完成时间，任务已完成则会返回该字段
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 任务完成状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 单位为人民币分，task_reward_amount=2代表2分钱。这个字段与广告检索接口返回的taskRewardAmount字段值一致
	 */
	@ApiField("task_reward_amount")
	private String taskRewardAmount;

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getFinishTime( ) {
		return this.finishTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskRewardAmount(String taskRewardAmount) {
		this.taskRewardAmount = taskRewardAmount;
	}
	public String getTaskRewardAmount( ) {
		return this.taskRewardAmount;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.unionmember.task.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 09:47:02
 */
public class AlipayEcoMycarUnionmemberTaskCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 4719469121648193259L;

	/** 
	 * 回传处理完成后实际的发奖状态
	 */
	@ApiField("award_status")
	private String awardStatus;

	/** 
	 * 回传处理成功后实际的任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setAwardStatus(String awardStatus) {
		this.awardStatus = awardStatus;
	}
	public String getAwardStatus( ) {
		return this.awardStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.task.receive response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 12:02:23
 */
public class AlipayCommerceAcommunicationTaskReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2835138335417236585L;

	/** 
	 * 真实发放积分,单位为个
	 */
	@ApiField("point")
	private Long point;

	/** 
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint( ) {
		return this.point;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}

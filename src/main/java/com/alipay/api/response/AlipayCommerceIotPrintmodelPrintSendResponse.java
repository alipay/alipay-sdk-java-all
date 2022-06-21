package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.printmodel.print.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-09 15:07:34
 */
public class AlipayCommerceIotPrintmodelPrintSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8759835245398483716L;

	/** 
	 * 调用任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}

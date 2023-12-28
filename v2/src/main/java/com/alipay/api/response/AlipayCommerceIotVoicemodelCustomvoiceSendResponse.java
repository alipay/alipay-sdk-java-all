package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.voicemodel.customvoice.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-05 14:48:35
 */
public class AlipayCommerceIotVoicemodelCustomvoiceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4111166923863166533L;

	/** 
	 * 调用的任务id
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.voicemodel.syncvoice.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:12
 */
public class AlipayCommerceIotVoicemodelSyncvoiceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7725442225223887856L;

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

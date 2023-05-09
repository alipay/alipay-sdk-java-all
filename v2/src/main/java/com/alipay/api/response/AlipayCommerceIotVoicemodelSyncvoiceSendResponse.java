package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.voicemodel.syncvoice.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:14:34
 */
public class AlipayCommerceIotVoicemodelSyncvoiceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876932861883165854L;

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

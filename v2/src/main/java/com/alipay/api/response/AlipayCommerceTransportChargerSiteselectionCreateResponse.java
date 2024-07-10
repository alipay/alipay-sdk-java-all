package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.siteselection.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-25 09:42:03
 */
public class AlipayCommerceTransportChargerSiteselectionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1399978858582159314L;

	/** 
	 * 任务编号
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

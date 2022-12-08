package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.risktask.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:31:42
 */
public class AlipaySecurityProdRisktaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2648269473983775993L;

	/** 
	 * 成功创建的审理任务ID
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.risktask.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 23:14:30
 */
public class AlipaySecurityProdRisktaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5878284811334443993L;

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

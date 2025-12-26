package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.temp.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:07:41
 */
public class AlipayOpenSpNcoilopenTempSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5425222733157583955L;

	/** 
	 * 提交后，会生成一个唯一id，用于后续创单
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

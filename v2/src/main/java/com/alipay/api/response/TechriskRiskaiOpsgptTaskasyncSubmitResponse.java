package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AsyncSubmitTaskResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.riskai.opsgpt.taskasync.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 09:57:09
 */
public class TechriskRiskaiOpsgptTaskasyncSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2241365427977386368L;

	/** 
	 * 返回任务提交的结果，主要是任务id，用于后续用户使用该id情况
	 */
	@ApiField("response")
	private AsyncSubmitTaskResponse response;

	public void setResponse(AsyncSubmitTaskResponse response) {
		this.response = response;
	}
	public AsyncSubmitTaskResponse getResponse( ) {
		return this.response;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResponseMsg;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.riskai.opsgpt.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:42:36
 */
public class TechriskRiskaiOpsgptTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5639893825181654436L;

	/** 
	 * 模型输出的结果响应。
	 */
	@ApiField("response")
	private ResponseMsg response;

	public void setResponse(ResponseMsg response) {
		this.response = response;
	}
	public ResponseMsg getResponse( ) {
		return this.response;
	}

}

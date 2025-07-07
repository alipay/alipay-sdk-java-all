package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResponseMsg;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.riskai.opsgpt.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 09:55:30
 */
public class TechriskRiskaiOpsgptTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3223798479614648278L;

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

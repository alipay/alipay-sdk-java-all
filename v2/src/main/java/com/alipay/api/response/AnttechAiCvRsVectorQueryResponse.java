package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.vector.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 14:41:56
 */
public class AnttechAiCvRsVectorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3859187937513133783L;

	/** 
	 * 碳汇地块信息
	 */
	@ApiField("vector_result")
	private String vectorResult;

	public void setVectorResult(String vectorResult) {
		this.vectorResult = vectorResult;
	}
	public String getVectorResult( ) {
		return this.vectorResult;
	}

}

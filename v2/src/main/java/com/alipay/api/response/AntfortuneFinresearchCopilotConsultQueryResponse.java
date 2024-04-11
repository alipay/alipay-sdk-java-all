package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.copilot.consult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:59
 */
public class AntfortuneFinresearchCopilotConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1844945413748458687L;

	/** 
	 * 咨询结果
	 */
	@ApiField("consult_result")
	private String consultResult;

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

}

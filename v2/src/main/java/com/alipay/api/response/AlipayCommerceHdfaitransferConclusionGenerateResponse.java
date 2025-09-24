package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdfaitransfer.conclusion.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 14:32:30
 */
public class AlipayCommerceHdfaitransferConclusionGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4893664178845311161L;

	/** 
	 * 问诊总结结果
	 */
	@ApiField("conclusion_summary")
	private String conclusionSummary;

	public void setConclusionSummary(String conclusionSummary) {
		this.conclusionSummary = conclusionSummary;
	}
	public String getConclusionSummary( ) {
		return this.conclusionSummary;
	}

}

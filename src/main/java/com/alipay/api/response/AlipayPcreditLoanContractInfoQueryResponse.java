package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.contract.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-15 16:00:00
 */
public class AlipayPcreditLoanContractInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7689829265466324599L;

	/** 
	 * 合同内容
	 */
	@ApiField("content")
	private String content;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

}

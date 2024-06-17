package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.contract.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:59:04
 */
public class AlipayPcreditLoanContractInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1725526893468132132L;

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

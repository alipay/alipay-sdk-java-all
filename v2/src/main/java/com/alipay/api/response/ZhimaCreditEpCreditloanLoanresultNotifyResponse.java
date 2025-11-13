package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.loanresult.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-20 14:36:59
 */
public class ZhimaCreditEpCreditloanLoanresultNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3231593158316669175L;

	/** 
	 * 返回结果。结构视financial_code的不同而定
	 */
	@ApiField("result_content")
	private String resultContent;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.selfcert.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 11:32:28
 */
public class ZhimaCreditEpCreditloanSelfcertNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5726265798242811121L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.repayresult.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-20 11:21:57
 */
public class ZhimaCreditEpCreditloanRepayresultNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2869241738632531593L;

	/** 
	 * 返回结果。结构视data_type的不同而定
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

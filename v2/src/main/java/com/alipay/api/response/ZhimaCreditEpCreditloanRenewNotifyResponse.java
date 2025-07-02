package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.renew.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 10:27:19
 */
public class ZhimaCreditEpCreditloanRenewNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8635499893265111357L;

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

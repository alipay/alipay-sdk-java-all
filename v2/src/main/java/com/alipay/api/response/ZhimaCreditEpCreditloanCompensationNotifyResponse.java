package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.compensation.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-25 20:42:32
 */
public class ZhimaCreditEpCreditloanCompensationNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2878532379266445427L;

	/** 
	 * 返回结果
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

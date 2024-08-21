package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.finlease.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:40
 */
public class MybankCreditLoanapplyFinleaseSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4846973482555557419L;

	/** 
	 * 签约结果。json字符串
	 */
	@ApiField("msg_content")
	private String msgContent;

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgContent( ) {
		return this.msgContent;
	}

}

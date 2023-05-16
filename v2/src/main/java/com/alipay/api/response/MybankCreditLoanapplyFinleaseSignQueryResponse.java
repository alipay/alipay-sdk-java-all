package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.finlease.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:46:51
 */
public class MybankCreditLoanapplyFinleaseSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8319975735633327275L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.finlease.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:22:00
 */
public class MybankCreditLoanapplyFinleaseSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4238464984994428183L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.prodarrangement.contracttext.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:12:47
 */
public class MybankCreditProdarrangementContracttextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6741461331524465168L;

	/** 
	 * 合同内容
	 */
	@ApiField("text")
	private String text;

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}

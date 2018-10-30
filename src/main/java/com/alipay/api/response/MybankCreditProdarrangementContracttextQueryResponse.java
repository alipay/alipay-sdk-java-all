package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.prodarrangement.contracttext.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-23 18:58:45
 */
public class MybankCreditProdarrangementContracttextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4126115165748771833L;

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

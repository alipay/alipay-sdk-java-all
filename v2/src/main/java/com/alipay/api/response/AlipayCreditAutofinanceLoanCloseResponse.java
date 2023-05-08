package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.loan.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:36:01
 */
public class AlipayCreditAutofinanceLoanCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4872733671835586254L;

	/** 
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}
	public String getOutorderno( ) {
		return this.outorderno;
	}

}

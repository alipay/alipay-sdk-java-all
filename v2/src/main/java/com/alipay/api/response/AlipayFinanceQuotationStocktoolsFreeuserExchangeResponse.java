package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.stocktools.freeuser.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinanceQuotationStocktoolsFreeuserExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7865354997562861659L;

	/** 
	 * 领取成功/失败，此处为false时，或者接口本身报错时，均意味着失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}

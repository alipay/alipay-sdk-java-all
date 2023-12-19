package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:46:44
 */
public class AlipayFundAccountInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8859265883369614577L;

	/** 
	 * 是否允许余额支付
	 */
	@ApiField("enable_payment")
	private Boolean enablePayment;

	public void setEnablePayment(Boolean enablePayment) {
		this.enablePayment = enablePayment;
	}
	public Boolean getEnablePayment( ) {
		return this.enablePayment;
	}

}

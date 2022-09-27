package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invitetask.exchange.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-21 18:11:14
 */
public class AlipayUserInvitetaskExchangeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8147919679874427976L;

	/** 
	 * true--有兑换资格
false--无兑换资格
	 */
	@ApiField("consult_result")
	private Boolean consultResult;

	public void setConsultResult(Boolean consultResult) {
		this.consultResult = consultResult;
	}
	public Boolean getConsultResult( ) {
		return this.consultResult;
	}

}

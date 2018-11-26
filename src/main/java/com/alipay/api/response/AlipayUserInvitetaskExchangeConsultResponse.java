package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invitetask.exchange.consult response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-20 16:15:00
 */
public class AlipayUserInvitetaskExchangeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2325521482959512741L;

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

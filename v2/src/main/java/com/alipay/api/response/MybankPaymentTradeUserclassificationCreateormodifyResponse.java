package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.userclassification.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class MybankPaymentTradeUserclassificationCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8751138222438817467L;

	/** 
	 * 打标结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

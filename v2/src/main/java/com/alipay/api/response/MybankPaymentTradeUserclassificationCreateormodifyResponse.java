package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.userclassification.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:26:50
 */
public class MybankPaymentTradeUserclassificationCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6814969554921887935L;

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

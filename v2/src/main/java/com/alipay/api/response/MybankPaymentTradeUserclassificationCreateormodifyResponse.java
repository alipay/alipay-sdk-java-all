package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.userclassification.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 17:51:44
 */
public class MybankPaymentTradeUserclassificationCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7128396451427689381L;

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

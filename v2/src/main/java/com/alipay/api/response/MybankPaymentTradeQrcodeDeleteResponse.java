package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.qrcode.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:57:22
 */
public class MybankPaymentTradeQrcodeDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5623565634335389335L;

	/** 
	 * true:失效成功 false:失效失败
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.qrcode.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:15:19
 */
public class MybankPaymentTradeQrcodeDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3528611956425169967L;

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

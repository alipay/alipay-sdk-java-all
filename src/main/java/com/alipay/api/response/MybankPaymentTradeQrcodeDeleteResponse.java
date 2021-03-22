package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.qrcode.delete response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-31 19:36:46
 */
public class MybankPaymentTradeQrcodeDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6865678583178519316L;

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

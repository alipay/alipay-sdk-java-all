package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.instantdelivery.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:15:15
 */
public class AlipayCommerceLogisticsOrderInstantdeliveryCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6728782617137226637L;

	/** 
	 * 取消金额
	 */
	@ApiField("cancel_fee")
	private String cancelFee;

	public void setCancelFee(String cancelFee) {
		this.cancelFee = cancelFee;
	}
	public String getCancelFee( ) {
		return this.cancelFee;
	}

}

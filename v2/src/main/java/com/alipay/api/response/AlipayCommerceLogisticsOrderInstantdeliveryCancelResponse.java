package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.instantdelivery.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 03:42:40
 */
public class AlipayCommerceLogisticsOrderInstantdeliveryCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5546258769628691118L;

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

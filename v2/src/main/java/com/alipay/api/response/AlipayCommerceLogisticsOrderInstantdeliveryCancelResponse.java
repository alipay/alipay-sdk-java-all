package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.instantdelivery.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:01:59
 */
public class AlipayCommerceLogisticsOrderInstantdeliveryCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 3477995319848439372L;

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

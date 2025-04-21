package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.instantdelivery.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 10:20:29
 */
public class AlipayCommerceLogisticsOrderInstantdeliveryCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1518352375676591772L;

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

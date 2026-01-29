package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.zftforc.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-23 11:42:43
 */
public class AlipayMerchantIndirectZftforcCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5182828731387335295L;

	/** 
	 * 撤销状态
	 */
	@ApiField("cancel")
	private Boolean cancel;

	/** 
	 * 直付通c2c申请单
	 */
	@ApiField("order_id")
	private String orderId;

	public void setCancel(Boolean cancel) {
		this.cancel = cancel;
	}
	public Boolean getCancel( ) {
		return this.cancel;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}

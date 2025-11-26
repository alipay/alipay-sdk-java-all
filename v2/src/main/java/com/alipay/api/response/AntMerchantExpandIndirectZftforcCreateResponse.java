package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zftforc.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 16:17:41
 */
public class AntMerchantExpandIndirectZftforcCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2865373146349497342L;

	/** 
	 * 跳转地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}

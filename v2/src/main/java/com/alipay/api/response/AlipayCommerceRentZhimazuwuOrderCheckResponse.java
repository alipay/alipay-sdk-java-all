package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.zhimazuwu.order.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-05 10:27:36
 */
public class AlipayCommerceRentZhimazuwuOrderCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3278734528465326477L;

	/** 
	 * 是否是放心发订单
	 */
	@ApiField("free_to_send_scene")
	private String freeToSendScene;

	public void setFreeToSendScene(String freeToSendScene) {
		this.freeToSendScene = freeToSendScene;
	}
	public String getFreeToSendScene( ) {
		return this.freeToSendScene;
	}

}

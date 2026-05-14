package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.channelpoi.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-09 00:05:21
 */
public class AntMerchantExpandChannelpoiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6323354177289533726L;

	/** 
	 * 申请单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 进件所属阶段
	 */
	@ApiField("progress")
	private String progress;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getProgress( ) {
		return this.progress;
	}

}

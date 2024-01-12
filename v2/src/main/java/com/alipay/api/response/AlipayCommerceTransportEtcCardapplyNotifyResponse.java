package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.cardapply.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:46:48
 */
public class AlipayCommerceTransportEtcCardapplyNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5467383275647557194L;

	/** 
	 * 通知结果，返回支付宝是否接收成功
	 */
	@ApiField("notify_result")
	private Boolean notifyResult;

	public void setNotifyResult(Boolean notifyResult) {
		this.notifyResult = notifyResult;
	}
	public Boolean getNotifyResult( ) {
		return this.notifyResult;
	}

}

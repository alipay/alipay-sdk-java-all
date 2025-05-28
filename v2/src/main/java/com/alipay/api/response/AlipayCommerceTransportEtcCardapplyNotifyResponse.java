package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.cardapply.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 18:43:41
 */
public class AlipayCommerceTransportEtcCardapplyNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6739946799122327277L;

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

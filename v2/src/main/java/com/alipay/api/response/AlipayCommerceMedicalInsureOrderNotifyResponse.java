package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insure.order.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 17:47:33
 */
public class AlipayCommerceMedicalInsureOrderNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8782982662937265765L;

	/** 
	 * 通知描述
	 */
	@ApiField("notify_result")
	private String notifyResult;

	public void setNotifyResult(String notifyResult) {
		this.notifyResult = notifyResult;
	}
	public String getNotifyResult( ) {
		return this.notifyResult;
	}

}

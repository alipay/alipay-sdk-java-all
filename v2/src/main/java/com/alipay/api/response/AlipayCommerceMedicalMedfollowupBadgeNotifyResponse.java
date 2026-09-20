package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medfollowup.badge.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-08 16:37:54
 */
public class AlipayCommerceMedicalMedfollowupBadgeNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5238183749333924181L;

	/** 
	 * 通知
	 */
	@ApiField("notify")
	private String notify;

	public void setNotify(String notify) {
		this.notify = notify;
	}
	public String getNotify( ) {
		return this.notify;
	}

}

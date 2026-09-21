package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.broadcast.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-17 10:37:54
 */
public class AlipayCommerceMedicalReportBroadcastNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7538383427717167264L;

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

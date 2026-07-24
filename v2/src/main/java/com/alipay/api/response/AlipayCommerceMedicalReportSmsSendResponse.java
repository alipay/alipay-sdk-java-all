package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.sms.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-29 14:42:55
 */
public class AlipayCommerceMedicalReportSmsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8238873968392134948L;

	/** 
	 * 短信是否发送
	 */
	@ApiField("sms_sent")
	private Boolean smsSent;

	public void setSmsSent(Boolean smsSent) {
		this.smsSent = smsSent;
	}
	public Boolean getSmsSent( ) {
		return this.smsSent;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.sms.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 15:52:23
 */
public class AlipayCommerceMedicalReportSmsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2859631285598324542L;

	/** 
	 * 分发统一业务号。未传时自动生成。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 短信是否发送
	 */
	@ApiField("sms_sent")
	private Boolean smsSent;

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setSmsSent(Boolean smsSent) {
		this.smsSent = smsSent;
	}
	public Boolean getSmsSent( ) {
		return this.smsSent;
	}

}

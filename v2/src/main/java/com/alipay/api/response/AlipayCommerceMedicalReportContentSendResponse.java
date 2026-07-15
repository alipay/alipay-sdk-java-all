package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.content.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 13:35:58
 */
public class AlipayCommerceMedicalReportContentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7614565895518527974L;

	/** 
	 * 返回的数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}

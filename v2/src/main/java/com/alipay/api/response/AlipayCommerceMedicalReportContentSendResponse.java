package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.content.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 19:27:57
 */
public class AlipayCommerceMedicalReportContentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4754538771198465161L;

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

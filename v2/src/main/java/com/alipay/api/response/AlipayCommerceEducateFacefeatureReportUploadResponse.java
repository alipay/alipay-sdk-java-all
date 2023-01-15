package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.report.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:40:00
 */
public class AlipayCommerceEducateFacefeatureReportUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3269418774339711498L;

	/** 
	 * 上报成功失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}

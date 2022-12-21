package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.report.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:46:52
 */
public class AlipayCommerceEducateFacefeatureReportUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2281925365713478574L;

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

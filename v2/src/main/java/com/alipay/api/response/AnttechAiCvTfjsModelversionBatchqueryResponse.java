package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.modelversion.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:30:12
 */
public class AnttechAiCvTfjsModelversionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8391829981563175884L;

	/** 
	 * jsonString，不涉及商户敏感信息
	 */
	@ApiField("model_version")
	private String modelVersion;

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getModelVersion( ) {
		return this.modelVersion;
	}

}

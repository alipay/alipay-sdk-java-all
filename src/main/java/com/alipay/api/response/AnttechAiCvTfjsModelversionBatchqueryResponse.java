package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.modelversion.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-26 20:47:25
 */
public class AnttechAiCvTfjsModelversionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5723256753256915476L;

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

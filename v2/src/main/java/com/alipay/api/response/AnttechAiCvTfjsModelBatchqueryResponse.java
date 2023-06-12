package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.model.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:43:31
 */
public class AnttechAiCvTfjsModelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6669257337946356712L;

	/** 
	 * jsonString内容，不涉及商户敏感信息
	 */
	@ApiField("model_info")
	private String modelInfo;

	public void setModelInfo(String modelInfo) {
		this.modelInfo = modelInfo;
	}
	public String getModelInfo( ) {
		return this.modelInfo;
	}

}

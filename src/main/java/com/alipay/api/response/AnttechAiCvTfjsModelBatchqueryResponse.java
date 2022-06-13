package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.model.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-26 20:46:14
 */
public class AnttechAiCvTfjsModelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6156211584538842416L;

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

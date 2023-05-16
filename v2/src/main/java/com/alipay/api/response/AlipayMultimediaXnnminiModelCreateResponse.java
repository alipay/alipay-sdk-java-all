package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.xnnmini.model.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:21:54
 */
public class AlipayMultimediaXnnminiModelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2772742397513967737L;

	/** 
	 * 模型id
	 */
	@ApiField("model_id")
	private String modelId;

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getModelId( ) {
		return this.modelId;
	}

}

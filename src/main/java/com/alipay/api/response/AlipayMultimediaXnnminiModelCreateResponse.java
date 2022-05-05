package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.xnnmini.model.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-19 16:07:27
 */
public class AlipayMultimediaXnnminiModelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4163112165547376384L;

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

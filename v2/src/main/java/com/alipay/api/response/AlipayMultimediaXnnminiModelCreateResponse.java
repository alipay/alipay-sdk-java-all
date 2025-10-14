package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.multimedia.xnnmini.model.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayMultimediaXnnminiModelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5464281893525716136L;

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

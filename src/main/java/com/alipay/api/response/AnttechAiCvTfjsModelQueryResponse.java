package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-12 10:40:29
 */
public class AnttechAiCvTfjsModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7524491242961221467L;

	/** 
	 * tfjs端模型bin文件下载url
	 */
	@ApiField("bin_url")
	private String binUrl;

	/** 
	 * tfjs端模型json文件下载url
	 */
	@ApiField("model_json_url")
	private String modelJsonUrl;

	public void setBinUrl(String binUrl) {
		this.binUrl = binUrl;
	}
	public String getBinUrl( ) {
		return this.binUrl;
	}

	public void setModelJsonUrl(String modelJsonUrl) {
		this.modelJsonUrl = modelJsonUrl;
	}
	public String getModelJsonUrl( ) {
		return this.modelJsonUrl;
	}

}

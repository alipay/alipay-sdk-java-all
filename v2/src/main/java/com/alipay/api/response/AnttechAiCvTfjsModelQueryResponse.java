package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.tfjs.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:14
 */
public class AnttechAiCvTfjsModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1282567739613611478L;

	/** 
	 * 已废弃
	 */
	@ApiField("bin_url")
	private String binUrl;

	/** 
	 * 模型bin文件的下载地址
	 */
	@ApiListField("bin_urls")
	@ApiField("string")
	private List<String> binUrls;

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

	public void setBinUrls(List<String> binUrls) {
		this.binUrls = binUrls;
	}
	public List<String> getBinUrls( ) {
		return this.binUrls;
	}

	public void setModelJsonUrl(String modelJsonUrl) {
		this.modelJsonUrl = modelJsonUrl;
	}
	public String getModelJsonUrl( ) {
		return this.modelJsonUrl;
	}

}

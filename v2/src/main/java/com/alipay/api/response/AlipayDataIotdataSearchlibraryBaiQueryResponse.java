package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.searchlibrary.bai.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:53:00
 */
public class AlipayDataIotdataSearchlibraryBaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1766881984295598378L;

	/** 
	 * 采用的模型以及版本说明
	 */
	@ApiField("model_info")
	private String modelInfo;

	/** 
	 * 重复列表，json list格式
	 */
	@ApiField("repeat_info")
	private String repeatInfo;

	/** 
	 * 相似度信息列表，json list格式
	 */
	@ApiField("similarity_info")
	private String similarityInfo;

	public void setModelInfo(String modelInfo) {
		this.modelInfo = modelInfo;
	}
	public String getModelInfo( ) {
		return this.modelInfo;
	}

	public void setRepeatInfo(String repeatInfo) {
		this.repeatInfo = repeatInfo;
	}
	public String getRepeatInfo( ) {
		return this.repeatInfo;
	}

	public void setSimilarityInfo(String similarityInfo) {
		this.similarityInfo = similarityInfo;
	}
	public String getSimilarityInfo( ) {
		return this.similarityInfo;
	}

}

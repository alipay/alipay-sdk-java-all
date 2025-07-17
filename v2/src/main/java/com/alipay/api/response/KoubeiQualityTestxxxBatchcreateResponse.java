package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.testxxx.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:05:06
 */
public class KoubeiQualityTestxxxBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4524145834594157891L;

	/** 
	 * 1
	 */
	@ApiField("oss_path")
	private String ossPath;

	/** 
	 * 1
	 */
	@ApiField("www")
	private String www;

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
	}
	public String getOssPath( ) {
		return this.ossPath;
	}

	public void setWww(String www) {
		this.www = www;
	}
	public String getWww( ) {
		return this.www;
	}

}

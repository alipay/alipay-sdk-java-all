package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.testxxx.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:02:37
 */
public class KoubeiQualityTestxxxBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3145649672243554418L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.nfctag.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:26
 */
public class AlipayCommercePropertyNfctagDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5726176791691731668L;

	/** 
	 * 下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

}

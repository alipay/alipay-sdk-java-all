package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.community.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-04 13:52:24
 */
public class AlipayCommerceHousingCommunityDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7468513467284853269L;

	/** 
	 * 下载链接
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

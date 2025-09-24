package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.community.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:29
 */
public class AlipayCommerceHousingCommunityDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8237626166519918544L;

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

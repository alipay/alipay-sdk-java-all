package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.invoice.summary.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:47:37
 */
public class AlipayFundInvoiceSummaryDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6217194453151765872L;

	/** 
	 * 文件下载地址
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

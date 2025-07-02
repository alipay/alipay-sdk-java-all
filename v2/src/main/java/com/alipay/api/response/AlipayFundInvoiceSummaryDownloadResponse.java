package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.invoice.summary.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-16 15:41:09
 */
public class AlipayFundInvoiceSummaryDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7491166289381657779L;

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

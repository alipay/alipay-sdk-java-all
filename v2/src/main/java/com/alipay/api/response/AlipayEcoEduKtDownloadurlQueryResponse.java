package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:12:43
 */
public class AlipayEcoEduKtDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7344987977136285975L;

	/** 
	 * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}

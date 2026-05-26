package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.equity.billdownload.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-20 10:22:45
 */
public class AnttechMorseMarketingEquityBilldownloadQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4348769389369798576L;

	/** 
	 * 下载时直接请求该链接，当前链接有30s失效，若链接失效，再次请求活动账单查询接口获取新链接请求即可
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}
	public String getFileDownloadUrl( ) {
		return this.fileDownloadUrl;
	}

}

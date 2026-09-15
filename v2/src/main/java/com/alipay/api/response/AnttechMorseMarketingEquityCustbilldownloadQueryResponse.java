package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.equity.custbilldownload.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 16:27:48
 */
public class AnttechMorseMarketingEquityCustbilldownloadQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5143211941745157473L;

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

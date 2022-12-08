package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 18:46:41
 */
public class AlipayDataDataserviceBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7232146568823986985L;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:18:09
 */
public class KoubeiTradeBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1284749173582541145L;

	/** 
	 * 账单下载地址
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

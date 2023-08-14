package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:19:04
 */
public class KoubeiTradeBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1864699619975842774L;

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

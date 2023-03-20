package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:14:50
 */
public class KoubeiTradeBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3241415699575498979L;

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

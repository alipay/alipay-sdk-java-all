package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-19 11:38:24
 */
public class KoubeiTradeBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8126452317816536592L;

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

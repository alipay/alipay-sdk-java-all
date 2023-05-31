package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:06:54
 */
public class AlipayCommerceEcBalanceDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5798522686336421114L;

	/** 
	 * 对账单下载地址链接
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

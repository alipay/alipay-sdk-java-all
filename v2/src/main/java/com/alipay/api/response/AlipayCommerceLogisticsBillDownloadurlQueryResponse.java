package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.bill.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-14 15:42:53
 */
public class AlipayCommerceLogisticsBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8825968882725711153L;

	/** 
	 * 当账单可获取时，返回账单下载地址链接，获取链接后300秒后未下载，链接地址失效。
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

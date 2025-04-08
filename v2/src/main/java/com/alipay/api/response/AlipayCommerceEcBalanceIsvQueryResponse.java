package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.isv.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-04 13:36:13
 */
public class AlipayCommerceEcBalanceIsvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7465953336534519856L;

	/** 
	 * 对账单下载地址链接，获取连接后3分钟后未下载，链接地址失效。
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.activitybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-13 11:52:22
 */
public class AlipayUserDtbankActivitybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8758833279417866826L;

	/** 
	 * 账单下载链接
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

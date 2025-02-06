package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.activitybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-23 11:07:23
 */
public class AlipayUserDtbankActivitybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2526381768488248559L;

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

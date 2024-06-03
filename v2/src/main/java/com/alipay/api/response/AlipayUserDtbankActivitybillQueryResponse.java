package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.activitybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:41:57
 */
public class AlipayUserDtbankActivitybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2272134573964186271L;

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

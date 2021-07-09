package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.bill.download response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 10:35:32
 */
public class KoubeiMarketingDataActivityBillDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5148146728385629574L;

	/** 
	 * 账单下载地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}

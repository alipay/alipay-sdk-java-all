package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 12:02:03
 */
public class AnttechBlockchainFinanceFsupvBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7731772421174317964L;

	/** 
	 * 对账单下载地址，请在有效时间内完成下载。
默认有效时间10分钟
	 */
	@ApiField("download_url")
	private String downloadUrl;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

}

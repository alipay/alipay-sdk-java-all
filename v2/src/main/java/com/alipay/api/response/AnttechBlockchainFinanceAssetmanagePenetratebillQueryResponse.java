package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.assetmanage.penetratebill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-16 17:14:40
 */
public class AnttechBlockchainFinanceAssetmanagePenetratebillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5824663744677751188L;

	/** 
	 * 账单下载地址
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

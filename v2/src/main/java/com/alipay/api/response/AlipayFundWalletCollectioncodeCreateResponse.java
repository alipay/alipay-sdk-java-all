package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.collectioncode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-26 11:13:02
 */
public class AlipayFundWalletCollectioncodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2835491771741133251L;

	/** 
	 * 获取的收款二维码跳转地址
	 */
	@ApiField("collection_code_url")
	private String collectionCodeUrl;

	public void setCollectionCodeUrl(String collectionCodeUrl) {
		this.collectionCodeUrl = collectionCodeUrl;
	}
	public String getCollectionCodeUrl( ) {
		return this.collectionCodeUrl;
	}

}

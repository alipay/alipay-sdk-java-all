package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:25
 */
public class AnttechNftSkuLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8265923192973149754L;

	/** 
	 * 藏品标颜色
	 */
	@ApiField("sku_label_color")
	private String skuLabelColor;

	public void setSkuLabelColor(String skuLabelColor) {
		this.skuLabelColor = skuLabelColor;
	}
	public String getSkuLabelColor( ) {
		return this.skuLabelColor;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.product.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-20 10:28:01
 */
public class AlipayAipayNowpayProductModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8693366289738421527L;

	/** 
	 * 新简短描述
	 */
	@ApiField("product_description")
	private String productDescription;

	/** 
	 * 新图标地址
	 */
	@ApiField("product_icon_url")
	private String productIconUrl;

	/** 
	 * 新商品名称
	 */
	@ApiField("product_name")
	private String productName;

	/** 
	 * 新商品详情地址
	 */
	@ApiField("product_url")
	private String productUrl;

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductDescription( ) {
		return this.productDescription;
	}

	public void setProductIconUrl(String productIconUrl) {
		this.productIconUrl = productIconUrl;
	}
	public String getProductIconUrl( ) {
		return this.productIconUrl;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName( ) {
		return this.productName;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public String getProductUrl( ) {
		return this.productUrl;
	}

}

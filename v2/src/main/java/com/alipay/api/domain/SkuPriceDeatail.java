package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品价格
 *
 * @author auto create
 * @since 1.0, 2025-04-14 15:47:11
 */
public class SkuPriceDeatail extends AlipayObject {

	private static final long serialVersionUID = 4898562587387846466L;

	/**
	 * 价格，单位元。币种 ：人民币。
	 */
	@ApiField("price")
	private String price;

	/**
	 * OMS厂商sku编码, 厂商自行维护
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库存
 *
 * @author auto create
 * @since 1.0, 2024-08-29 14:18:05
 */
public class SkuStockDetail extends AlipayObject {

	private static final long serialVersionUID = 3672369674643528652L;

	/**
	 * 商品编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 库存数
	 */
	@ApiField("stock")
	private Long stock;

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Long getStock() {
		return this.stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}

}

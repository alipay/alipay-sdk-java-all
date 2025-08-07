package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品单信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:32:44
 */
public class ItemOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 8828499354821586642L;

	/**
	 * 商品原价，单位元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品现价，即商品售价，单位为元，精确到小数点后两位
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}

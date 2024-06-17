package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品基本信息
 *
 * @author auto create
 * @since 1.0, 2022-12-22 09:38:55
 */
public class LightPosOrderSku extends AlipayObject {

	private static final long serialVersionUID = 1495389293379574838L;

	/**
	 * 单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品的价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品的数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}

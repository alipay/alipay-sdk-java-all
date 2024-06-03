package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店插件开放下单商品
 *
 * @author auto create
 * @since 1.0, 2020-02-29 10:41:10
 */
public class StoreOrderGood extends AlipayObject {

	private static final long serialVersionUID = 6585257967722319989L;

	/**
	 * 商品的ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 规格的ID
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

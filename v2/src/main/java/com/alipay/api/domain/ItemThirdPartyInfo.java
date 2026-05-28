package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 14:07:42
 */
public class ItemThirdPartyInfo extends AlipayObject {

	private static final long serialVersionUID = 7554936819952573977L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品图片url
	 */
	@ApiField("item_logo_url")
	private String itemLogoUrl;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemLogoUrl() {
		return this.itemLogoUrl;
	}
	public void setItemLogoUrl(String itemLogoUrl) {
		this.itemLogoUrl = itemLogoUrl;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

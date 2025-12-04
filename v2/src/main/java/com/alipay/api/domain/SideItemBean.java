package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品加料
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:17
 */
public class SideItemBean extends AlipayObject {

	private static final long serialVersionUID = 5239826734584483489L;

	/**
	 * 商品ID（加料是商品）
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称/加料名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 价格，单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品/加料 skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 排序
	 */
	@ApiField("sort")
	private Long sort;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规格信息
 *
 * @author auto create
 * @since 1.0, 2025-01-10 16:39:30
 */
public class SpecificationInfo extends AlipayObject {

	private static final long serialVersionUID = 5131527242337586137L;

	/**
	 * 商品规格id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品规格名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}

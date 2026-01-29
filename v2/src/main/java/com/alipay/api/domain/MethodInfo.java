package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品做法信息
 *
 * @author auto create
 * @since 1.0, 2025-01-07 17:52:40
 */
public class MethodInfo extends AlipayObject {

	private static final long serialVersionUID = 1645958719518712215L;

	/**
	 * 商品做法id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品做法库存，单位份
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品做法名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品做法加价，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品做法spuid
	 */
	@ApiField("spu_id")
	private String spuId;

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

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}

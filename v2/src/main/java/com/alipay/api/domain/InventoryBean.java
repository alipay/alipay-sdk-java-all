package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:29
 */
public class InventoryBean extends AlipayObject {

	private static final long serialVersionUID = 3598767249862439431L;

	/**
	 * 库存总额，单位：个/份
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 库存ID
	 */
	@ApiField("inventory_id")
	private String inventoryId;

	/**
	 * 库存余额，单位：个/份
	 */
	@ApiField("inventory_remain")
	private Long inventoryRemain;

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getInventoryId() {
		return this.inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Long getInventoryRemain() {
		return this.inventoryRemain;
	}
	public void setInventoryRemain(Long inventoryRemain) {
		this.inventoryRemain = inventoryRemain;
	}

}

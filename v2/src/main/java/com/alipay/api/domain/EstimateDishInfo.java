package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品估清信息
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:05
 */
public class EstimateDishInfo extends AlipayObject {

	private static final long serialVersionUID = 6167399951996521728L;

	/**
	 * 口碑菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 库存数量
	 */
	@ApiField("inventory")
	private String inventory;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getInventory() {
		return this.inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

}

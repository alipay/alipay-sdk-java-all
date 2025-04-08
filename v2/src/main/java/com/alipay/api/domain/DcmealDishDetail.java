package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷卡菜品信息
 *
 * @author auto create
 * @since 1.0, 2024-03-01 17:28:14
 */
public class DcmealDishDetail extends AlipayObject {

	private static final long serialVersionUID = 5144883172456568788L;

	/**
	 * 智盘平台菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 智盘平台菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品单价，单位元，保留两位小数
	 */
	@ApiField("dish_price")
	private String dishPrice;

	/**
	 * 菜品售价，单位元，保留两位小数
	 */
	@ApiField("dish_sale_amount")
	private String dishSaleAmount;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishPrice() {
		return this.dishPrice;
	}
	public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}

	public String getDishSaleAmount() {
		return this.dishSaleAmount;
	}
	public void setDishSaleAmount(String dishSaleAmount) {
		this.dishSaleAmount = dishSaleAmount;
	}

}

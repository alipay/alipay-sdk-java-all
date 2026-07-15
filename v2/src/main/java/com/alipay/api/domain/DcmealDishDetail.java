package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷卡菜品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-08 13:47:16
 */
public class DcmealDishDetail extends AlipayObject {

	private static final long serialVersionUID = 7463541244915466821L;

	/**
	 * 菜品描述
	 */
	@ApiField("desc")
	private String desc;

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

	/**
	 * "nutrition"
	 */
	@ApiField("nutrition")
	private String nutrition;

	/**
	 * unit
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 商品重量，单位为g
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * 菜品类型
	 */
	@ApiField("weight_type")
	private String weightType;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

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

	public String getNutrition() {
		return this.nutrition;
	}
	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeightType() {
		return this.weightType;
	}
	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI识别食物明细
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:39:13
 */
public class FoodItem extends AlipayObject {

	private static final long serialVersionUID = 3676229821174616295L;

	/**
	 * 该项热量 kcal
	 */
	@ApiField("calorie")
	private String calorie;

	/**
	 * 食物名称
	 */
	@ApiField("food_name")
	private String foodName;

	/**
	 * 重量 g
	 */
	@ApiField("weight_g")
	private String weightG;

	public String getCalorie() {
		return this.calorie;
	}
	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	public String getFoodName() {
		return this.foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getWeightG() {
		return this.weightG;
	}
	public void setWeightG(String weightG) {
		this.weightG = weightG;
	}

}

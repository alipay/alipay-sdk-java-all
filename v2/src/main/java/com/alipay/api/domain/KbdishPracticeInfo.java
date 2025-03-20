package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品做法模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:09
 */
public class KbdishPracticeInfo extends AlipayObject {

	private static final long serialVersionUID = 2834919181223247877L;

	/**
	 * 口碑的菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 加价类型  add:直接加
	 */
	@ApiField("increase_mode")
	private String increaseMode;

	/**
	 * 加价金额
	 */
	@ApiField("increase_price")
	private String increasePrice;

	/**
	 * 做法名称
	 */
	@ApiField("practice_name")
	private String practiceName;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getIncreaseMode() {
		return this.increaseMode;
	}
	public void setIncreaseMode(String increaseMode) {
		this.increaseMode = increaseMode;
	}

	public String getIncreasePrice() {
		return this.increasePrice;
	}
	public void setIncreasePrice(String increasePrice) {
		this.increasePrice = increasePrice;
	}

	public String getPracticeName() {
		return this.practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品类
 *
 * @author auto create
 * @since 1.0, 2017-12-22 14:47:14
 */
public class Dishes extends AlipayObject {

	private static final long serialVersionUID = 3626892623578661349L;

	/**
	 * 外部菜品ID
当dish_list[]不为空的时候，dish_id是必填字段。
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品数量
	 */
	@ApiField("dish_num")
	private String dishNum;

	/**
	 * 菜品价格（单位分）
	 */
	@ApiField("dish_price")
	private String dishPrice;

	/**
	 * 菜品折后价格（单位分）
	 */
	@ApiField("dish_real_price")
	private String dishRealPrice;

	/**
	 * 1234
	 */
	@ApiField("dish_skuid")
	private String dishSkuid;

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

	public String getDishNum() {
		return this.dishNum;
	}
	public void setDishNum(String dishNum) {
		this.dishNum = dishNum;
	}

	public String getDishPrice() {
		return this.dishPrice;
	}
	public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}

	public String getDishRealPrice() {
		return this.dishRealPrice;
	}
	public void setDishRealPrice(String dishRealPrice) {
		this.dishRealPrice = dishRealPrice;
	}

	public String getDishSkuid() {
		return this.dishSkuid;
	}
	public void setDishSkuid(String dishSkuid) {
		this.dishSkuid = dishSkuid;
	}

}

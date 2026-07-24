package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排菜数据
 *
 * @author auto create
 * @since 1.0, 2026-04-09 09:16:41
 */
public class DcmealDishArrangeDetail extends AlipayObject {

	private static final long serialVersionUID = 5535894223353271873L;

	/**
	 * 排菜ID
	 */
	@ApiField("arrange_id")
	private String arrangeId;

	/**
	 * 园区ID
	 */
	@ApiField("campus_id")
	private String campusId;

	/**
	 * 园区名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 菜品ID
	 */
	@ApiField("food_id")
	private String foodId;

	/**
	 * 菜品名称
	 */
	@ApiField("food_name")
	private String foodName;

	/**
	 * 餐别名称
	 */
	@ApiField("meal_type")
	private String mealType;

	/**
	 * 价格，单位为“元”
	 */
	@ApiField("price")
	private String price;

	/**
	 * 餐厅ID
	 */
	@ApiField("restaurant_id")
	private String restaurantId;

	/**
	 * 餐厅名称
	 */
	@ApiField("restaurant_name")
	private String restaurantName;

	/**
	 * 极具ID
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 机具名称
	 */
	@ApiField("terminal_name")
	private String terminalName;

	public String getArrangeId() {
		return this.arrangeId;
	}
	public void setArrangeId(String arrangeId) {
		this.arrangeId = arrangeId;
	}

	public String getCampusId() {
		return this.campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getFoodId() {
		return this.foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return this.foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getMealType() {
		return this.mealType;
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getRestaurantId() {
		return this.restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return this.restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTerminalName() {
		return this.terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

}

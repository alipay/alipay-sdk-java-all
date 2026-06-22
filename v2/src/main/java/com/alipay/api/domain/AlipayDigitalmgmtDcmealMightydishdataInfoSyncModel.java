package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品数据同步
 *
 * @author auto create
 * @since 1.0, 2026-04-09 09:16:28
 */
public class AlipayDigitalmgmtDcmealMightydishdataInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3363246695556312659L;

	/**
	 * allergy_risk
	 */
	@ApiField("allergy_risk")
	private String allergyRisk;

	/**
	 * 园区ID
	 */
	@ApiField("campus_id")
	private String campusId;

	/**
	 * campus_name
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * category_id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * create_date
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * dietary
	 */
	@ApiField("dietary")
	private String dietary;

	/**
	 * 菜品信息
	 */
	@ApiField("dish_img")
	private String dishImg;

	/**
	 * 菜品id
	 */
	@ApiField("food_id")
	private String foodId;

	/**
	 * 菜品名称
	 */
	@ApiField("food_name")
	private String foodName;

	/**
	 * food_no
	 */
	@ApiField("food_no")
	private String foodNo;

	/**
	 * labs_healthcard
	 */
	@ApiField("labs_healthcard")
	private String labsHealthcard;

	/**
	 * nutrition
	 */
	@ApiField("nutrition")
	private String nutrition;

	/**
	 * 已元为单位
	 */
	@ApiField("price")
	private String price;

	/**
	 * restaurant_id
	 */
	@ApiField("restaurant_id")
	private String restaurantId;

	/**
	 * restaurant_name
	 */
	@ApiField("restaurant_name")
	private String restaurantName;

	/**
	 * special_population
	 */
	@ApiField("special_population")
	private String specialPopulation;

	/**
	 * state
	 */
	@ApiField("state")
	private Long state;

	/**
	 * unit
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * update_date
	 */
	@ApiField("update_date")
	private String updateDate;

	/**
	 * 已g为单位
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * weight_type
	 */
	@ApiField("weight_type")
	private String weightType;

	public String getAllergyRisk() {
		return this.allergyRisk;
	}
	public void setAllergyRisk(String allergyRisk) {
		this.allergyRisk = allergyRisk;
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

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getDietary() {
		return this.dietary;
	}
	public void setDietary(String dietary) {
		this.dietary = dietary;
	}

	public String getDishImg() {
		return this.dishImg;
	}
	public void setDishImg(String dishImg) {
		this.dishImg = dishImg;
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

	public String getFoodNo() {
		return this.foodNo;
	}
	public void setFoodNo(String foodNo) {
		this.foodNo = foodNo;
	}

	public String getLabsHealthcard() {
		return this.labsHealthcard;
	}
	public void setLabsHealthcard(String labsHealthcard) {
		this.labsHealthcard = labsHealthcard;
	}

	public String getNutrition() {
		return this.nutrition;
	}
	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
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

	public String getSpecialPopulation() {
		return this.specialPopulation;
	}
	public void setSpecialPopulation(String specialPopulation) {
		this.specialPopulation = specialPopulation;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
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

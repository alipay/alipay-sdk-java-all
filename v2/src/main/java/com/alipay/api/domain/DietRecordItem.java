package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:39:13
 */
public class DietRecordItem extends AlipayObject {

	private static final long serialVersionUID = 3576898833715915439L;

	/**
	 * AI 热量估算 kcal
	 */
	@ApiField("ai_calorie")
	private String aiCalorie;

	/**
	 * 饮食评估整句摘要
	 */
	@ApiField("ai_summary")
	private String aiSummary;

	/**
	 * 碳水 g
	 */
	@ApiField("carbohydrate")
	private String carbohydrate;

	/**
	 * 脂肪 g
	 */
	@ApiField("fat")
	private String fat;

	/**
	 * null
	 */
	@ApiListField("food_image_urls")
	@ApiField("string")
	private List<String> foodImageUrls;

	/**
	 * null
	 */
	@ApiListField("food_items")
	@ApiField("food_item")
	private List<FoodItem> foodItems;

	/**
	 * 餐次编码
	 */
	@ApiField("meal_type")
	private String mealType;

	/**
	 * 餐次名称
	 */
	@ApiField("meal_type_name")
	private String mealTypeName;

	/**
	 * 蛋白质g
	 */
	@ApiField("protein")
	private String protein;

	/**
	 * 记录日期 yyyy-MM-dd
	 */
	@ApiField("record_date")
	private String recordDate;

	/**
	 * 记录业务 ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 记录时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("record_time")
	private String recordTime;

	/**
	 * 文字描述（input_mode=2 时有值）
	 */
	@ApiField("text_desc")
	private String textDesc;

	public String getAiCalorie() {
		return this.aiCalorie;
	}
	public void setAiCalorie(String aiCalorie) {
		this.aiCalorie = aiCalorie;
	}

	public String getAiSummary() {
		return this.aiSummary;
	}
	public void setAiSummary(String aiSummary) {
		this.aiSummary = aiSummary;
	}

	public String getCarbohydrate() {
		return this.carbohydrate;
	}
	public void setCarbohydrate(String carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public String getFat() {
		return this.fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}

	public List<String> getFoodImageUrls() {
		return this.foodImageUrls;
	}
	public void setFoodImageUrls(List<String> foodImageUrls) {
		this.foodImageUrls = foodImageUrls;
	}

	public List<FoodItem> getFoodItems() {
		return this.foodItems;
	}
	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	public String getMealType() {
		return this.mealType;
	}
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getMealTypeName() {
		return this.mealTypeName;
	}
	public void setMealTypeName(String mealTypeName) {
		this.mealTypeName = mealTypeName;
	}

	public String getProtein() {
		return this.protein;
	}
	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordTime() {
		return this.recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getTextDesc() {
		return this.textDesc;
	}
	public void setTextDesc(String textDesc) {
		this.textDesc = textDesc;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜谱下的菜品的详情对象
 *
 * @author auto create
 * @since 1.0, 2018-12-21 17:36:22
 */
public class PosCookDishQryDetailModel extends AlipayObject {

	private static final long serialVersionUID = 4219925265818612876L;

	/**
	 * 菜品对应的售卖类别的ID
	 */
	@ApiField("category_big_id")
	private String categoryBigId;

	/**
	 * 菜品的ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品素材库的ID
	 */
	@ApiField("dish_img")
	private String dishImg;

	/**
	 * 菜品的名字
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品和档口的关系（多个档口以逗号,分隔）
	 */
	@ApiField("dish_stall_ref")
	private String dishStallRef;

	/**
	 * 菜品的最低售卖价格
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * true false 是否是多规格
	 */
	@ApiField("multi_spec")
	private Boolean multiSpec;

	/**
	 * 新品或者招牌 标签
	 */
	@ApiField("special_tag")
	private String specialTag;

	/**
	 * 辣度
	 */
	@ApiField("spicy_tag")
	private String spicyTag;

	/**
	 * 菜品的售卖状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 菜品的类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 菜品单位
	 */
	@ApiField("unit_name")
	private String unitName;

	public String getCategoryBigId() {
		return this.categoryBigId;
	}
	public void setCategoryBigId(String categoryBigId) {
		this.categoryBigId = categoryBigId;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishImg() {
		return this.dishImg;
	}
	public void setDishImg(String dishImg) {
		this.dishImg = dishImg;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishStallRef() {
		return this.dishStallRef;
	}
	public void setDishStallRef(String dishStallRef) {
		this.dishStallRef = dishStallRef;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public Boolean getMultiSpec() {
		return this.multiSpec;
	}
	public void setMultiSpec(Boolean multiSpec) {
		this.multiSpec = multiSpec;
	}

	public String getSpecialTag() {
		return this.specialTag;
	}
	public void setSpecialTag(String specialTag) {
		this.specialTag = specialTag;
	}

	public String getSpicyTag() {
		return this.spicyTag;
	}
	public void setSpicyTag(String spicyTag) {
		this.spicyTag = spicyTag;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

}

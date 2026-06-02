package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品分类
 *
 * @author auto create
 * @since 1.0, 2026-04-09 09:16:49
 */
public class DcmealDishCategoryDetail extends AlipayObject {

	private static final long serialVersionUID = 5387344195824977276L;

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
	 * 分类ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 分类名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 分类编号
	 */
	@ApiField("category_no")
	private String categoryNo;

	/**
	 * 父类ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

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

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryNo() {
		return this.categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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

}

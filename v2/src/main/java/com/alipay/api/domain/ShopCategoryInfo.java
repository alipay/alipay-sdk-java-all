package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店类目信息
 *
 * @author auto create
 * @since 1.0, 2018-11-20 10:06:10
 */
public class ShopCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 4713878476893732228L;

	/**
	 * 类目编号
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目层级,目前最多支持1、2、3三级
	 */
	@ApiField("category_level")
	private String categoryLevel;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryLevel() {
		return this.categoryLevel;
	}
	public void setCategoryLevel(String categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}

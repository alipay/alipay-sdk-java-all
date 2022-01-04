package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序一级类目信息
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:26:37
 */
public class MiniAppFirstCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 7538623199548617871L;

	/**
	 * 旅行住宿
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 小程序类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 二级类目列表
	 */
	@ApiListField("child_category")
	@ApiField("mini_app_second_category_info")
	private List<MiniAppSecondCategoryInfo> childCategory;

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

	public List<MiniAppSecondCategoryInfo> getChildCategory() {
		return this.childCategory;
	}
	public void setChildCategory(List<MiniAppSecondCategoryInfo> childCategory) {
		this.childCategory = childCategory;
	}

}

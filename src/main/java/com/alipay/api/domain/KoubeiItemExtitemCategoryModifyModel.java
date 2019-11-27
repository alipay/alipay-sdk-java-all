package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目修改接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:55:00
 */
public class KoubeiItemExtitemCategoryModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1122987586948213939L;

	/**
	 * 类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 父类目（可不填）
	 */
	@ApiField("parent_category_code")
	private String parentCategoryCode;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getParentCategoryCode() {
		return this.parentCategoryCode;
	}
	public void setParentCategoryCode(String parentCategoryCode) {
		this.parentCategoryCode = parentCategoryCode;
	}

}

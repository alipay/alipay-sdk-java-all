package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目返回
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:30:13
 */
public class GoodsCategoryResult extends AlipayObject {

	private static final long serialVersionUID = 5565273351391546459L;

	/**
	 * 类目code，格式：多级通过|(英文竖线相隔)
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 当前类目层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 父节点类目code
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

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getParentCategoryCode() {
		return this.parentCategoryCode;
	}
	public void setParentCategoryCode(String parentCategoryCode) {
		this.parentCategoryCode = parentCategoryCode;
	}

}

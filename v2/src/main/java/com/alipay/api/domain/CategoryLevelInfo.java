package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类分级信息
 *
 * @author auto create
 * @since 1.0, 2017-09-25 12:16:20
 */
public class CategoryLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 5199389889597381936L;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 品类级别
	 */
	@ApiField("category_level")
	private Long categoryLevel;

	/**
	 * 品类名称
	 */
	@ApiField("category_name")
	private String categoryName;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Long getCategoryLevel() {
		return this.categoryLevel;
	}
	public void setCategoryLevel(Long categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}

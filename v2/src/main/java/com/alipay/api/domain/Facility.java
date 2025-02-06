package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店基础设施
 *
 * @author auto create
 * @since 1.0, 2024-01-24 10:57:43
 */
public class Facility extends AlipayObject {

	private static final long serialVersionUID = 3114558833587448351L;

	/**
	 * 设施种类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 设施种类名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 设施名称
	 */
	@ApiField("facility_name")
	private String facilityName;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getFacilityName() {
		return this.facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

}

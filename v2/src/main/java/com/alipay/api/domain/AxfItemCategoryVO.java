package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-23 15:07:56
 */
public class AxfItemCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 4269958485957762656L;

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
	 * 类目状态
	 */
	@ApiField("category_status")
	private String categoryStatus;

	/**
	 * 类目级别。如3代表三级类目
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 父类目编码
	 */
	@ApiField("parent_category_code")
	private String parentCategoryCode;

	/**
	 * 所需资质信息
	 */
	@ApiField("required_qualifications")
	private AxfItemCategoryQualificationVO requiredQualifications;

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

	public String getCategoryStatus() {
		return this.categoryStatus;
	}
	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
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

	public AxfItemCategoryQualificationVO getRequiredQualifications() {
		return this.requiredQualifications;
	}
	public void setRequiredQualifications(AxfItemCategoryQualificationVO requiredQualifications) {
		this.requiredQualifications = requiredQualifications;
	}

}

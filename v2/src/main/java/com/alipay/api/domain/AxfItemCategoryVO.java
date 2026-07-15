package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-13 10:32:53
 */
public class AxfItemCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 6676148579536282188L;

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
	 * null
	 */
	@ApiListField("required_qualifications")
	@ApiField("axf_item_category_qualification_v_o")
	private List<AxfItemCategoryQualificationVO> requiredQualifications;

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

	public List<AxfItemCategoryQualificationVO> getRequiredQualifications() {
		return this.requiredQualifications;
	}
	public void setRequiredQualifications(List<AxfItemCategoryQualificationVO> requiredQualifications) {
		this.requiredQualifications = requiredQualifications;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目查询结果对象
 *
 * @author auto create
 * @since 1.0, 2021-01-14 10:29:10
 */
public class CategoryRequireInfo extends AlipayObject {

	private static final long serialVersionUID = 3697639737921271175L;

	/**
	 * 营业执照页面是否必填
	 */
	@ApiField("business_licence_required")
	private Boolean businessLicenceRequired;

	/**
	 * 类目code（各级类目code下划线"_"拼接）
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 类目名称（各级类目名称下划线"_"拼接）
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目要求原始描述信息
	 */
	@ApiField("category_requirements")
	private String categoryRequirements;

	/**
	 * 门头照页面是否必填
	 */
	@ApiField("door_photo_required")
	private Boolean doorPhotoRequired;

	/**
	 * 特殊资质页面是否必填
	 */
	@ApiField("special_licence_required")
	private Boolean specialLicenceRequired;

	public Boolean getBusinessLicenceRequired() {
		return this.businessLicenceRequired;
	}
	public void setBusinessLicenceRequired(Boolean businessLicenceRequired) {
		this.businessLicenceRequired = businessLicenceRequired;
	}

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

	public String getCategoryRequirements() {
		return this.categoryRequirements;
	}
	public void setCategoryRequirements(String categoryRequirements) {
		this.categoryRequirements = categoryRequirements;
	}

	public Boolean getDoorPhotoRequired() {
		return this.doorPhotoRequired;
	}
	public void setDoorPhotoRequired(Boolean doorPhotoRequired) {
		this.doorPhotoRequired = doorPhotoRequired;
	}

	public Boolean getSpecialLicenceRequired() {
		return this.specialLicenceRequired;
	}
	public void setSpecialLicenceRequired(Boolean specialLicenceRequired) {
		this.specialLicenceRequired = specialLicenceRequired;
	}

}

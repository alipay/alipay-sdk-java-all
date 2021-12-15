package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院科室信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MedicalHospitalDeptInfo extends AlipayObject {

	private static final long serialVersionUID = 3175376294978711649L;

	/**
	 * 科室唯一标识，编码开发者生成并保证唯一
	 */
	@ApiField("code")
	private String code;

	/**
	 * 科室位置
	 */
	@ApiField("location")
	private String location;

	/**
	 * 科室名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父科室名称 如果是顶层科室可空 目的定位科室级联关系
	 */
	@ApiField("parent_name")
	private String parentName;

	/**
	 * 父科室唯一标识
如果是顶层科室可空
目的定位科室级联关系
	 */
	@ApiField("partner_code")
	private String partnerCode;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentName() {
		return this.parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

}

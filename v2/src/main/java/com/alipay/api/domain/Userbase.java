package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人信息
 *
 * @author auto create
 * @since 1.0, 2025-11-26 17:22:41
 */
public class Userbase extends AlipayObject {

	private static final long serialVersionUID = 5487554968415447918L;

	/**
	 * 出生日期
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 性别（男/女）
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 身高(cm)
	 */
	@ApiField("height")
	private String height;

	/**
	 * 参保类型（职工参保、居民参保）
	 */
	@ApiField("insurance_type")
	private String insuranceType;

	/**
	 * 居住地名称（省、市、区）
	 */
	@ApiField("live_area_name")
	private String liveAreaName;

	/**
	 * 用户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 体重(kg)
	 */
	@ApiField("weight")
	private String weight;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getInsuranceType() {
		return this.insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getLiveAreaName() {
		return this.liveAreaName;
	}
	public void setLiveAreaName(String liveAreaName) {
		this.liveAreaName = liveAreaName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}

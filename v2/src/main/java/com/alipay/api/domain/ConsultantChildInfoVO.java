package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ConsultantChildInfoVO	儿童基本信息（档案为空时为 null）
 *
 * @author auto create
 * @since 1.0, 2026-07-21 19:27:52
 */
public class ConsultantChildInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7197348496573465452L;

	/**
	 * 出生日期，格式：yyyy-MM-dd
	 */
	@ApiField("birth_date")
	private String birthDate;

	/**
	 * 性别：男/女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 联系手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 成员档案ID
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 儿童姓名
	 */
	@ApiField("profile_name")
	private String profileName;

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfileId() {
		return this.profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return this.profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

}

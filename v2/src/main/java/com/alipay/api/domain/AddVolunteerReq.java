package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 志愿者新增入参
 *
 * @author auto create
 * @since 1.0, 2023-06-16 11:23:11
 */
public class AddVolunteerReq extends AlipayObject {

	private static final long serialVersionUID = 5774649336483165628L;

	/**
	 * 生态合作伙伴
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 志愿者电话号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 身份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 人员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 志愿者姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAgency() {
		return this.agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

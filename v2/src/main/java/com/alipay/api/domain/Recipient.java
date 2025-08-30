package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收件人
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:14
 */
public class Recipient extends AlipayObject {

	private static final long serialVersionUID = 5819281463845784717L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("district")
	private String district;

	/**
	 * 电子发票时该字段必须填写
	 */
	@ApiField("email")
	private String email;

	/**
	 * 按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("postal_code")
	private String postalCode;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("street")
	private String street;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCode() {
		return this.postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}

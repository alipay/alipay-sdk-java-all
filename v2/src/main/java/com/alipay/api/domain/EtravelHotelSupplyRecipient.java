package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-收件人
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:26
 */
public class EtravelHotelSupplyRecipient extends AlipayObject {

	private static final long serialVersionUID = 3789873167821224988L;

	/**
	 * 城市，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("city")
	private String city;

	/**
	 * 行政区，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("dstrict")
	private String dstrict;

	/**
	 * 邮箱，电子发票时该字段必须填写
	 */
	@ApiField("email")
	private String email;

	/**
	 * 收件人，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 邮编，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("postal_code")
	private String postalCode;

	/**
	 * 省份，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道，按照国家邮政规范填写即可。电子发票无需填写。
	 */
	@ApiField("street")
	private String street;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDstrict() {
		return this.dstrict;
	}
	public void setDstrict(String dstrict) {
		this.dstrict = dstrict;
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

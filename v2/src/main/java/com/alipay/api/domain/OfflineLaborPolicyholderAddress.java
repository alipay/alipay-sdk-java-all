package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保人地址信息
 *
 * @author auto create
 * @since 1.0, 2026-07-24 14:14:15
 */
public class OfflineLaborPolicyholderAddress extends AlipayObject {

	private static final long serialVersionUID = 3677123278469732482L;

	/**
	 * 投保人的详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 行政区划代码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 区县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 固定电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 邮编
	 */
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressCode() {
		return this.addressCode;
	}
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单邮寄地址
 *
 * @author auto create
 * @since 1.0, 2020-04-27 17:22:45
 */
public class InsAddressee extends AlipayObject {

	private static final long serialVersionUID = 7883621835296782483L;

	/**
	 * 收件人详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 联系地址-城区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 联系地址-城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 联系方式(mobile登录号)
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系地址-电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 联系地址-省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 联系地址-邮编
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

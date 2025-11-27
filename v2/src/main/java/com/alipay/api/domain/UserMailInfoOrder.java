package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户的邮寄地址
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:03:27
 */
public class UserMailInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 6173748983471166565L;

	/**
	 * 联系所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 联系人国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 联系人所在县/区
	 */
	@ApiField("county_district")
	private String countyDistrict;

	/**
	 * 联系所在详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 商户ipRole(pid)
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 联系人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系人省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 联系人所在街道
	 */
	@ApiField("street")
	private String street;

	/**
	 * 联系人电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountyDistrict() {
		return this.countyDistrict;
	}
	public void setCountyDistrict(String countyDistrict) {
		this.countyDistrict = countyDistrict;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}

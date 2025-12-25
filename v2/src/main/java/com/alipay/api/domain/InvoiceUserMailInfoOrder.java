package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票收件人列表
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:16:14
 */
public class InvoiceUserMailInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 2547969485178872688L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 县区
	 */
	@ApiField("county_district")
	private String countyDistrict;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 联系人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
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

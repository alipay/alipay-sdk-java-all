package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户发票邮寄信息OpenApiOrder
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class OpenApiUserMailInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 2782759121528926598L;

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
	 * 是否默认, 值为空或Y标识默认, N标识非默认
	 */
	@ApiField("default_flag")
	private String defaultFlag;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 收件人邮箱,多个用英文逗号分隔
	 */
	@ApiField("email")
	private String email;

	/**
	 * 用户pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 收件人姓名
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
	 * 收件人电话
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

	public String getDefaultFlag() {
		return this.defaultFlag;
	}
	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
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

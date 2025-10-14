package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融机构抵押邮寄地址
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:29:06
 */
public class CarfinMortgageFinancePostInfo extends AlipayObject {

	private static final long serialVersionUID = 5551364914331432335L;

	/**
	 * 收件人地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 收件人地区国标码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 收件人城市国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 收件人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收件人邮编
	 */
	@ApiField("post_code")
	private String postCode;

	/**
	 * 收件人省份国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getPostCode() {
		return this.postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}

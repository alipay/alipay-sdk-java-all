package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV地址DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 14:29:29
 */
public class IndrISVAddressDTO extends AlipayObject {

	private static final long serialVersionUID = 4251961934431329658L;

	/**
	 * 长度100，如果为中文，支付宝侧会做英文翻译，翻译后的地址也需要长度小于100，不能包含特殊字符
	 */
	@ApiField("address_1")
	private String address1;

	/**
	 * 长度100，如果为中文，支付宝侧会做英文翻译，翻译后的地址也需要长度小于100，不能包含特殊字符
	 */
	@ApiField("address_2")
	private String address2;

	/**
	 * 城市名称：英文或者拼音
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 两位国家码
	 */
	@ApiField("region")
	private String region;

	/**
	 * 省份名称:英文或者拼音
	 */
	@ApiField("state")
	private String state;

	/**
	 * 省份Code
	 */
	@ApiField("state_code")
	private String stateCode;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAddress1() {
		return this.address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getStateCode() {
		return this.stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}

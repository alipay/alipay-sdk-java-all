package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付业务地址信息
 *
 * @author auto create
 * @since 1.0, 2021-11-10 17:36:10
 */
public class PaymentAddress extends AlipayObject {

	private static final long serialVersionUID = 3435492829891465888L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家编码，iso3166字母编码
	 */
	@ApiField("country")
	private String country;

	/**
	 * 详细地址
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 省/州
	 */
	@ApiField("state")
	private String state;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;

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

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}

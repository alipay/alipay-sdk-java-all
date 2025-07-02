package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付业务地址信息
 *
 * @author auto create
 * @since 1.0, 2023-06-21 13:57:34
 */
public class PaymentAddress extends AlipayObject {

	private static final long serialVersionUID = 5156658524175892115L;

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

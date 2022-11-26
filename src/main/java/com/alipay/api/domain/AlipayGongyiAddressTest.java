package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2020-06-10 10:14:01
 */
public class AlipayGongyiAddressTest extends AlipayObject {

	private static final long serialVersionUID = 1846264682325816551L;

	/**
	 * 航海走
	 */
	@ApiField("city")
	private String city;

	/**
	 * 中国
	 */
	@ApiField("contury")
	private String contury;

	/**
	 * 街道
	 */
	@ApiField("street")
	private String street;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getContury() {
		return this.contury;
	}
	public void setContury(String contury) {
		this.contury = contury;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}

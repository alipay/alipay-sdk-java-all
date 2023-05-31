package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机归属地对象
 *
 * @author auto create
 * @since 1.0, 2017-01-03 17:38:43
 */
public class SecuritydataMobileCity extends AlipayObject {

	private static final long serialVersionUID = 4861463945478965935L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 手机号前七位
	 */
	@ApiField("phone_first_7_digits")
	private String phoneFirst7Digits;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneFirst7Digits() {
		return this.phoneFirst7Digits;
	}
	public void setPhoneFirst7Digits(String phoneFirst7Digits) {
		this.phoneFirst7Digits = phoneFirst7Digits;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}

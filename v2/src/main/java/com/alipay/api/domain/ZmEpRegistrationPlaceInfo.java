package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信工商企业注册地信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 15:33:21
 */
public class ZmEpRegistrationPlaceInfo extends AlipayObject {

	private static final long serialVersionUID = 7512197826145359664L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 中国行政区划代码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 行政区
	 */
	@ApiField("county")
	private String county;

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

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}

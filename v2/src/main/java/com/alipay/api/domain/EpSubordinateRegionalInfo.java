package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 所属地区
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:27
 */
public class EpSubordinateRegionalInfo extends AlipayObject {

	private static final long serialVersionUID = 5663727225719535646L;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}

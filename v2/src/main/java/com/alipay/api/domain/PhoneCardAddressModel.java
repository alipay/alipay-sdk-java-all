package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡归属地
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:15
 */
public class PhoneCardAddressModel extends AlipayObject {

	private static final long serialVersionUID = 5833945413658625928L;

	/**
	 * 号卡归属地城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 号卡归属省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}

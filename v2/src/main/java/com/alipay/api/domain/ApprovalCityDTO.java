package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单城市信息
 *
 * @author auto create
 * @since 1.0, 2025-05-26 20:01:30
 */
public class ApprovalCityDTO extends AlipayObject {

	private static final long serialVersionUID = 6651666362363125539L;

	/**
	 * 城市行政编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}

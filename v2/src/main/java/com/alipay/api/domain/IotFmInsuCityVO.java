package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT亲情账户参保地VO
 *
 * @author auto create
 * @since 1.0, 2023-10-19 11:26:36
 */
public class IotFmInsuCityVO extends AlipayObject {

	private static final long serialVersionUID = 6446684397193916134L;

	/**
	 * 参保城市编码国标
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 参保地城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 参保地城市编码机构
	 */
	@ApiField("ins_city_code")
	private String insCityCode;

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

	public String getInsCityCode() {
		return this.insCityCode;
	}
	public void setInsCityCode(String insCityCode) {
		this.insCityCode = insCityCode;
	}

}

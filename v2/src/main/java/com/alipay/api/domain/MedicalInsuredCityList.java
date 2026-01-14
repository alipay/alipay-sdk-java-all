package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保电子凭证参保城市列表
 *
 * @author auto create
 * @since 1.0, 2023-08-04 16:04:19
 */
public class MedicalInsuredCityList extends AlipayObject {

	private static final long serialVersionUID = 5184759721795561665L;

	/**
	 * 参保地城市编码(国标)
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 参保地城市编码(机构)
	 */
	@ApiField("ins_city_code")
	private String insCityCode;

	/**
	 * 参保地城市名称(机构)
	 */
	@ApiField("ins_city_name")
	private String insCityName;

	/**
	 * 是否是默认参保地
	 */
	@ApiField("is_default_city")
	private String isDefaultCity;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInsCityCode() {
		return this.insCityCode;
	}
	public void setInsCityCode(String insCityCode) {
		this.insCityCode = insCityCode;
	}

	public String getInsCityName() {
		return this.insCityName;
	}
	public void setInsCityName(String insCityName) {
		this.insCityName = insCityName;
	}

	public String getIsDefaultCity() {
		return this.isDefaultCity;
	}
	public void setIsDefaultCity(String isDefaultCity) {
		this.isDefaultCity = isDefaultCity;
	}

}

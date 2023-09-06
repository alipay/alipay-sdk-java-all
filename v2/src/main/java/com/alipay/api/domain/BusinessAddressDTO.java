package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2023-03-03 17:12:22
 */
public class BusinessAddressDTO extends AlipayObject {

	private static final long serialVersionUID = 2358497525852391898L;

	/**
	 * 所在地市（代码）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 所在国家（代码）
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 区代码（代码）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 所在地省（代码）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 街道(乡镇)代码
	 */
	@ApiField("town_code")
	private String townCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getTownCode() {
		return this.townCode;
	}
	public void setTownCode(String townCode) {
		this.townCode = townCode;
	}

}

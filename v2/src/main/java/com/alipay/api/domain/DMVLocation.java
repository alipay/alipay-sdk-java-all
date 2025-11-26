package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车管部门所在地
 *
 * @author auto create
 * @since 1.0, 2025-10-22 15:48:02
 */
public class DMVLocation extends AlipayObject {

	private static final long serialVersionUID = 7782596491515498619L;

	/**
	 * 所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 所在城市国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 所在区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 所在区国标码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 所在省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 所在省国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}

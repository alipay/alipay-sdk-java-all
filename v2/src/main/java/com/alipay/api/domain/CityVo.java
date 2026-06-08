package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城市
 *
 * @author auto create
 * @since 1.0, 2026-03-18 11:46:36
 */
public class CityVo extends AlipayObject {

	private static final long serialVersionUID = 4793372412662367484L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区县列表
	 */
	@ApiListField("district_list")
	@ApiField("district_vo")
	private List<DistrictVo> districtList;

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

	public List<DistrictVo> getDistrictList() {
		return this.districtList;
	}
	public void setDistrictList(List<DistrictVo> districtList) {
		this.districtList = districtList;
	}

}

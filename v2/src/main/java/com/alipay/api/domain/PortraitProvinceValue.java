package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 常住省市画像数据结构-省级结构
 *
 * @author auto create
 * @since 1.0, 2023-01-12 20:45:49
 */
public class PortraitProvinceValue extends AlipayObject {

	private static final long serialVersionUID = 5549661611912861694L;

	/**
	 * 国标地区编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 当前省辖城市数据列表
	 */
	@ApiListField("city_list")
	@ApiField("portrait_city_value")
	private List<PortraitCityValue> cityList;

	/**
	 * 画像中当前省对应的人数
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 省名称，范围是我国所有省、自治区、直辖市的名称
	 */
	@ApiField("portrait_value")
	private String portraitValue;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public List<PortraitCityValue> getCityList() {
		return this.cityList;
	}
	public void setCityList(List<PortraitCityValue> cityList) {
		this.cityList = cityList;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getPortraitValue() {
		return this.portraitValue;
	}
	public void setPortraitValue(String portraitValue) {
		this.portraitValue = portraitValue;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 省份数据列表
 *
 * @author auto create
 * @since 1.0, 2026-03-25 14:37:16
 */
public class ProvinceVo extends AlipayObject {

	private static final long serialVersionUID = 1396282325555969485L;

	/**
	 * null
	 */
	@ApiListField("city_list")
	@ApiField("city_vo")
	private List<CityVo> cityList;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 身份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	public List<CityVo> getCityList() {
		return this.cityList;
	}
	public void setCityList(List<CityVo> cityList) {
		this.cityList = cityList;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}

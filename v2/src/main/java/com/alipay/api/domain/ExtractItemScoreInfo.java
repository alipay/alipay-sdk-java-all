package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抽槽项匹配得分信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class ExtractItemScoreInfo extends AlipayObject {

	private static final long serialVersionUID = 4713646914367614238L;

	/**
	 * [{"code":"234","score":"99"}]
	 */
	@ApiListField("city_info_list")
	@ApiField("geography_info")
	private List<GeographyInfo> cityInfoList;

	/**
	 * [{"code":"234","score":"99"}]
	 */
	@ApiListField("district_info_list")
	@ApiField("geography_info")
	private List<GeographyInfo> districtInfoList;

	/**
	 * [{"name":"河南省人民医院","score":"99"}]
	 */
	@ApiListField("hos_info_list")
	@ApiField("hos_info_info")
	private List<HosInfoInfo> hosInfoList;

	/**
	 * [{"code":"234","score":"99"}]
	 */
	@ApiListField("province_info_list")
	@ApiField("geography_info")
	private List<GeographyInfo> provinceInfoList;

	/**
	 * [{"name":"骨科","score":"99"}]
	 */
	@ApiListField("univ_department_info_list")
	@ApiField("hos_info_info")
	private List<HosInfoInfo> univDepartmentInfoList;

	public List<GeographyInfo> getCityInfoList() {
		return this.cityInfoList;
	}
	public void setCityInfoList(List<GeographyInfo> cityInfoList) {
		this.cityInfoList = cityInfoList;
	}

	public List<GeographyInfo> getDistrictInfoList() {
		return this.districtInfoList;
	}
	public void setDistrictInfoList(List<GeographyInfo> districtInfoList) {
		this.districtInfoList = districtInfoList;
	}

	public List<HosInfoInfo> getHosInfoList() {
		return this.hosInfoList;
	}
	public void setHosInfoList(List<HosInfoInfo> hosInfoList) {
		this.hosInfoList = hosInfoList;
	}

	public List<GeographyInfo> getProvinceInfoList() {
		return this.provinceInfoList;
	}
	public void setProvinceInfoList(List<GeographyInfo> provinceInfoList) {
		this.provinceInfoList = provinceInfoList;
	}

	public List<HosInfoInfo> getUnivDepartmentInfoList() {
		return this.univDepartmentInfoList;
	}
	public void setUnivDepartmentInfoList(List<HosInfoInfo> univDepartmentInfoList) {
		this.univDepartmentInfoList = univDepartmentInfoList;
	}

}

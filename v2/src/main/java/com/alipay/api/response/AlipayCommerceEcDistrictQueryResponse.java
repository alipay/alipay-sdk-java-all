package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.district.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-09 21:56:52
 */
public class AlipayCommerceEcDistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3884984199714738565L;

	/** 
	 * 城市列表
	 */
	@ApiListField("city_list")
	@ApiField("ec_area_info")
	private List<EcAreaInfo> cityList;

	/** 
	 * 区列表
	 */
	@ApiListField("district_list")
	@ApiField("ec_area_info")
	private List<EcAreaInfo> districtList;

	/** 
	 * 省份列表
	 */
	@ApiListField("province_list")
	@ApiField("ec_area_info")
	private List<EcAreaInfo> provinceList;

	public void setCityList(List<EcAreaInfo> cityList) {
		this.cityList = cityList;
	}
	public List<EcAreaInfo> getCityList( ) {
		return this.cityList;
	}

	public void setDistrictList(List<EcAreaInfo> districtList) {
		this.districtList = districtList;
	}
	public List<EcAreaInfo> getDistrictList( ) {
		return this.districtList;
	}

	public void setProvinceList(List<EcAreaInfo> provinceList) {
		this.provinceList = provinceList;
	}
	public List<EcAreaInfo> getProvinceList( ) {
		return this.provinceList;
	}

}

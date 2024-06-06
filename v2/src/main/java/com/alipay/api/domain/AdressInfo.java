package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2024-05-06 16:53:20
 */
public class AdressInfo extends AlipayObject {

	private static final long serialVersionUID = 3249128724962381842L;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 地区编码
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 对应高德地图的POI ID
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 省份编码
	 */
	@ApiField("province_id")
	private String provinceId;

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getDistrictId() {
		return this.districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getProvinceId() {
		return this.provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

}

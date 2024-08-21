package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车租车地址
 *
 * @author auto create
 * @since 1.0, 2023-12-04 22:46:07
 */
public class RentCarLocation extends AlipayObject {

	private static final long serialVersionUID = 7593487362866953244L;

	/**
	 * 城市代码，以民政部2020Q1全国行政区划代码为标准，查询地址 https://www.mca.gov.cn/n156/n186/c110747/content.html
注意，四个直辖市北京上海天津重庆使用市级代码而不是省级代码，例如上海使用市级代码310100，而不是省级代码310000
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区县代码
	 */
	@ApiField("county_code")
	private String countyCode;

	/**
	 * 区县名称
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 地址纬度，高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址经度，高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 当前地点poi名称
	 */
	@ApiField("poi_name")
	private String poiName;

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

	public String getCountyCode() {
		return this.countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

}

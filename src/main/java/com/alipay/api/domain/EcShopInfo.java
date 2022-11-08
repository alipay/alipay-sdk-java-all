package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2022-01-11 16:47:40
 */
public class EcShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8156326571616648356L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区编码
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 一级mcc编码
	 */
	@ApiField("mcc_code_1")
	private String mccCode1;

	/**
	 * 二级mcc编码
	 */
	@ApiField("mcc_code_2")
	private String mccCode2;

	/**
	 * 一级mcc名称
	 */
	@ApiField("mcc_name_1")
	private String mccName1;

	/**
	 * 二级mcc名称
	 */
	@ApiField("mcc_name_2")
	private String mccName2;

	/**
	 * 门头照地址
	 */
	@ApiField("outdoor_img_url")
	private String outdoorImgUrl;

	/**
	 * 高德poiId
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 省份编码
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictId() {
		return this.districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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

	public String getMccCode1() {
		return this.mccCode1;
	}
	public void setMccCode1(String mccCode1) {
		this.mccCode1 = mccCode1;
	}

	public String getMccCode2() {
		return this.mccCode2;
	}
	public void setMccCode2(String mccCode2) {
		this.mccCode2 = mccCode2;
	}

	public String getMccName1() {
		return this.mccName1;
	}
	public void setMccName1(String mccName1) {
		this.mccName1 = mccName1;
	}

	public String getMccName2() {
		return this.mccName2;
	}
	public void setMccName2(String mccName2) {
		this.mccName2 = mccName2;
	}

	public String getOutdoorImgUrl() {
		return this.outdoorImgUrl;
	}
	public void setOutdoorImgUrl(String outdoorImgUrl) {
		this.outdoorImgUrl = outdoorImgUrl;
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

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}

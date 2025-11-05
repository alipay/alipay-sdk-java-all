package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家店铺地址
 *
 * @author auto create
 * @since 1.0, 2025-09-12 18:52:59
 */
public class MerchantShopAddress extends AlipayObject {

	private static final long serialVersionUID = 2471697286587891777L;

	/**
	 * 城市(2022Q2版本)
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 区(2022Q2版本)
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
	 * 省份(2022Q2版本)
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
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

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}

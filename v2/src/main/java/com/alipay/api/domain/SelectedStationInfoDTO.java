package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选择站点信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 16:24:57
 */
public class SelectedStationInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1839146322585454455L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区或县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 市
	 */
	@ApiField("city_name")
	private String cityName;

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
	 * 省
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 驿站门店id
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 驿站门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}

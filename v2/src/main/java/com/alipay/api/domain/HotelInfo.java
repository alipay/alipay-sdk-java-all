package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店信息
 *
 * @author auto create
 * @since 1.0, 2021-12-08 14:00:55
 */
public class HotelInfo extends AlipayObject {

	private static final long serialVersionUID = 1776153816973149992L;

	/**
	 * 酒店品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 酒店地址
	 */
	@ApiField("hotel_address")
	private String hotelAddress;

	/**
	 * 酒店可以入住时间
	 */
	@ApiField("hotel_check_in_time")
	private String hotelCheckInTime;

	/**
	 * 酒店离店时间
	 */
	@ApiField("hotel_check_out_time")
	private String hotelCheckOutTime;

	/**
	 * 酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/**
	 * 高德坐标系下的纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 高德坐标系下的经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 身份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 支付宝域店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getHotelAddress() {
		return this.hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelCheckInTime() {
		return this.hotelCheckInTime;
	}
	public void setHotelCheckInTime(String hotelCheckInTime) {
		this.hotelCheckInTime = hotelCheckInTime;
	}

	public String getHotelCheckOutTime() {
		return this.hotelCheckOutTime;
	}
	public void setHotelCheckOutTime(String hotelCheckOutTime) {
		this.hotelCheckOutTime = hotelCheckOutTime;
	}

	public String getHotelName() {
		return this.hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}

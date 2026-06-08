package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先进药品门店信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:39:28
 */
public class ProviderShop extends AlipayObject {

	private static final long serialVersionUID = 3869435495956849136L;

	/**
	 * 门店营业时间
	 */
	@ApiField("business_hours")
	private String businessHours;

	/**
	 * 商家门店营业周期
	 */
	@ApiField("business_weeks")
	private String businessWeeks;

	/**
	 * 商家门店详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

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
	 * 门店区域
	 */
	@ApiField("shop_area")
	private String shopArea;

	/**
	 * 商家门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店电话
	 */
	@ApiField("shop_phone_num")
	private String shopPhoneNum;

	public String getBusinessHours() {
		return this.businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getBusinessWeeks() {
		return this.businessWeeks;
	}
	public void setBusinessWeeks(String businessWeeks) {
		this.businessWeeks = businessWeeks;
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

	public String getShopArea() {
		return this.shopArea;
	}
	public void setShopArea(String shopArea) {
		this.shopArea = shopArea;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopPhoneNum() {
		return this.shopPhoneNum;
	}
	public void setShopPhoneNum(String shopPhoneNum) {
		this.shopPhoneNum = shopPhoneNum;
	}

}

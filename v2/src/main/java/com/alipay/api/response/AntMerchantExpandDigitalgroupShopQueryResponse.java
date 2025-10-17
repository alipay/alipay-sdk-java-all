package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.digitalgroup.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 14:22:40
 */
public class AntMerchantExpandDigitalgroupShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1774561887534933797L;

	/** 
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 门店经营时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/** 
	 * 类目
	 */
	@ApiField("category_final")
	private String categoryFinal;

	/** 
	 * 餐饮
	 */
	@ApiField("category_one")
	private String categoryOne;

	/** 
	 * 市
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 店铺联系电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/** 
	 * 数字化门店ID
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	/** 
	 * 区
	 */
	@ApiField("district")
	private String district;

	/** 
	 * 高德门店名称
	 */
	@ApiField("g_name")
	private String gName;

	/** 
	 * 高德门店ID
	 */
	@ApiField("g_shopid")
	private String gShopid;

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
	@ApiField("province")
	private String province;

	/** 
	 * 门店经营状态
	 */
	@ApiField("shop_business_status")
	private String shopBusinessStatus;

	/** 
	 * 门店状态
	 */
	@ApiField("status")
	private String status;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}
	public String getBusinessTime( ) {
		return this.businessTime;
	}

	public void setCategoryFinal(String categoryFinal) {
		this.categoryFinal = categoryFinal;
	}
	public String getCategoryFinal( ) {
		return this.categoryFinal;
	}

	public void setCategoryOne(String categoryOne) {
		this.categoryOne = categoryOne;
	}
	public String getCategoryOne( ) {
		return this.categoryOne;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone( ) {
		return this.contactPhone;
	}

	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}
	public String getDigitalPoiId( ) {
		return this.digitalPoiId;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDistrict( ) {
		return this.district;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgName( ) {
		return this.gName;
	}

	public void setgShopid(String gShopid) {
		this.gShopid = gShopid;
	}
	public String getgShopid( ) {
		return this.gShopid;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

	public void setShopBusinessStatus(String shopBusinessStatus) {
		this.shopBusinessStatus = shopBusinessStatus;
	}
	public String getShopBusinessStatus( ) {
		return this.shopBusinessStatus;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 油站信息
 *
 * @author auto create
 * @since 1.0, 2019-11-20 15:02:03
 */
public class OilStationInfo extends AlipayObject {

	private static final long serialVersionUID = 8236839779673877545L;

	/**
	 * 油站详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝内部的门店编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 小程序名
	 */
	@ApiField("applet_name")
	private String appletName;

	/**
	 * 直降金额
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 跳转isv小程序跳转地址
	 */
	@ApiField("isv_url")
	private String isvUrl;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 油站logo地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 油站名称
	 */
	@ApiField("oil_station_name")
	private String oilStationName;

	/**
	 * 油品
	 */
	@ApiField("oil_type")
	private String oilType;

	/**
	 * 签约ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 高德 Poid
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 油价，以元为单位
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 油站门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商家内部的门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getAppletName() {
		return this.appletName;
	}
	public void setAppletName(String appletName) {
		this.appletName = appletName;
	}

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getIsvUrl() {
		return this.isvUrl;
	}
	public void setIsvUrl(String isvUrl) {
		this.isvUrl = isvUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOilStationName() {
		return this.oilStationName;
	}
	public void setOilStationName(String oilStationName) {
		this.oilStationName = oilStationName;
	}

	public String getOilType() {
		return this.oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}

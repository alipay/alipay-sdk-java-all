package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店拓展字段
 *
 * @author auto create
 * @since 1.0, 2022-01-10 20:27:14
 */
public class StoreExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 5189245722622375639L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店地址补充信息
	 */
	@ApiField("address_ext_info")
	private String addressExtInfo;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 纬度坐标
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度坐标
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 电话号码
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 行业id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressExtInfo() {
		return this.addressExtInfo;
	}
	public void setAddressExtInfo(String addressExtInfo) {
		this.addressExtInfo = addressExtInfo;
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

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}

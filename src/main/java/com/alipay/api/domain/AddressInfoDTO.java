package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址详情返回信息
 *
 * @author auto create
 * @since 1.0, 2022-08-12 10:51:18
 */
public class AddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8694997771863588646L;

	/**
	 * 共同账户id和enterprise_id二选一
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 市(国家统一行政规划编码)
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 小区/楼宇
	 */
	@ApiField("community")
	private String community;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 备注
	 */
	@ApiField("mark")
	private String mark;

	/**
	 * 地图poi
	 */
	@ApiField("poi_id")
	private String poiId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

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

	public String getCommunity() {
		return this.community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public String getMark() {
		return this.mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

}

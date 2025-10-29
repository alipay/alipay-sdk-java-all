package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户店铺信息
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:36:51
 */
public class StoreVO extends AlipayObject {

	private static final long serialVersionUID = 1593985238792713113L;

	/**
	 * 门店纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * APP方门店ID
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 平台方门店ID
	 */
	@ApiField("store_id")
	private Long storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 门店电话
	 */
	@ApiField("store_phone")
	private String storePhone;

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

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStorePhone() {
		return this.storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:30:27
 */
public class SolWifiShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8828168113288584444L;

	/**
	 * 1：新增必传；
2：修改可传，不传不修改；
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 1：新增必传；
2：修改可传，不传不修改；
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 1：新增可传；
2：修改可传，不传不修改；
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 1：新增必传；
2：修改可传，不传不修改；
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 1：新增必传;
2：修改可不传，不传不改;
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 1：新增必传;
2：修改可传，不传不改;
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 1：新增可传；
2：修改可传，不传不修改；
	 */
	@ApiField("door_number")
	private String doorNumber;

	/**
	 * 1：新增可不传，默认ENABLE;
2：修改可不传，默认不变更;
	 */
	@ApiField("enable_flag")
	private String enableFlag;

	/**
	 * 1：新增可传；
2：修改可传，不传不修改；
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 1：新增可传；
2：修改可传，不传不修改；
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 1：新增可传；
2：修改可传，不传不修改；
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 1：新增可传；
2：修改可传，不传不修改；
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 1：新增可不传;
2：修改必传;
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 1：新增必传；
2：修改可传，不传不修改；
	 */
	@ApiField("shop_name")
	private String shopName;

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

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDoorNumber() {
		return this.doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getEnableFlag() {
		return this.enableFlag;
	}
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}

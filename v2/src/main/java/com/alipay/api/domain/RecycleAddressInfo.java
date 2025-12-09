package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收地址信息
 *
 * @author auto create
 * @since 1.0, 2025-05-20 20:50:50
 */
public class RecycleAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 8236526682759756923L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 上门时间
	 */
	@ApiField("best_time")
	private String bestTime;

	/**
	 * 市行政编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 小区Id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 区行政编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 地址维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 联系人
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省行政编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 回收方式
	 */
	@ApiField("source")
	private String source;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBestTime() {
		return this.bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}

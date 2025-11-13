package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校区点位信息
 *
 * @author auto create
 * @since 1.0, 2025-04-24 10:58:34
 */
public class CampusPointDetail extends AlipayObject {

	private static final long serialVersionUID = 5456488663359483237L;

	/**
	 * 校区详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 校区围栏唯一编码
	 */
	@ApiField("aoi_id")
	private String aoiId;

	/**
	 * 校区ID
	 */
	@ApiField("campus_id")
	private String campusId;

	/**
	 * 校区名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 当前入参的经纬度与当前校区中心点位的距离，单位米
	 */
	@ApiField("dist")
	private String dist;

	/**
	 * 区县名称
	 */
	@ApiField("district")
	private String district;

	/**
	 * 区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 学校ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学校名称
	 */
	@ApiField("inst_name")
	private String instName;

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
	 * 省份中文名称
	 */
	@ApiField("province")
	private String province;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAoiId() {
		return this.aoiId;
	}
	public void setAoiId(String aoiId) {
		this.aoiId = aoiId;
	}

	public String getCampusId() {
		return this.campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDist() {
		return this.dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}

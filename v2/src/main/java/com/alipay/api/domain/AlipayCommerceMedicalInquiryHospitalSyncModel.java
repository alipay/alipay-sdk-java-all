package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互联网医院医院数据同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 20:57:47
 */
public class AlipayCommerceMedicalInquiryHospitalSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4641977491568451827L;

	/**
	 * 院区类型
	 */
	@ApiField("campus_type")
	private String campusType;

	/**
	 * 市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 数据版本号
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 医院地址
	 */
	@ApiField("hospital_address")
	private String hospitalAddress;

	/**
	 * 医院分类
	 */
	@ApiField("hospital_category")
	private String hospitalCategory;

	/**
	 * 三方医院编码
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院简介
	 */
	@ApiField("hospital_introduce")
	private String hospitalIntroduce;

	/**
	 * 医院等级
	 */
	@ApiField("hospital_level")
	private String hospitalLevel;

	/**
	 * 医院 logo
	 */
	@ApiField("hospital_logo")
	private String hospitalLogo;

	/**
	 * 三方医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 医院状态
	 */
	@ApiField("hospital_status")
	private String hospitalStatus;

	/**
	 * 医院电话
	 */
	@ApiField("hospital_telephone")
	private String hospitalTelephone;

	/**
	 * 医院类型
	 */
	@ApiField("hospital_type")
	private String hospitalType;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 医院纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 医院经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 机构编码
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 医院特色
	 */
	@ApiField("special")
	private String special;

	public String getCampusType() {
		return this.campusType;
	}
	public void setCampusType(String campusType) {
		this.campusType = campusType;
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

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
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

	public String getHospitalAddress() {
		return this.hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalCategory() {
		return this.hospitalCategory;
	}
	public void setHospitalCategory(String hospitalCategory) {
		this.hospitalCategory = hospitalCategory;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalIntroduce() {
		return this.hospitalIntroduce;
	}
	public void setHospitalIntroduce(String hospitalIntroduce) {
		this.hospitalIntroduce = hospitalIntroduce;
	}

	public String getHospitalLevel() {
		return this.hospitalLevel;
	}
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}

	public String getHospitalLogo() {
		return this.hospitalLogo;
	}
	public void setHospitalLogo(String hospitalLogo) {
		this.hospitalLogo = hospitalLogo;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalStatus() {
		return this.hospitalStatus;
	}
	public void setHospitalStatus(String hospitalStatus) {
		this.hospitalStatus = hospitalStatus;
	}

	public String getHospitalTelephone() {
		return this.hospitalTelephone;
	}
	public void setHospitalTelephone(String hospitalTelephone) {
		this.hospitalTelephone = hospitalTelephone;
	}

	public String getHospitalType() {
		return this.hospitalType;
	}
	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
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

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
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

	public String getSpecial() {
		return this.special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}

}

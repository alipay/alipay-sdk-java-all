package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 住院信息
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class CareInfo extends AlipayObject {

	private static final long serialVersionUID = 8461665644663845677L;

	/**
	 * 床头卡照片URL
	 */
	@ApiListField("bed_card_photo_url_list")
	@ApiField("string")
	private List<String> bedCardPhotoUrlList;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 住院科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * true/false
	 */
	@ApiField("external_caregiver")
	private Boolean externalCaregiver;

	/**
	 * 详细地址
	 */
	@ApiField("hospital_address")
	private String hospitalAddress;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 本次住院日期
	 */
	@ApiField("inpatient_date")
	private String inpatientDate;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 服务天数
	 */
	@ApiField("service_days")
	private String serviceDays;

	/**
	 * 入院服务开始时间
	 */
	@ApiField("service_start_time")
	private String serviceStartTime;

	public List<String> getBedCardPhotoUrlList() {
		return this.bedCardPhotoUrlList;
	}
	public void setBedCardPhotoUrlList(List<String> bedCardPhotoUrlList) {
		this.bedCardPhotoUrlList = bedCardPhotoUrlList;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Boolean getExternalCaregiver() {
		return this.externalCaregiver;
	}
	public void setExternalCaregiver(Boolean externalCaregiver) {
		this.externalCaregiver = externalCaregiver;
	}

	public String getHospitalAddress() {
		return this.hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getInpatientDate() {
		return this.inpatientDate;
	}
	public void setInpatientDate(String inpatientDate) {
		this.inpatientDate = inpatientDate;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getServiceDays() {
		return this.serviceDays;
	}
	public void setServiceDays(String serviceDays) {
		this.serviceDays = serviceDays;
	}

	public String getServiceStartTime() {
		return this.serviceStartTime;
	}
	public void setServiceStartTime(String serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 就诊信息
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:54:21
 */
public class ClinicInfo extends AlipayObject {

	private static final long serialVersionUID = 5248229251912679495L;

	/**
	 * 期望就诊结束时间
	 */
	@ApiField("appointment_end_time")
	private String appointmentEndTime;

	/**
	 * 期望就诊开始时间
	 */
	@ApiField("appointment_start_time")
	private String appointmentStartTime;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("appointment_time")
	private String appointmentTime;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 就诊城市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 就诊类别
	 */
	@ApiField("clinic_category")
	private String clinicCategory;

	/**
	 * 当前所在城市
	 */
	@ApiField("current_city")
	private String currentCity;

	/**
	 * 就诊科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 就诊区县
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 期望就诊专家
	 */
	@ApiField("expert")
	private String expert;

	/**
	 * 医院详细地址
	 */
	@ApiField("hospital_address")
	private String hospitalAddress;

	/**
	 * 就诊医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 多个URL列表
	 */
	@ApiListField("medical_record_url_list")
	@ApiField("string")
	private List<String> medicalRecordUrlList;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 就诊省份
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getAppointmentEndTime() {
		return this.appointmentEndTime;
	}
	public void setAppointmentEndTime(String appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}

	public String getAppointmentStartTime() {
		return this.appointmentStartTime;
	}
	public void setAppointmentStartTime(String appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	public String getAppointmentTime() {
		return this.appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
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

	public String getClinicCategory() {
		return this.clinicCategory;
	}
	public void setClinicCategory(String clinicCategory) {
		this.clinicCategory = clinicCategory;
	}

	public String getCurrentCity() {
		return this.currentCity;
	}
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
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

	public String getExpert() {
		return this.expert;
	}
	public void setExpert(String expert) {
		this.expert = expert;
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

	public List<String> getMedicalRecordUrlList() {
		return this.medicalRecordUrlList;
	}
	public void setMedicalRecordUrlList(List<String> medicalRecordUrlList) {
		this.medicalRecordUrlList = medicalRecordUrlList;
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

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class HmAppointInfo extends AlipayObject {

	private static final long serialVersionUID = 8397177765147677179L;

	/**
	 * 年龄
	 */
	@ApiField("appoint_age")
	private String appointAge;

	/**
	 * 出生年月日（yyyy-MM-dd）
	 */
	@ApiField("appoint_birthday")
	private String appointBirthday;

	/**
	 * 证件号码
	 */
	@ApiField("appoint_certificate_no")
	private String appointCertificateNo;

	/**
	 * 证件类型
	 */
	@ApiField("appoint_certificate_type")
	private String appointCertificateType;

	/**
	 * 所在城市
	 */
	@ApiField("appoint_city")
	private String appointCity;

	/**
	 * 需求或病情描述
	 */
	@ApiField("appoint_description")
	private String appointDescription;

	/**
	 * 性别
	 */
	@ApiField("appoint_gender")
	private String appointGender;

	/**
	 * 就诊医院名称
	 */
	@ApiField("appoint_hospital")
	private String appointHospital;

	/**
	 * 就诊医院科室
	 */
	@ApiField("appoint_hospital_department")
	private String appointHospitalDepartment;

	/**
	 * 预约姓名
	 */
	@ApiField("appoint_name")
	private String appointName;

	/**
	 * 预约手机号
	 */
	@ApiField("appoint_number")
	private String appointNumber;

	/**
	 * 服务类型
	 */
	@ApiField("appoint_service_type")
	private String appointServiceType;

	/**
	 * 预约就诊时间（yyyy-MM-dd HH:mm）
	 */
	@ApiField("appoint_time")
	private String appointTime;

	public String getAppointAge() {
		return this.appointAge;
	}
	public void setAppointAge(String appointAge) {
		this.appointAge = appointAge;
	}

	public String getAppointBirthday() {
		return this.appointBirthday;
	}
	public void setAppointBirthday(String appointBirthday) {
		this.appointBirthday = appointBirthday;
	}

	public String getAppointCertificateNo() {
		return this.appointCertificateNo;
	}
	public void setAppointCertificateNo(String appointCertificateNo) {
		this.appointCertificateNo = appointCertificateNo;
	}

	public String getAppointCertificateType() {
		return this.appointCertificateType;
	}
	public void setAppointCertificateType(String appointCertificateType) {
		this.appointCertificateType = appointCertificateType;
	}

	public String getAppointCity() {
		return this.appointCity;
	}
	public void setAppointCity(String appointCity) {
		this.appointCity = appointCity;
	}

	public String getAppointDescription() {
		return this.appointDescription;
	}
	public void setAppointDescription(String appointDescription) {
		this.appointDescription = appointDescription;
	}

	public String getAppointGender() {
		return this.appointGender;
	}
	public void setAppointGender(String appointGender) {
		this.appointGender = appointGender;
	}

	public String getAppointHospital() {
		return this.appointHospital;
	}
	public void setAppointHospital(String appointHospital) {
		this.appointHospital = appointHospital;
	}

	public String getAppointHospitalDepartment() {
		return this.appointHospitalDepartment;
	}
	public void setAppointHospitalDepartment(String appointHospitalDepartment) {
		this.appointHospitalDepartment = appointHospitalDepartment;
	}

	public String getAppointName() {
		return this.appointName;
	}
	public void setAppointName(String appointName) {
		this.appointName = appointName;
	}

	public String getAppointNumber() {
		return this.appointNumber;
	}
	public void setAppointNumber(String appointNumber) {
		this.appointNumber = appointNumber;
	}

	public String getAppointServiceType() {
		return this.appointServiceType;
	}
	public void setAppointServiceType(String appointServiceType) {
		this.appointServiceType = appointServiceType;
	}

	public String getAppointTime() {
		return this.appointTime;
	}
	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

}

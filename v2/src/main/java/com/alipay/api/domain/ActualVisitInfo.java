package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就医信息
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:54:22
 */
public class ActualVisitInfo extends AlipayObject {

	private static final long serialVersionUID = 2178317383492938712L;

	/**
	 * 就医信息-就诊城市
	 */
	@ApiField("actual_city")
	private String actualCity;

	/**
	 * 就医信息-就诊科室
	 */
	@ApiField("actual_department")
	private String actualDepartment;

	/**
	 * 就医信息-就诊医院
	 */
	@ApiField("actual_hospital")
	private String actualHospital;

	/**
	 * 就医信息-医生职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 就医信息-就诊专家
	 */
	@ApiField("expert")
	private String expert;

	/**
	 * 就医信息-医院地址
	 */
	@ApiField("hospital_address")
	private String hospitalAddress;

	/**
	 * 就医信息-用户相关描述
	 */
	@ApiField("user_desc")
	private String userDesc;

	/**
	 * 就医信息-就诊结束时间
	 */
	@ApiField("visit_end_time")
	private String visitEndTime;

	/**
	 * 就医信息-就诊开始时间
	 */
	@ApiField("visit_start_time")
	private String visitStartTime;

	public String getActualCity() {
		return this.actualCity;
	}
	public void setActualCity(String actualCity) {
		this.actualCity = actualCity;
	}

	public String getActualDepartment() {
		return this.actualDepartment;
	}
	public void setActualDepartment(String actualDepartment) {
		this.actualDepartment = actualDepartment;
	}

	public String getActualHospital() {
		return this.actualHospital;
	}
	public void setActualHospital(String actualHospital) {
		this.actualHospital = actualHospital;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
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

	public String getUserDesc() {
		return this.userDesc;
	}
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public String getVisitEndTime() {
		return this.visitEndTime;
	}
	public void setVisitEndTime(String visitEndTime) {
		this.visitEndTime = visitEndTime;
	}

	public String getVisitStartTime() {
		return this.visitStartTime;
	}
	public void setVisitStartTime(String visitStartTime) {
		this.visitStartTime = visitStartTime;
	}

}

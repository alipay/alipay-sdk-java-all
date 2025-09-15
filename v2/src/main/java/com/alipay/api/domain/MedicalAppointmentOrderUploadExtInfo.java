package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 挂号单扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-02-05 10:33:53
 */
public class MedicalAppointmentOrderUploadExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5236726111416389393L;

	/**
	 * 叫号进度入口链接
	 */
	@ApiField("call_num_url")
	private String callNumUrl;

	/**
	 * 就诊科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 科室位置
	 */
	@ApiField("dept_loc")
	private String deptLoc;

	/**
	 * 诊室编号
	 */
	@ApiField("dept_num")
	private String deptNum;

	/**
	 * 医生名称
	 */
	@ApiField("doctor")
	private String doctor;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生职级
	 */
	@ApiField("doctor_rank")
	private String doctorRank;

	/**
	 * 医院名称
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 医院登记号类型
	 */
	@ApiField("hospital_id_type")
	private String hospitalIdType;

	/**
	 * 医院登记号
	 */
	@ApiField("hospital_register_id")
	private String hospitalRegisterId;

	/**
	 * 就诊序号
	 */
	@ApiField("medical_num")
	private String medicalNum;

	/**
	 * 订单链接
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 导航地址
	 */
	@ApiField("navigation")
	private String navigation;

	/**
	 * 就诊人姓名
	 */
	@ApiField("patient")
	private String patient;

	/**
	 * 预约日期
	 */
	@ApiField("scheduled_time")
	private Date scheduledTime;

	/**
	 * 预约的就诊时间段
	 */
	@ApiField("scheduled_time_period")
	private String scheduledTimePeriod;

	/**
	 * 取号入口链接
	 */
	@ApiField("take_num_url")
	private String takeNumUrl;

	public String getCallNumUrl() {
		return this.callNumUrl;
	}
	public void setCallNumUrl(String callNumUrl) {
		this.callNumUrl = callNumUrl;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDeptLoc() {
		return this.deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public String getDeptNum() {
		return this.deptNum;
	}
	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public String getDoctor() {
		return this.doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorRank() {
		return this.doctorRank;
	}
	public void setDoctorRank(String doctorRank) {
		this.doctorRank = doctorRank;
	}

	public String getHospital() {
		return this.hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getHospitalIdType() {
		return this.hospitalIdType;
	}
	public void setHospitalIdType(String hospitalIdType) {
		this.hospitalIdType = hospitalIdType;
	}

	public String getHospitalRegisterId() {
		return this.hospitalRegisterId;
	}
	public void setHospitalRegisterId(String hospitalRegisterId) {
		this.hospitalRegisterId = hospitalRegisterId;
	}

	public String getMedicalNum() {
		return this.medicalNum;
	}
	public void setMedicalNum(String medicalNum) {
		this.medicalNum = medicalNum;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getNavigation() {
		return this.navigation;
	}
	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}

	public String getPatient() {
		return this.patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}

	public Date getScheduledTime() {
		return this.scheduledTime;
	}
	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getScheduledTimePeriod() {
		return this.scheduledTimePeriod;
	}
	public void setScheduledTimePeriod(String scheduledTimePeriod) {
		this.scheduledTimePeriod = scheduledTimePeriod;
	}

	public String getTakeNumUrl() {
		return this.takeNumUrl;
	}
	public void setTakeNumUrl(String takeNumUrl) {
		this.takeNumUrl = takeNumUrl;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道就诊预约状态同步
 *
 * @author auto create
 * @since 1.0, 2025-12-26 19:22:44
 */
public class AlipayCommerceMedicalInsuranceTpaappointmentstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5878345652482857143L;

	/**
	 * 预约单号
	 */
	@ApiField("appointment_no")
	private String appointmentNo;

	/**
	 * 预约结果状态
	 */
	@ApiField("appointment_status")
	private String appointmentStatus;

	/**
	 * 预约状态描述
	 */
	@ApiField("appointment_status_msg")
	private String appointmentStatusMsg;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 就诊科室
	 */
	@ApiField("visit_department")
	private String visitDepartment;

	/**
	 * 就诊机构
	 */
	@ApiField("visit_hospital")
	private String visitHospital;

	/**
	 * 就诊机构地址
	 */
	@ApiField("visit_hospital_address")
	private String visitHospitalAddress;

	/**
	 * 就诊机构码
	 */
	@ApiField("visit_hospital_code")
	private String visitHospitalCode;

	/**
	 * 就诊门店编码
	 */
	@ApiField("visit_store_code")
	private String visitStoreCode;

	/**
	 * 就诊时间
	 */
	@ApiField("visit_time")
	private String visitTime;

	public String getAppointmentNo() {
		return this.appointmentNo;
	}
	public void setAppointmentNo(String appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public String getAppointmentStatus() {
		return this.appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public String getAppointmentStatusMsg() {
		return this.appointmentStatusMsg;
	}
	public void setAppointmentStatusMsg(String appointmentStatusMsg) {
		this.appointmentStatusMsg = appointmentStatusMsg;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVisitDepartment() {
		return this.visitDepartment;
	}
	public void setVisitDepartment(String visitDepartment) {
		this.visitDepartment = visitDepartment;
	}

	public String getVisitHospital() {
		return this.visitHospital;
	}
	public void setVisitHospital(String visitHospital) {
		this.visitHospital = visitHospital;
	}

	public String getVisitHospitalAddress() {
		return this.visitHospitalAddress;
	}
	public void setVisitHospitalAddress(String visitHospitalAddress) {
		this.visitHospitalAddress = visitHospitalAddress;
	}

	public String getVisitHospitalCode() {
		return this.visitHospitalCode;
	}
	public void setVisitHospitalCode(String visitHospitalCode) {
		this.visitHospitalCode = visitHospitalCode;
	}

	public String getVisitStoreCode() {
		return this.visitStoreCode;
	}
	public void setVisitStoreCode(String visitStoreCode) {
		this.visitStoreCode = visitStoreCode;
	}

	public String getVisitTime() {
		return this.visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

}

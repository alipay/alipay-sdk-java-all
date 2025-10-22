package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扁鹊获取健康档案就诊人
 *
 * @author auto create
 * @since 1.0, 2025-07-01 11:27:41
 */
public class AlipayCommerceMedicalMedagentPatientQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4441795295758913347L;

	/**
	 * 扁鹊诊后系统内部uid
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 蚂蚁侧医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 就诊人出生日期
	 */
	@ApiField("patient_birth")
	private String patientBirth;

	/**
	 * 就诊人证件号
	 */
	@ApiField("patient_cert_no")
	private String patientCertNo;

	/**
	 * 就诊人证件类型
	 */
	@ApiField("patient_cert_type")
	private String patientCertType;

	/**
	 * 就诊人性别
	 */
	@ApiField("patient_gender")
	private String patientGender;

	/**
	 * 就诊人姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 就诊人角色
	 */
	@ApiField("patient_role")
	private String patientRole;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPatientBirth() {
		return this.patientBirth;
	}
	public void setPatientBirth(String patientBirth) {
		this.patientBirth = patientBirth;
	}

	public String getPatientCertNo() {
		return this.patientCertNo;
	}
	public void setPatientCertNo(String patientCertNo) {
		this.patientCertNo = patientCertNo;
	}

	public String getPatientCertType() {
		return this.patientCertType;
	}
	public void setPatientCertType(String patientCertType) {
		this.patientCertType = patientCertType;
	}

	public String getPatientGender() {
		return this.patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientRole() {
		return this.patientRole;
	}
	public void setPatientRole(String patientRole) {
		this.patientRole = patientRole;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

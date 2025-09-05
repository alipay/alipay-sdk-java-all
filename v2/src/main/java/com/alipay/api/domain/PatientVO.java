package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就诊人信息
 *
 * @author auto create
 * @since 1.0, 2025-07-01 11:27:41
 */
public class PatientVO extends AlipayObject {

	private static final long serialVersionUID = 3893824672445299475L;

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
	 * 就诊人性别
	 */
	@ApiField("patient_gender")
	private String patientGender;

	/**
	 * 就诊人ID
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 就诊人姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getPatientGender() {
		return this.patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

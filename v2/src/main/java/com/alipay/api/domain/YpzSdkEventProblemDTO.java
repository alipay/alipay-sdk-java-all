package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-09 15:50:46
 */
public class YpzSdkEventProblemDTO extends AlipayObject {

	private static final long serialVersionUID = 8755376897255665276L;

	/**
	 * 预约编号
	 */
	@ApiField("appointment_no")
	private String appointmentNo;

	/**
	 * 预约日期时间
	 */
	@ApiField("appointment_time")
	private String appointmentTime;

	/**
	 * 院区代码
	 */
	@ApiField("campus_code")
	private String campusCode;

	/**
	 * 院区名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 正确示例
	 */
	@ApiField("correct_example")
	private String correctExample;

	/**
	 * 事件编码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 事件标识
	 */
	@ApiField("event_identifier")
	private String eventIdentifier;

	/**
	 * 事件名称
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 事件发生时间
	 */
	@ApiField("event_occur_time")
	private String eventOccurTime;

	/**
	 * 事件更新时间
	 */
	@ApiField("event_update_time")
	private String eventUpdateTime;

	/**
	 * 事件落库创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 医疗机构名称
	 */
	@ApiField("medical_institution_name")
	private String medicalInstitutionName;

	/**
	 * 问题描述
	 */
	@ApiField("problem_description")
	private String problemDescription;

	/**
	 * 问题字段
	 */
	@ApiField("problem_field")
	private String problemField;

	/**
	 * 挂号流水号
	 */
	@ApiField("registration_no")
	private String registrationNo;

	/**
	 * 挂号时间
	 */
	@ApiField("registration_time")
	private String registrationTime;

	/**
	 * 医疗机构统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getAppointmentNo() {
		return this.appointmentNo;
	}
	public void setAppointmentNo(String appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public String getAppointmentTime() {
		return this.appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getCampusCode() {
		return this.campusCode;
	}
	public void setCampusCode(String campusCode) {
		this.campusCode = campusCode;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getCorrectExample() {
		return this.correctExample;
	}
	public void setCorrectExample(String correctExample) {
		this.correctExample = correctExample;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventIdentifier() {
		return this.eventIdentifier;
	}
	public void setEventIdentifier(String eventIdentifier) {
		this.eventIdentifier = eventIdentifier;
	}

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventOccurTime() {
		return this.eventOccurTime;
	}
	public void setEventOccurTime(String eventOccurTime) {
		this.eventOccurTime = eventOccurTime;
	}

	public String getEventUpdateTime() {
		return this.eventUpdateTime;
	}
	public void setEventUpdateTime(String eventUpdateTime) {
		this.eventUpdateTime = eventUpdateTime;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMedicalInstitutionName() {
		return this.medicalInstitutionName;
	}
	public void setMedicalInstitutionName(String medicalInstitutionName) {
		this.medicalInstitutionName = medicalInstitutionName;
	}

	public String getProblemDescription() {
		return this.problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public String getProblemField() {
		return this.problemField;
	}
	public void setProblemField(String problemField) {
		this.problemField = problemField;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRegistrationTime() {
		return this.registrationTime;
	}
	public void setRegistrationTime(String registrationTime) {
		this.registrationTime = registrationTime;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}

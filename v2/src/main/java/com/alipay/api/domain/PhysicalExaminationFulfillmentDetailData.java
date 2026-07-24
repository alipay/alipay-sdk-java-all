package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体检服务
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:54:22
 */
public class PhysicalExaminationFulfillmentDetailData extends AlipayObject {

	private static final long serialVersionUID = 3158966537731158563L;

	/**
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("appointment_end_time")
	private String appointmentEndTime;

	/**
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("appointment_start_time")
	private String appointmentStartTime;

	/**
	 * 格式:yyyy-MM-dd
	 */
	@ApiField("birth_date")
	private String birthDate;

	/**
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("cancel_time")
	private String cancelTime;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * IDENTITY_CARD - 身份证 HOUSEHOLD_REGISTER - 户口本 OTHER - 其他
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 体检人
	 */
	@ApiField("examinee_name")
	private String examineeName;

	/**
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 0-女1-男
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * MARRIED - 已婚UNMARRIED - 未婚
	 */
	@ApiField("marital_status")
	private String maritalStatus;

	/**
	 * 套餐名称，如:体检350元老年套餐
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 联系电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 如:浙江省杭州市
	 */
	@ApiField("service_city")
	private String serviceCity;

	/**
	 * 如:上海交通大学附属瑞金医院体检中心
	 */
	@ApiField("service_institution")
	private String serviceInstitution;

	/**
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private String updateTime;

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

	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExamineeName() {
		return this.examineeName;
	}
	public void setExamineeName(String examineeName) {
		this.examineeName = examineeName;
	}

	public String getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getServiceCity() {
		return this.serviceCity;
	}
	public void setServiceCity(String serviceCity) {
		this.serviceCity = serviceCity;
	}

	public String getServiceInstitution() {
		return this.serviceInstitution;
	}
	public void setServiceInstitution(String serviceInstitution) {
		this.serviceInstitution = serviceInstitution;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}

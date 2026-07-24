package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高端医疗对象
 *
 * @author auto create
 * @since 1.0, 2026-07-03 17:56:03
 */
public class HighEndMedicalFulfillmentDetailData extends AlipayObject {

	private static final long serialVersionUID = 6717375958954623334L;

	/**
	 * 预约备选时间
	 */
	@ApiField("alternative_time")
	private String alternativeTime;

	/**
	 * 预约时间（预约中时必填，格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("appointment_time")
	private String appointmentTime;

	/**
	 * 账单金额（已核销时必填）
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 出生日期（格式: 1999-02-01）
	 */
	@ApiField("birth_day")
	private String birthDay;

	/**
	 * 确认时间（预约成功时必填）
	 */
	@ApiField("confirm_time")
	private String confirmTime;

	/**
	 * 预约科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/**
	 * 履约状态
	 */
	@ApiField("fulfillment_status")
	private String fulfillmentStatus;

	/**
	 * 医院门店名称（预约中时必填）
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * ISV侧订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 证件号码（预约中时必填）
	 */
	@ApiField("patient_cert_no")
	private String patientCertNo;

	/**
	 * 证件类型（预约中时必填）
	 */
	@ApiField("patient_cert_type")
	private String patientCertType;

	/**
	 * 就诊人性别(0 女 1 男)
	 */
	@ApiField("patient_gender")
	private String patientGender;

	/**
	 * 就诊人姓名（预约中时必填）
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 就诊人手机号（预约中时必填）
	 */
	@ApiField("patient_phone")
	private String patientPhone;

	/**
	 * 产品类型：单次卡/多次卡（已核销时必填）
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 备注（预约失败/取消原因）
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 症状
	 */
	@ApiField("symptom")
	private String symptom;

	/**
	 * 总次数（已核销时必填）
	 */
	@ApiField("total_times")
	private Long totalTimes;

	/**
	 * 履约类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 已使用次数（已核销时必填）
	 */
	@ApiField("used_times")
	private Long usedTimes;

	public String getAlternativeTime() {
		return this.alternativeTime;
	}
	public void setAlternativeTime(String alternativeTime) {
		this.alternativeTime = alternativeTime;
	}

	public String getAppointmentTime() {
		return this.appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBirthDay() {
		return this.birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFulfillmentNo() {
		return this.fulfillmentNo;
	}
	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}

	public String getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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

	public String getPatientPhone() {
		return this.patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSymptom() {
		return this.symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public Long getTotalTimes() {
		return this.totalTimes;
	}
	public void setTotalTimes(Long totalTimes) {
		this.totalTimes = totalTimes;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUsedTimes() {
		return this.usedTimes;
	}
	public void setUsedTimes(Long usedTimes) {
		this.usedTimes = usedTimes;
	}

}

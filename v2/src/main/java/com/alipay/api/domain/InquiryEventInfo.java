package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊事件详情
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:37:41
 */
public class InquiryEventInfo extends AlipayObject {

	private static final long serialVersionUID = 6122284988524121137L;

	/**
	 * 问诊小结链接URL
	 */
	@ApiField("consult_summary_url")
	private String consultSummaryUrl;

	/**
	 * 问诊时间
	 */
	@ApiField("consult_time")
	private Date consultTime;

	/**
	 * 接诊医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 处方链接URL
	 */
	@ApiField("prescription_url")
	private String prescriptionUrl;

	/**
	 * 预约跳转链接
	 */
	@ApiField("reserve_jump_url")
	private String reserveJumpUrl;

	/**
	 * 预约医生姓名
	 */
	@ApiField("reserved_doctor_name")
	private String reservedDoctorName;

	/**
	 * 预约时间
	 */
	@ApiField("reserved_time")
	private Date reservedTime;

	public String getConsultSummaryUrl() {
		return this.consultSummaryUrl;
	}
	public void setConsultSummaryUrl(String consultSummaryUrl) {
		this.consultSummaryUrl = consultSummaryUrl;
	}

	public Date getConsultTime() {
		return this.consultTime;
	}
	public void setConsultTime(Date consultTime) {
		this.consultTime = consultTime;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPrescriptionUrl() {
		return this.prescriptionUrl;
	}
	public void setPrescriptionUrl(String prescriptionUrl) {
		this.prescriptionUrl = prescriptionUrl;
	}

	public String getReserveJumpUrl() {
		return this.reserveJumpUrl;
	}
	public void setReserveJumpUrl(String reserveJumpUrl) {
		this.reserveJumpUrl = reserveJumpUrl;
	}

	public String getReservedDoctorName() {
		return this.reservedDoctorName;
	}
	public void setReservedDoctorName(String reservedDoctorName) {
		this.reservedDoctorName = reservedDoctorName;
	}

	public Date getReservedTime() {
		return this.reservedTime;
	}
	public void setReservedTime(Date reservedTime) {
		this.reservedTime = reservedTime;
	}

}

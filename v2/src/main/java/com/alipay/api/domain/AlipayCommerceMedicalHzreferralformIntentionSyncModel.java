package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 杭州数字家医转诊意向反馈
 *
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:22
 */
public class AlipayCommerceMedicalHzreferralformIntentionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2136795392671572994L;

	/**
	 * 备注，解释医生的审核结果，转诊失败时必须传
	 */
	@ApiField("doctor_remark")
	private String doctorRemark;

	/**
	 * 医生处理转诊的时间
	 */
	@ApiField("process_time")
	private String processTime;

	/**
	 * 转诊单单号，为转诊单表的主键，自动生成，提供给外部使用
	 */
	@ApiField("referral_form_id")
	private String referralFormId;

	/**
	 * 转诊单状态：1-已转诊、0-拒绝
	 */
	@ApiField("status")
	private String status;

	/**
	 * 就诊科室，提供给用户查看就诊成功后的就诊信息
	 */
	@ApiField("visit_department")
	private String visitDepartment;

	/**
	 * 就诊医生，提供给用户查看就诊成功后的就诊信息
	 */
	@ApiField("visit_doctor")
	private String visitDoctor;

	/**
	 * 就诊医院，提供给用户查看就诊成功后的就诊信息
	 */
	@ApiField("visit_hospital")
	private String visitHospital;

	/**
	 * 医生选择的就诊时间
	 */
	@ApiField("visit_time")
	private String visitTime;

	public String getDoctorRemark() {
		return this.doctorRemark;
	}
	public void setDoctorRemark(String doctorRemark) {
		this.doctorRemark = doctorRemark;
	}

	public String getProcessTime() {
		return this.processTime;
	}
	public void setProcessTime(String processTime) {
		this.processTime = processTime;
	}

	public String getReferralFormId() {
		return this.referralFormId;
	}
	public void setReferralFormId(String referralFormId) {
		this.referralFormId = referralFormId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVisitDepartment() {
		return this.visitDepartment;
	}
	public void setVisitDepartment(String visitDepartment) {
		this.visitDepartment = visitDepartment;
	}

	public String getVisitDoctor() {
		return this.visitDoctor;
	}
	public void setVisitDoctor(String visitDoctor) {
		this.visitDoctor = visitDoctor;
	}

	public String getVisitHospital() {
		return this.visitHospital;
	}
	public void setVisitHospital(String visitHospital) {
		this.visitHospital = visitHospital;
	}

	public String getVisitTime() {
		return this.visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

}

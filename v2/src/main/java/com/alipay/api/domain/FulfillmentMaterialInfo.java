package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资料信息
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:54:21
 */
public class FulfillmentMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 8254879987164318932L;

	/**
	 * 检查预约单
	 */
	@ApiField("examination_appointment_url")
	private String examinationAppointmentUrl;

	/**
	 * 检查报告
	 */
	@ApiField("examination_report_url")
	private String examinationReportUrl;

	/**
	 * 住院通知单
	 */
	@ApiField("hospitalization_notice_url")
	private String hospitalizationNoticeUrl;

	/**
	 * 住院病例/小结
	 */
	@ApiField("hospitalization_record_url")
	private String hospitalizationRecordUrl;

	/**
	 * 门诊病例
	 */
	@ApiField("outpatient_record_url")
	private String outpatientRecordUrl;

	/**
	 * 病理报告
	 */
	@ApiField("pathology_report_url")
	private String pathologyReportUrl;

	/**
	 * 就诊卡号或就诊二维码
	 */
	@ApiField("patient_card_url")
	private String patientCardUrl;

	/**
	 * 电子/门诊挂号单
	 */
	@ApiField("registration_slip_url")
	private String registrationSlipUrl;

	/**
	 * 手术通知单
	 */
	@ApiField("surgery_notice_url")
	private String surgeryNoticeUrl;

	public String getExaminationAppointmentUrl() {
		return this.examinationAppointmentUrl;
	}
	public void setExaminationAppointmentUrl(String examinationAppointmentUrl) {
		this.examinationAppointmentUrl = examinationAppointmentUrl;
	}

	public String getExaminationReportUrl() {
		return this.examinationReportUrl;
	}
	public void setExaminationReportUrl(String examinationReportUrl) {
		this.examinationReportUrl = examinationReportUrl;
	}

	public String getHospitalizationNoticeUrl() {
		return this.hospitalizationNoticeUrl;
	}
	public void setHospitalizationNoticeUrl(String hospitalizationNoticeUrl) {
		this.hospitalizationNoticeUrl = hospitalizationNoticeUrl;
	}

	public String getHospitalizationRecordUrl() {
		return this.hospitalizationRecordUrl;
	}
	public void setHospitalizationRecordUrl(String hospitalizationRecordUrl) {
		this.hospitalizationRecordUrl = hospitalizationRecordUrl;
	}

	public String getOutpatientRecordUrl() {
		return this.outpatientRecordUrl;
	}
	public void setOutpatientRecordUrl(String outpatientRecordUrl) {
		this.outpatientRecordUrl = outpatientRecordUrl;
	}

	public String getPathologyReportUrl() {
		return this.pathologyReportUrl;
	}
	public void setPathologyReportUrl(String pathologyReportUrl) {
		this.pathologyReportUrl = pathologyReportUrl;
	}

	public String getPatientCardUrl() {
		return this.patientCardUrl;
	}
	public void setPatientCardUrl(String patientCardUrl) {
		this.patientCardUrl = patientCardUrl;
	}

	public String getRegistrationSlipUrl() {
		return this.registrationSlipUrl;
	}
	public void setRegistrationSlipUrl(String registrationSlipUrl) {
		this.registrationSlipUrl = registrationSlipUrl;
	}

	public String getSurgeryNoticeUrl() {
		return this.surgeryNoticeUrl;
	}
	public void setSurgeryNoticeUrl(String surgeryNoticeUrl) {
		this.surgeryNoticeUrl = surgeryNoticeUrl;
	}

}

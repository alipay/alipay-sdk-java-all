package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约数据
 *
 * @author auto create
 * @since 1.0, 2026-07-17 11:07:49
 */
public class FulfillmentDataInfo extends AlipayObject {

	private static final long serialVersionUID = 2351747558639718787L;

	/**
	 * 顾问数据
	 */
	@ApiField("advisor")
	private AdvisorParam advisor;

	/**
	 * 问诊类数据
	 */
	@ApiField("consultation")
	private ConsultationParam consultation;

	/**
	 * 检查检验数据
	 */
	@ApiField("examination")
	private ExaminationParam examination;

	/**
	 * 检查加急
	 */
	@ApiField("examination_urgent_fulfillment_detail_data")
	private ExaminationUrgentFulfillmentDetailData examinationUrgentFulfillmentDetailData;

	/**
	 * 高端医疗
	 */
	@ApiField("highend_medical_fulfillment_detail_data")
	private HighEndMedicalFulfillmentDetailData highendMedicalFulfillmentDetailData;

	/**
	 * 住院协助
	 */
	@ApiField("inpatient_assist_fulfillment_detail_data")
	private InpatientAssistFulfillmentDetailData inpatientAssistFulfillmentDetailData;

	/**
	 * 陪护数据
	 */
	@ApiField("inpatient_nursing_fulfillment_detail_data")
	private InpatientNursingFulfillmentDetailData inpatientNursingFulfillmentDetailData;

	/**
	 * 陪诊数据
	 */
	@ApiField("offline_escort_fulfillment_detail_data")
	private OfflineEscortFulfillmentDetailData offlineEscortFulfillmentDetailData;

	/**
	 * 体检服务
	 */
	@ApiField("physical_examination_fulfillment_detail_data")
	private PhysicalExaminationFulfillmentDetailData physicalExaminationFulfillmentDetailData;

	/**
	 * 心理权益
	 */
	@ApiField("psychological_fulfillment_detail_data")
	private PsychologicalFulfillmentDetailData psychologicalFulfillmentDetailData;

	/**
	 * 挂号绿通
	 */
	@ApiField("registration_green_channel_fulfillment_detail_data")
	private RegistrationGreenChannelFulfillmentDetailData registrationGreenChannelFulfillmentDetailData;

	public AdvisorParam getAdvisor() {
		return this.advisor;
	}
	public void setAdvisor(AdvisorParam advisor) {
		this.advisor = advisor;
	}

	public ConsultationParam getConsultation() {
		return this.consultation;
	}
	public void setConsultation(ConsultationParam consultation) {
		this.consultation = consultation;
	}

	public ExaminationParam getExamination() {
		return this.examination;
	}
	public void setExamination(ExaminationParam examination) {
		this.examination = examination;
	}

	public ExaminationUrgentFulfillmentDetailData getExaminationUrgentFulfillmentDetailData() {
		return this.examinationUrgentFulfillmentDetailData;
	}
	public void setExaminationUrgentFulfillmentDetailData(ExaminationUrgentFulfillmentDetailData examinationUrgentFulfillmentDetailData) {
		this.examinationUrgentFulfillmentDetailData = examinationUrgentFulfillmentDetailData;
	}

	public HighEndMedicalFulfillmentDetailData getHighendMedicalFulfillmentDetailData() {
		return this.highendMedicalFulfillmentDetailData;
	}
	public void setHighendMedicalFulfillmentDetailData(HighEndMedicalFulfillmentDetailData highendMedicalFulfillmentDetailData) {
		this.highendMedicalFulfillmentDetailData = highendMedicalFulfillmentDetailData;
	}

	public InpatientAssistFulfillmentDetailData getInpatientAssistFulfillmentDetailData() {
		return this.inpatientAssistFulfillmentDetailData;
	}
	public void setInpatientAssistFulfillmentDetailData(InpatientAssistFulfillmentDetailData inpatientAssistFulfillmentDetailData) {
		this.inpatientAssistFulfillmentDetailData = inpatientAssistFulfillmentDetailData;
	}

	public InpatientNursingFulfillmentDetailData getInpatientNursingFulfillmentDetailData() {
		return this.inpatientNursingFulfillmentDetailData;
	}
	public void setInpatientNursingFulfillmentDetailData(InpatientNursingFulfillmentDetailData inpatientNursingFulfillmentDetailData) {
		this.inpatientNursingFulfillmentDetailData = inpatientNursingFulfillmentDetailData;
	}

	public OfflineEscortFulfillmentDetailData getOfflineEscortFulfillmentDetailData() {
		return this.offlineEscortFulfillmentDetailData;
	}
	public void setOfflineEscortFulfillmentDetailData(OfflineEscortFulfillmentDetailData offlineEscortFulfillmentDetailData) {
		this.offlineEscortFulfillmentDetailData = offlineEscortFulfillmentDetailData;
	}

	public PhysicalExaminationFulfillmentDetailData getPhysicalExaminationFulfillmentDetailData() {
		return this.physicalExaminationFulfillmentDetailData;
	}
	public void setPhysicalExaminationFulfillmentDetailData(PhysicalExaminationFulfillmentDetailData physicalExaminationFulfillmentDetailData) {
		this.physicalExaminationFulfillmentDetailData = physicalExaminationFulfillmentDetailData;
	}

	public PsychologicalFulfillmentDetailData getPsychologicalFulfillmentDetailData() {
		return this.psychologicalFulfillmentDetailData;
	}
	public void setPsychologicalFulfillmentDetailData(PsychologicalFulfillmentDetailData psychologicalFulfillmentDetailData) {
		this.psychologicalFulfillmentDetailData = psychologicalFulfillmentDetailData;
	}

	public RegistrationGreenChannelFulfillmentDetailData getRegistrationGreenChannelFulfillmentDetailData() {
		return this.registrationGreenChannelFulfillmentDetailData;
	}
	public void setRegistrationGreenChannelFulfillmentDetailData(RegistrationGreenChannelFulfillmentDetailData registrationGreenChannelFulfillmentDetailData) {
		this.registrationGreenChannelFulfillmentDetailData = registrationGreenChannelFulfillmentDetailData;
	}

}

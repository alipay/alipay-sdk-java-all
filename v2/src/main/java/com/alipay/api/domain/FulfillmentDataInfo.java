package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约数据
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class FulfillmentDataInfo extends AlipayObject {

	private static final long serialVersionUID = 5698773851844245483L;

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
	 * 高端医疗
	 */
	@ApiField("highend_medical_fulfillment_detail_data")
	private HighEndMedicalFulfillmentDetailData highendMedicalFulfillmentDetailData;

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
	 * 心理权益
	 */
	@ApiField("psychological_fulfillment_detail_data")
	private PsychologicalFulfillmentDetailData psychologicalFulfillmentDetailData;

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

	public HighEndMedicalFulfillmentDetailData getHighendMedicalFulfillmentDetailData() {
		return this.highendMedicalFulfillmentDetailData;
	}
	public void setHighendMedicalFulfillmentDetailData(HighEndMedicalFulfillmentDetailData highendMedicalFulfillmentDetailData) {
		this.highendMedicalFulfillmentDetailData = highendMedicalFulfillmentDetailData;
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

	public PsychologicalFulfillmentDetailData getPsychologicalFulfillmentDetailData() {
		return this.psychologicalFulfillmentDetailData;
	}
	public void setPsychologicalFulfillmentDetailData(PsychologicalFulfillmentDetailData psychologicalFulfillmentDetailData) {
		this.psychologicalFulfillmentDetailData = psychologicalFulfillmentDetailData;
	}

}

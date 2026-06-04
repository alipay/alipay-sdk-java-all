package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约数据
 *
 * @author auto create
 * @since 1.0, 2026-05-26 16:22:45
 */
public class FulfillmentDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3377526376812117378L;

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
	 * 陪护数据
	 */
	@ApiField("inpatient_nursing_fulfillment_detail_data")
	private InpatientNursingFulfillmentDetailData inpatientNursingFulfillmentDetailData;

	/**
	 * 陪诊数据
	 */
	@ApiField("offline_escort_fulfillment_detail_data")
	private OfflineEscortFulfillmentDetailData offlineEscortFulfillmentDetailData;

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

}

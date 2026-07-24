package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas履约单查询返回数据结果字段
 *
 * @author auto create
 * @since 1.0, 2026-07-17 11:22:51
 */
public class FulfillmentBizInfo extends AlipayObject {

	private static final long serialVersionUID = 4699682721988829544L;

	/**
	 * 顾问类数据
	 */
	@ApiField("advisory")
	private Advisory advisory;

	/**
	 * 问诊类数据
	 */
	@ApiField("consultation")
	private Consultation consultation;

	/**
	 * 陪诊对象
	 */
	@ApiField("escort")
	private EscortVO escort;

	/**
	 * 检查检验类数据
	 */
	@ApiField("examination")
	private Examination examination;

	/**
	 * 检查加急
	 */
	@ApiField("examination_urgent")
	private FulfillmentBizVO examinationUrgent;

	/**
	 * 高端医疗
	 */
	@ApiField("highend_medical")
	private HighEndMedicalFulfillmentDetailData highendMedical;

	/**
	 * 住院协助
	 */
	@ApiField("inpatient_assist")
	private FulfillmentBizVO inpatientAssist;

	/**
	 * 陪护类型
	 */
	@ApiField("nursing")
	private NursingVO nursing;

	/**
	 * 体检服务
	 */
	@ApiField("physical_examination")
	private FulfillmentBizVO physicalExamination;

	/**
	 * 心理权益
	 */
	@ApiField("psychological")
	private PsychologicalVO psychological;

	/**
	 * 挂号绿通
	 */
	@ApiField("registration_green_channel")
	private FulfillmentBizVO registrationGreenChannel;

	public Advisory getAdvisory() {
		return this.advisory;
	}
	public void setAdvisory(Advisory advisory) {
		this.advisory = advisory;
	}

	public Consultation getConsultation() {
		return this.consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public EscortVO getEscort() {
		return this.escort;
	}
	public void setEscort(EscortVO escort) {
		this.escort = escort;
	}

	public Examination getExamination() {
		return this.examination;
	}
	public void setExamination(Examination examination) {
		this.examination = examination;
	}

	public FulfillmentBizVO getExaminationUrgent() {
		return this.examinationUrgent;
	}
	public void setExaminationUrgent(FulfillmentBizVO examinationUrgent) {
		this.examinationUrgent = examinationUrgent;
	}

	public HighEndMedicalFulfillmentDetailData getHighendMedical() {
		return this.highendMedical;
	}
	public void setHighendMedical(HighEndMedicalFulfillmentDetailData highendMedical) {
		this.highendMedical = highendMedical;
	}

	public FulfillmentBizVO getInpatientAssist() {
		return this.inpatientAssist;
	}
	public void setInpatientAssist(FulfillmentBizVO inpatientAssist) {
		this.inpatientAssist = inpatientAssist;
	}

	public NursingVO getNursing() {
		return this.nursing;
	}
	public void setNursing(NursingVO nursing) {
		this.nursing = nursing;
	}

	public FulfillmentBizVO getPhysicalExamination() {
		return this.physicalExamination;
	}
	public void setPhysicalExamination(FulfillmentBizVO physicalExamination) {
		this.physicalExamination = physicalExamination;
	}

	public PsychologicalVO getPsychological() {
		return this.psychological;
	}
	public void setPsychological(PsychologicalVO psychological) {
		this.psychological = psychological;
	}

	public FulfillmentBizVO getRegistrationGreenChannel() {
		return this.registrationGreenChannel;
	}
	public void setRegistrationGreenChannel(FulfillmentBizVO registrationGreenChannel) {
		this.registrationGreenChannel = registrationGreenChannel;
	}

}

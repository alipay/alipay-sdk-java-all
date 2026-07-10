package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas履约单查询返回数据结果字段
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:10:21
 */
public class FulfillmentBizInfo extends AlipayObject {

	private static final long serialVersionUID = 5564416834661553256L;

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
	 * 高端医疗
	 */
	@ApiField("highend_medical")
	private HighEndMedicalFulfillmentDetailData highendMedical;

	/**
	 * 陪护类型
	 */
	@ApiField("nursing")
	private NursingVO nursing;

	/**
	 * 心理权益
	 */
	@ApiField("psychological")
	private PsychologicalVO psychological;

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

	public HighEndMedicalFulfillmentDetailData getHighendMedical() {
		return this.highendMedical;
	}
	public void setHighendMedical(HighEndMedicalFulfillmentDetailData highendMedical) {
		this.highendMedical = highendMedical;
	}

	public NursingVO getNursing() {
		return this.nursing;
	}
	public void setNursing(NursingVO nursing) {
		this.nursing = nursing;
	}

	public PsychologicalVO getPsychological() {
		return this.psychological;
	}
	public void setPsychological(PsychologicalVO psychological) {
		this.psychological = psychological;
	}

}

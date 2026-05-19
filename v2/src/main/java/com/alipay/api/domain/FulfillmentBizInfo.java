package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Saas履约单查询返回数据结果字段
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:58:02
 */
public class FulfillmentBizInfo extends AlipayObject {

	private static final long serialVersionUID = 4448561125874356256L;

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
	 * 检查检验类数据
	 */
	@ApiField("examination")
	private Examination examination;

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

	public Examination getExamination() {
		return this.examination;
	}
	public void setExamination(Examination examination) {
		this.examination = examination;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约事件数据
 *
 * @author auto create
 * @since 1.0, 2026-08-13 15:54:25
 */
public class FulfillmentEventData extends AlipayObject {

	private static final long serialVersionUID = 8485927275668245279L;

	/**
	 * 检查检验类事件数据
	 */
	@ApiField("examination")
	private ExaminationEventParam examination;

	public ExaminationEventParam getExamination() {
		return this.examination;
	}
	public void setExamination(ExaminationEventParam examination) {
		this.examination = examination;
	}

}

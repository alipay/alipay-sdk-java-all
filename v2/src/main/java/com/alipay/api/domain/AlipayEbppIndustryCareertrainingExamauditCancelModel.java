package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评价取消审核
 *
 * @author auto create
 * @since 1.0, 2026-01-14 10:45:57
 */
public class AlipayEbppIndustryCareertrainingExamauditCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6557782441226575696L;

	/**
	 * 考试ID
	 */
	@ApiField("exam_id")
	private String examId;

	public String getExamId() {
		return this.examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}

}

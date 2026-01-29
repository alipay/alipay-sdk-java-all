package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 考试行业投放与撤销投放
 *
 * @author auto create
 * @since 1.0, 2026-01-14 10:47:43
 */
public class AlipayEbppIndustryCareertrainingExamPublishModel extends AlipayObject {

	private static final long serialVersionUID = 4674949389511764593L;

	/**
	 * 考试ID
	 */
	@ApiField("exam_id")
	private String examId;

	/**
	 * 投放状态
LAUNCH 投放
CANCEL_LAUNCH 撤退投放（仅当前商品为非审核中可撤销）
	 */
	@ApiField("publish_status")
	private String publishStatus;

	public String getExamId() {
		return this.examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getPublishStatus() {
		return this.publishStatus;
	}
	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}

}

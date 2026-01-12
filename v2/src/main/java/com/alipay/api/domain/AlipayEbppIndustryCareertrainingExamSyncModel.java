package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步职业培训考试状态
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:22:36
 */
public class AlipayEbppIndustryCareertrainingExamSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4766217449856756393L;

	/**
	 * 评价ID, 以此作为主键更新
	 */
	@ApiField("exam_id")
	private String examId;

	/**
	 * 枚举: 
DELISTING("已下架")
AVAILABLE("已上架")
	 */
	@ApiField("exam_status")
	private String examStatus;

	public String getExamId() {
		return this.examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getExamStatus() {
		return this.examStatus;
	}
	public void setExamStatus(String examStatus) {
		this.examStatus = examStatus;
	}

}

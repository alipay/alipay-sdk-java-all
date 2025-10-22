package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服智能调度查询接口
 *
 * @author auto create
 * @since 1.0, 2024-05-11 17:19:51
 */
public class AlipayIserviceIcontrolDispatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6347331165353196525L;

	/**
	 * 业务标签
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 哈啰出行热线会话jobId
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 问题级别
	 */
	@ApiField("question_level")
	private String questionLevel;

	/**
	 * 会话标签
	 */
	@ApiField("session_label")
	private String sessionLabel;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getQuestionLevel() {
		return this.questionLevel;
	}
	public void setQuestionLevel(String questionLevel) {
		this.questionLevel = questionLevel;
	}

	public String getSessionLabel() {
		return this.sessionLabel;
	}
	public void setSessionLabel(String sessionLabel) {
		this.sessionLabel = sessionLabel;
	}

}

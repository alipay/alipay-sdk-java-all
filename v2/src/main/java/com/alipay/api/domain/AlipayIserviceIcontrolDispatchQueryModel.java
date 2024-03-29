package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服智能调度查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-25 15:24:52
 */
public class AlipayIserviceIcontrolDispatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5593358544456615321L;

	/**
	 * 业务类型
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

}

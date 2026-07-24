package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 岗位信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:50
 */
public class OpenapiInterviewJobInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2288255962885674144L;

	/**
	 * 岗位描述
	 */
	@ApiField("job_description")
	private String jobDescription;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位要求
	 */
	@ApiField("job_requirement")
	private String jobRequirement;

	public String getJobDescription() {
		return this.jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobRequirement() {
		return this.jobRequirement;
	}
	public void setJobRequirement(String jobRequirement) {
		this.jobRequirement = jobRequirement;
	}

}

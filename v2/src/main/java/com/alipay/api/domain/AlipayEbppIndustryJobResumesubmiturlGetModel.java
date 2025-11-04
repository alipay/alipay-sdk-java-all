package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生成投递简历链接
 *
 * @author auto create
 * @since 1.0, 2025-08-11 14:47:36
 */
public class AlipayEbppIndustryJobResumesubmiturlGetModel extends AlipayObject {

	private static final long serialVersionUID = 1315958126664228433L;

	/**
	 * 机构同步给岗位后返回的jobId
out_job_id 为空时必传
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 外部job_id
job_id 为空时必传
	 */
	@ApiField("out_job_id")
	private String outJobId;

	/**
	 * 招聘平台名称
	 */
	@ApiField("recruitment_platform_name")
	private String recruitmentPlatformName;

	/**
	 * null
	 */
	@ApiListField("required_attributes")
	@ApiField("string")
	private List<String> requiredAttributes;

	/**
	 * 简历投递完成回跳链接
	 */
	@ApiField("source_return_url")
	private String sourceReturnUrl;

	/**
	 * 简历模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

	public String getRecruitmentPlatformName() {
		return this.recruitmentPlatformName;
	}
	public void setRecruitmentPlatformName(String recruitmentPlatformName) {
		this.recruitmentPlatformName = recruitmentPlatformName;
	}

	public List<String> getRequiredAttributes() {
		return this.requiredAttributes;
	}
	public void setRequiredAttributes(List<String> requiredAttributes) {
		this.requiredAttributes = requiredAttributes;
	}

	public String getSourceReturnUrl() {
		return this.sourceReturnUrl;
	}
	public void setSourceReturnUrl(String sourceReturnUrl) {
		this.sourceReturnUrl = sourceReturnUrl;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}

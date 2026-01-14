package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-23 20:47:40
 */
public class OfflineLaborProjectJob extends AlipayObject {

	private static final long serialVersionUID = 5659311317367854555L;

	/**
	 * 学历要求
	 */
	@ApiField("edu_level")
	private String eduLevel;

	/**
	 * 工作经验要求
	 */
	@ApiField("experience_level")
	private String experienceLevel;

	/**
	 * 服务商岗位 Id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位类型
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 服务商项目 Id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 用户登记认证跳转地址
	 */
	@ApiField("register_url")
	private String registerUrl;

	/**
	 * 项目状态
	 */
	@ApiField("status")
	private String status;

	public String getEduLevel() {
		return this.eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public String getExperienceLevel() {
		return this.experienceLevel;
	}
	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

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

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRegisterUrl() {
		return this.registerUrl;
	}
	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

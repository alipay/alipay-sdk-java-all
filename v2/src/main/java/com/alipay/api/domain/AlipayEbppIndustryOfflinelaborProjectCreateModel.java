package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心登记卡线下用工项目创建
 *
 * @author auto create
 * @since 1.0, 2025-09-17 17:12:39
 */
public class AlipayEbppIndustryOfflinelaborProjectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6169221788367942876L;

	/**
	 * 教育经验
	 */
	@ApiField("edu_level")
	private String eduLevel;

	/**
	 * 工作经验
	 */
	@ApiField("experience_level")
	private String experienceLevel;

	/**
	 * 服务商内部岗位 id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位类型清单
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 服务商内部项目 id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名
	 */
	@ApiField("project_name")
	private String projectName;

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

}

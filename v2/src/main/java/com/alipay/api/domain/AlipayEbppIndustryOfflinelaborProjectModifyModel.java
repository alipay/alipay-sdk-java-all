package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下用工项目修改
 *
 * @author auto create
 * @since 1.0, 2025-08-29 13:42:37
 */
public class AlipayEbppIndustryOfflinelaborProjectModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7328292414449626338L;

	/**
	 * 学历要求
非空更新
	 */
	@ApiField("edu_level")
	private String eduLevel;

	/**
	 * 工作经验要求
非空更新
	 */
	@ApiField("experience_level")
	private String experienceLevel;

	/**
	 * 服务商内部岗位 Id
对应项目岗位创建接口请求参数中的岗位Id

如果存在则更新岗位信息
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名
非空更新
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位类型
非空更新
与 岗位类型清单 进行校验
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 服务商内部项目 Id
对应项目岗位创建接口请求参数中的项目Id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名（非空更新）
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 项目状态（非空更新）
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

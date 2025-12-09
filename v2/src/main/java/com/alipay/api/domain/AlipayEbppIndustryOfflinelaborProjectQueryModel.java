package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心登记卡线下用工项目查询
 *
 * @author auto create
 * @since 1.0, 2025-10-23 20:47:40
 */
public class AlipayEbppIndustryOfflinelaborProjectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4212976918325284685L;

	/**
	 * 服务商内部岗位 Id
对应项目岗位创建接口请求参数的岗位 ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名（迷糊搜索）
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 页码（从 1 开始）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面记录（最大50 ）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 服务商内部项目id
对应项目岗位创建接口请求参数的项目 ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名（模糊搜索）
	 */
	@ApiField("project_name")
	private String projectName;

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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

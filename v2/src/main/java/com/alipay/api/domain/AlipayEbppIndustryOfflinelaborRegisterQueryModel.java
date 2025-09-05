package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下用工项目登记记录查询
 *
 * @author auto create
 * @since 1.0, 2025-09-05 17:05:07
 */
public class AlipayEbppIndustryOfflinelaborRegisterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2675675349484727867L;

	/**
	 * 登记状态
	 */
	@ApiField("application_status")
	private String applicationStatus;

	/**
	 * 岗位Id（服务商内部岗位 Id）对应 out_job_id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名，支持模糊搜索
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 外部登记号
	 */
	@ApiField("out_regist_no")
	private String outRegistNo;

	/**
	 * 页码（从 1 开始）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面记录（最大 50 ）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 项目Id（服务商内部项目 Id） 对应 out_project_id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名，支持模糊搜索
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 登记结束时间 (yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("reg_end_date")
	private String regEndDate;

	/**
	 * 登记起始时间 (yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("reg_start_date")
	private String regStartDate;

	/**
	 * 用户姓名，支持精确搜索
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户手机号码，支持精确搜索
	 */
	@ApiField("user_phone_number")
	private String userPhoneNumber;

	public String getApplicationStatus() {
		return this.applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
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

	public String getOutRegistNo() {
		return this.outRegistNo;
	}
	public void setOutRegistNo(String outRegistNo) {
		this.outRegistNo = outRegistNo;
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

	public String getRegEndDate() {
		return this.regEndDate;
	}
	public void setRegEndDate(String regEndDate) {
		this.regEndDate = regEndDate;
	}

	public String getRegStartDate() {
		return this.regStartDate;
	}
	public void setRegStartDate(String regStartDate) {
		this.regStartDate = regStartDate;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return this.userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

}

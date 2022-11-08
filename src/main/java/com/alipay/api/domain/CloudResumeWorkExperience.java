package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工作经历
 *
 * @author auto create
 * @since 1.0, 2022-05-07 09:57:14
 */
public class CloudResumeWorkExperience extends AlipayObject {

	private static final long serialVersionUID = 8321737643346599957L;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 职业id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 职业
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 行业id
	 */
	@ApiField("profession_id")
	private String professionId;

	/**
	 * 行业名称
	 */
	@ApiField("profession_name")
	private String professionName;

	/**
	 * 工作描述
	 */
	@ApiField("work_desc")
	private String workDesc;

	/**
	 * 工作结束时间
	 */
	@ApiField("work_end_time")
	private Long workEndTime;

	/**
	 * 工作开始日期
	 */
	@ApiField("work_start_time")
	private Long workStartTime;

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getProfessionId() {
		return this.professionId;
	}
	public void setProfessionId(String professionId) {
		this.professionId = professionId;
	}

	public String getProfessionName() {
		return this.professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}

	public String getWorkDesc() {
		return this.workDesc;
	}
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}

	public Long getWorkEndTime() {
		return this.workEndTime;
	}
	public void setWorkEndTime(Long workEndTime) {
		this.workEndTime = workEndTime;
	}

	public Long getWorkStartTime() {
		return this.workStartTime;
	}
	public void setWorkStartTime(Long workStartTime) {
		this.workStartTime = workStartTime;
	}

}

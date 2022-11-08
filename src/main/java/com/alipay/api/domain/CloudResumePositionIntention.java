package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 求职期望
 *
 * @author auto create
 * @since 1.0, 2022-05-07 09:57:14
 */
public class CloudResumePositionIntention extends AlipayObject {

	private static final long serialVersionUID = 8551546775713858534L;

	/**
	 * 意向城市
	 */
	@ApiField("intention_city")
	private String intentionCity;

	/**
	 * 职业id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 职业名称
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
	 * 最大工资
	 */
	@ApiField("salary_max")
	private String salaryMax;

	/**
	 * 最小薪资
	 */
	@ApiField("salary_min")
	private String salaryMin;

	/**
	 * 工资单位，/月 /日
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * 工作属性
	 */
	@ApiField("work_property")
	private String workProperty;

	public String getIntentionCity() {
		return this.intentionCity;
	}
	public void setIntentionCity(String intentionCity) {
		this.intentionCity = intentionCity;
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

	public String getSalaryMax() {
		return this.salaryMax;
	}
	public void setSalaryMax(String salaryMax) {
		this.salaryMax = salaryMax;
	}

	public String getSalaryMin() {
		return this.salaryMin;
	}
	public void setSalaryMin(String salaryMin) {
		this.salaryMin = salaryMin;
	}

	public String getSalaryUnit() {
		return this.salaryUnit;
	}
	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	public String getWorkProperty() {
		return this.workProperty;
	}
	public void setWorkProperty(String workProperty) {
		this.workProperty = workProperty;
	}

}

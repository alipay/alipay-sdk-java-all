package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV兼职岗位信息同步
 *
 * @author auto create
 * @since 1.0, 2020-05-26 20:26:54
 */
public class AlipayCommerceEducateParttimejobInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3549495986915726562L;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 结算方式
	 */
	@ApiField("clearing_form")
	private String clearingForm;

	/**
	 * 岗位图片
	 */
	@ApiField("company_logo")
	private String companyLogo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 学历要求
	 */
	@ApiField("educational_requirements")
	private String educationalRequirements;

	/**
	 * json格式扩展字段
	 */
	@ApiField("features")
	private String features;

	/**
	 * 性别要求
	 */
	@ApiField("gender_requirement")
	private String genderRequirement;

	/**
	 * 热度
	 */
	@ApiField("heat")
	private String heat;

	/**
	 * 身高要求
	 */
	@ApiField("height_limit")
	private String heightLimit;

	/**
	 * 行业属性
	 */
	@ApiField("industry_attributes")
	private String industryAttributes;

	/**
	 * 是否名企职位
	 */
	@ApiField("is_famous")
	private String isFamous;

	/**
	 * 岗位地址，精确到经纬度
	 */
	@ApiField("job_address")
	private String jobAddress;

	/**
	 * 岗位所属类目
	 */
	@ApiField("job_category")
	private String jobCategory;

	/**
	 * 工作时间
	 */
	@ApiField("job_frequency")
	private String jobFrequency;

	/**
	 * 岗位id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位相关内容介绍
	 */
	@ApiField("job_remark")
	private String jobRemark;

	/**
	 * 岗位福利
	 */
	@ApiField("job_welfare")
	private String jobWelfare;

	/**
	 * 健康证要求
	 */
	@ApiField("need_health")
	private String needHealth;

	/**
	 * 薪资
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 跳转地址
	 */
	@ApiField("skip_url")
	private String skipUrl;

	/**
	 * 数据状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 工作日期
	 */
	@ApiField("working_date")
	private String workingDate;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getClearingForm() {
		return this.clearingForm;
	}
	public void setClearingForm(String clearingForm) {
		this.clearingForm = clearingForm;
	}

	public String getCompanyLogo() {
		return this.companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEducationalRequirements() {
		return this.educationalRequirements;
	}
	public void setEducationalRequirements(String educationalRequirements) {
		this.educationalRequirements = educationalRequirements;
	}

	public String getFeatures() {
		return this.features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

	public String getGenderRequirement() {
		return this.genderRequirement;
	}
	public void setGenderRequirement(String genderRequirement) {
		this.genderRequirement = genderRequirement;
	}

	public String getHeat() {
		return this.heat;
	}
	public void setHeat(String heat) {
		this.heat = heat;
	}

	public String getHeightLimit() {
		return this.heightLimit;
	}
	public void setHeightLimit(String heightLimit) {
		this.heightLimit = heightLimit;
	}

	public String getIndustryAttributes() {
		return this.industryAttributes;
	}
	public void setIndustryAttributes(String industryAttributes) {
		this.industryAttributes = industryAttributes;
	}

	public String getIsFamous() {
		return this.isFamous;
	}
	public void setIsFamous(String isFamous) {
		this.isFamous = isFamous;
	}

	public String getJobAddress() {
		return this.jobAddress;
	}
	public void setJobAddress(String jobAddress) {
		this.jobAddress = jobAddress;
	}

	public String getJobCategory() {
		return this.jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public String getJobFrequency() {
		return this.jobFrequency;
	}
	public void setJobFrequency(String jobFrequency) {
		this.jobFrequency = jobFrequency;
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

	public String getJobRemark() {
		return this.jobRemark;
	}
	public void setJobRemark(String jobRemark) {
		this.jobRemark = jobRemark;
	}

	public String getJobWelfare() {
		return this.jobWelfare;
	}
	public void setJobWelfare(String jobWelfare) {
		this.jobWelfare = jobWelfare;
	}

	public String getNeedHealth() {
		return this.needHealth;
	}
	public void setNeedHealth(String needHealth) {
		this.needHealth = needHealth;
	}

	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSkipUrl() {
		return this.skipUrl;
	}
	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWorkingDate() {
		return this.workingDate;
	}
	public void setWorkingDate(String workingDate) {
		this.workingDate = workingDate;
	}

}

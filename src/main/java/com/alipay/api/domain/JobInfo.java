package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 求职码岗位信息
 *
 * @author auto create
 * @since 1.0, 2022-01-26 17:31:52
 */
public class JobInfo extends AlipayObject {

	private static final long serialVersionUID = 7264946235764616468L;

	/**
	 * 岗位地址（行政区域）
	 */
	@ApiField("address")
	private String address;

	/**
	 * 年龄范围
	 */
	@ApiField("age_range")
	private String ageRange;

	/**
	 * 用户岗位申请状态
APPLYING：已申请/已报名
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 福利补贴信息
	 */
	@ApiField("bonus_desc")
	private String bonusDesc;

	/**
	 * 是否热门岗位，true表示热门岗位
	 */
	@ApiField("hot_job")
	private Boolean hotJob;

	/**
	 * 岗位介绍，一段描述性文本，\n为换行符
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 岗位id，岗位的唯一标识
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位关键标签，不同标签用','分割
	 */
	@ApiField("job_key_tags")
	private String jobKeyTags;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 职位供应商code
	 */
	@ApiField("job_supplier_code")
	private String jobSupplierCode;

	/**
	 * 岗位全职兼职类型
ALL：兼职/全职
PART_TIME：兼职
FULL_TIME：全职
	 */
	@ApiField("job_time_type")
	private String jobTimeType;

	/**
	 * 岗位种类
	 */
	@ApiField("post")
	private String post;

	/**
	 * 录用条件，一段描述性字符串，其中\n为换行符
	 */
	@ApiField("recruit_condition")
	private String recruitCondition;

	/**
	 * 基本薪资数额，单位元
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 薪资结算方式
	 */
	@ApiField("salary_settlement_desc")
	private String salarySettlementDesc;

	/**
	 * 性别范围
	 */
	@ApiField("sex_range")
	private String sexRange;

	/**
	 * 一句话岗位描述
	 */
	@ApiField("simple_desc")
	private String simpleDesc;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgeRange() {
		return this.ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getBonusDesc() {
		return this.bonusDesc;
	}
	public void setBonusDesc(String bonusDesc) {
		this.bonusDesc = bonusDesc;
	}

	public Boolean getHotJob() {
		return this.hotJob;
	}
	public void setHotJob(Boolean hotJob) {
		this.hotJob = hotJob;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobKeyTags() {
		return this.jobKeyTags;
	}
	public void setJobKeyTags(String jobKeyTags) {
		this.jobKeyTags = jobKeyTags;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobSupplierCode() {
		return this.jobSupplierCode;
	}
	public void setJobSupplierCode(String jobSupplierCode) {
		this.jobSupplierCode = jobSupplierCode;
	}

	public String getJobTimeType() {
		return this.jobTimeType;
	}
	public void setJobTimeType(String jobTimeType) {
		this.jobTimeType = jobTimeType;
	}

	public String getPost() {
		return this.post;
	}
	public void setPost(String post) {
		this.post = post;
	}

	public String getRecruitCondition() {
		return this.recruitCondition;
	}
	public void setRecruitCondition(String recruitCondition) {
		this.recruitCondition = recruitCondition;
	}

	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSalarySettlementDesc() {
		return this.salarySettlementDesc;
	}
	public void setSalarySettlementDesc(String salarySettlementDesc) {
		this.salarySettlementDesc = salarySettlementDesc;
	}

	public String getSexRange() {
		return this.sexRange;
	}
	public void setSexRange(String sexRange) {
		this.sexRange = sexRange;
	}

	public String getSimpleDesc() {
		return this.simpleDesc;
	}
	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}

}

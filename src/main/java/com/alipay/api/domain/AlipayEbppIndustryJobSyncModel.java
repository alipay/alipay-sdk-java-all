package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人才就业岗位同步
 *
 * @author auto create
 * @since 1.0, 2021-11-01 14:17:23
 */
public class AlipayEbppIndustryJobSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1872986928723997826L;

	/**
	 * 岗位详细地址。
如果是线下岗位，则传具体岗位地址信息
如果是线上岗位，则传空
	 */
	@ApiField("address")
	private JobAddress address;

	/**
	 * 年龄范围。
格式：最小年龄（含）,最大年龄（含）
如果没有限制，则传不限。

其他示例：
不限,不限
18,不限
不限,60
	 */
	@ApiField("age")
	private String age;

	/**
	 * 技能、证书等要求，比如学历、健康证、普通话或其他技能证书等。部分枚举值：
健康证
本科
专科
普通话
	 */
	@ApiListField("certifications")
	@ApiField("string")
	private List<String> certifications;

	/**
	 * 招聘人数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 雇主名称
	 */
	@ApiField("employer_name")
	private String employerName;

	/**
	 * 雇主类型：
COMPANY：企业
INDIVIDUAL_BUSINESS：个体户
PERSON：个人
	 */
	@ApiField("employer_type")
	private String employerType;

	/**
	 * 岗位招聘信息失效时间。
	 */
	@ApiField("expired_date")
	private String expiredDate;

	/**
	 * 性别：
ALL：不限年龄
MALE：男
FEMALE：女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 岗位状态：
HIRING：招聘中
CLOSED：招聘结束
	 */
	@ApiField("hire_status")
	private String hireStatus;

	/**
	 * 岗位的小程序详情页URL
	 */
	@ApiField("job_detail_url")
	private String jobDetailUrl;

	/**
	 * 岗位特性，内容标签最多只能有7个字，如：["包吃住","工资日结xxxxxxxxx"] 只保留：["包吃住"]
	 */
	@ApiListField("job_features")
	@ApiField("string")
	private List<String> jobFeatures;

	/**
	 * 岗位名称，用于页面展示。
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位标签
	 */
	@ApiListField("job_tags")
	@ApiField("string")
	private List<String> jobTags;

	/**
	 * 岗位类型，用于岗位筛选，以及岗位匹配等场景。

枚举值：
经营管理
业务营销
文员助力
物流配送
展会演出
客服话务
线上主播
农林牧渔
手工技能
其他
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 岗位是否要求应聘人有芝麻工作证。

枚举值：
MUST：必须有芝麻工作证
RECOMMEND：优先考虑有芝麻工作证
NO_REQ：不要求芝麻工作证

如果还没有对接芝麻工作证，则传NO_REQ，等对接后再调整。
	 */
	@ApiField("job_worth_req")
	private String jobWorthReq;

	/**
	 * 商户侧的岗位唯一标识
	 */
	@ApiField("out_job_id")
	private String outJobId;

	/**
	 * 薪资结算方式：
日结
周结
月结
项目结
按件结
面议
	 */
	@ApiField("pay_period")
	private String payPeriod;

	/**
	 * 岗位优先级，
在以下类型中选择：
1：高优先级
2：中优先级
3：低优先级

高优先级的岗位，平台会优先展示。

建议只将少量岗位设置为高优先级，否则这个优先级的效果会低于预期。
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 薪资范围。支持薪资范围，格式：最低薪资（含）,最高薪资（含），薪资结算方式是面议时为空
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 岗位招聘信息生效时间.
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 是否在线办公，是则传true，否则传false
	 */
	@ApiField("work_online")
	private Boolean workOnline;

	public JobAddress getAddress() {
		return this.address;
	}
	public void setAddress(JobAddress address) {
		this.address = address;
	}

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public List<String> getCertifications() {
		return this.certifications;
	}
	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getEmployerName() {
		return this.employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerType() {
		return this.employerType;
	}
	public void setEmployerType(String employerType) {
		this.employerType = employerType;
	}

	public String getExpiredDate() {
		return this.expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireStatus() {
		return this.hireStatus;
	}
	public void setHireStatus(String hireStatus) {
		this.hireStatus = hireStatus;
	}

	public String getJobDetailUrl() {
		return this.jobDetailUrl;
	}
	public void setJobDetailUrl(String jobDetailUrl) {
		this.jobDetailUrl = jobDetailUrl;
	}

	public List<String> getJobFeatures() {
		return this.jobFeatures;
	}
	public void setJobFeatures(List<String> jobFeatures) {
		this.jobFeatures = jobFeatures;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public List<String> getJobTags() {
		return this.jobTags;
	}
	public void setJobTags(List<String> jobTags) {
		this.jobTags = jobTags;
	}

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobWorthReq() {
		return this.jobWorthReq;
	}
	public void setJobWorthReq(String jobWorthReq) {
		this.jobWorthReq = jobWorthReq;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

	public String getPayPeriod() {
		return this.payPeriod;
	}
	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Boolean getWorkOnline() {
		return this.workOnline;
	}
	public void setWorkOnline(Boolean workOnline) {
		this.workOnline = workOnline;
	}

}

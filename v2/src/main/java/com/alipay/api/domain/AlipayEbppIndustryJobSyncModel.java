package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人才就业岗位同步
 *
 * @author auto create
 * @since 1.0, 2023-04-13 20:50:50
 */
public class AlipayEbppIndustryJobSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8515838587164193381L;

	/**
	 * 不限      UNLIMITED
高中      H
技校      T
中专      S
大专      C
本科      B
硕士      M
博士      D
	 */
	@ApiField("academic_require")
	private String academicRequire;

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
	 * 雇主名称，请使用企业工商注册名
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
	 * 岗位详情内容
	 */
	@ApiField("job_detail")
	private String jobDetail;

	/**
	 * 岗位的小程序详情页URL，地址处理可以参考：https://opendocs.alipay.com/support/01rb18
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
	 * 岗位标签，标签为枚举值，“大学生”、“退役军人”、“特殊人群”、”乡村”，如同步这些标签，会提高透出权重
	 */
	@ApiListField("job_tags")
	@ApiField("string")
	private List<String> jobTags;

	/**
	 * 岗位类型，用于岗位筛选、岗位匹配等场景，具体枚举值在集成阶段提供
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 岗位是否要求应聘人有芝麻工作证。

枚举值：
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
	 * 岗位就业模式
	 */
	@ApiField("part_time_mode")
	private String partTimeMode;

	/**
	 * 薪资结算方式:
小时结
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
建议只将少量岗位设置为高优先级，否则这个优先级的效果会低于预期。
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 薪资范围，格式：最低薪资（含）,最高薪资（含），薪资结算方式是面议时为空。最高薪资不超过5万。如果为单价型岗位，最低薪资和最高薪资内容保持一致，如: 800,800
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

	/**
	 * 不限       UNLIMITED
1年以下    LESS_THAN_ONE_YEAR
1-2年      ONE_TO_TWO
3-5年      THREE_TO_FIVE
6-7年      SIX_TO_SEVEN
8-10年     EIGHT_TO_TEN
10年以上   MORE_THAN_TEN_YEARS
	 */
	@ApiField("working_years")
	private String workingYears;

	public String getAcademicRequire() {
		return this.academicRequire;
	}
	public void setAcademicRequire(String academicRequire) {
		this.academicRequire = academicRequire;
	}

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

	public String getJobDetail() {
		return this.jobDetail;
	}
	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
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

	public String getPartTimeMode() {
		return this.partTimeMode;
	}
	public void setPartTimeMode(String partTimeMode) {
		this.partTimeMode = partTimeMode;
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

	public String getWorkingYears() {
		return this.workingYears;
	}
	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}

}

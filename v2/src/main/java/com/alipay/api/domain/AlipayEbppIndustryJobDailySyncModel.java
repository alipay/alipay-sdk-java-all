package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝就业日结岗位同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-06 14:11:56
 */
public class AlipayEbppIndustryJobDailySyncModel extends AlipayObject {

	private static final long serialVersionUID = 8148177334314924115L;

	/**
	 * 学历要求
	 */
	@ApiField("academic_require")
	private String academicRequire;

	/**
	 * 岗位详细地址,线下岗位的经纬度、区县字段改为必填。
	 */
	@ApiField("address")
	private JobAddress address;

	/**
	 * 年龄范围 格式：最小年龄（含）,最大年龄（含） 如果没有限制，则传不限。 其他示例： 不限,不限 18,不限 不限,60，单位：年
	 */
	@ApiField("age")
	private String age;

	/**
	 * 招聘，单位：个
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 雇主名称 请使用企业工商注册名，不要使用简称或品牌名称
	 */
	@ApiField("employer_name")
	private String employerName;

	/**
	 * 雇主类型
	 */
	@ApiField("employer_type")
	private String employerType;

	/**
	 * 岗位招聘信息失效时间
	 */
	@ApiField("expired_date")
	private String expiredDate;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 岗位状态
	 */
	@ApiField("hire_status")
	private String hireStatus;

	/**
	 * 岗位详情内容，必填
	 */
	@ApiField("job_detail")
	private String jobDetail;

	/**
	 * 岗位的小程序详情页URL
URL链接处理可以参考：<a href="https://opendocs.alipay.com/support/01rb18" target="_blank" >小程序scheme链接介绍</a>
	 */
	@ApiField("job_detail_url")
	private String jobDetailUrl;

	/**
	 * 福利待遇 内容标签最多5个，每个标签最多7个中文字符，如：["包吃住","工资日结","五险一金"]
	 */
	@ApiListField("job_features")
	@ApiField("string")
	private List<String> jobFeatures;

	/**
	 * 岗位名称 用于页面展示
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 工作要求
	 */
	@ApiListField("job_requires")
	@ApiField("string")
	private List<String> jobRequires;

	/**
	 * 岗位类型
用于岗位筛选、岗位匹配等场景，具体枚举值清单如下（传第三级岗位类型Code）：<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/nmowzfqvl8itkado" target="_blank">岗位类型清单</a>
	 */
	@ApiField("job_type")
	private String jobType;

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
	 * 薪资单位，单位：周、日、小时
	 */
	@ApiField("pay_period")
	private String payPeriod;

	/**
	 * 薪资范围 格式：最低薪资（含）,最高薪资（含），薪资结算方式是面议时为空。 如果为单价型岗位，最低薪资和最高薪资内容保持一致，如: 800,800。单位：元
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 岗位来源，如安心快招渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 岗位招聘信息生效时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 工作时段-结束时间，单位：小时
	 */
	@ApiField("work_interval_end")
	private Date workIntervalEnd;

	/**
	 * 工作时段-开始时间,单位：小时
	 */
	@ApiField("work_interval_start")
	private Date workIntervalStart;

	/**
	 * 是否在线办公 是传true，否传false
	 */
	@ApiField("work_online")
	private Boolean workOnline;

	/**
	 * 工作年限要求，单位：年
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

	public List<String> getJobRequires() {
		return this.jobRequires;
	}
	public void setJobRequires(List<String> jobRequires) {
		this.jobRequires = jobRequires;
	}

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
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

	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Date getWorkIntervalEnd() {
		return this.workIntervalEnd;
	}
	public void setWorkIntervalEnd(Date workIntervalEnd) {
		this.workIntervalEnd = workIntervalEnd;
	}

	public Date getWorkIntervalStart() {
		return this.workIntervalStart;
	}
	public void setWorkIntervalStart(Date workIntervalStart) {
		this.workIntervalStart = workIntervalStart;
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

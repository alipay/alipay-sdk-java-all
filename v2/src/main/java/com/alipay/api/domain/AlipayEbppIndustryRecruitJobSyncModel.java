package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心招工平台岗位同步
 *
 * @author auto create
 * @since 1.0, 2025-03-11 16:52:24
 */
public class AlipayEbppIndustryRecruitJobSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2435839391115854138L;

	/**
	 * 学历要求
	 */
	@ApiField("academic_require")
	private String academicRequire;

	/**
	 * 岗位详情地址
	 */
	@ApiField("address_info")
	private JobAddress addressInfo;

	/**
	 * 年龄要求，最小年龄(含),最大年龄(含)；
最小年龄18
	 */
	@ApiField("age")
	private String age;

	/**
	 * C端岗位详情页面url
	 */
	@ApiField("client_job_url")
	private String clientJobUrl;

	/**
	 * 内容标签最多5个，每个标签最多7个中文字符
	 */
	@ApiListField("employee_welfare")
	@ApiField("string")
	private List<String> employeeWelfare;

	/**
	 * 个人：填写姓名
个体/企业：填写企业全称
	 */
	@ApiField("employer_name")
	private String employerName;

	/**
	 * 雇主类型
	 */
	@ApiField("employer_type")
	private String employerType;

	/**
	 * 性别要求
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 毕业时间，格式:yyyy-MM-dd
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/**
	 * 招工方openId；hire_user_id和hire_open_id二选一填写，可以都为空
	 */
	@ApiField("hire_open_id")
	private String hireOpenId;

	/**
	 * 岗位招聘状态：HIRING-招聘中,CLOSED-停止招聘
	 */
	@ApiField("hire_status")
	private String hireStatus;

	/**
	 * 招工方UID；hire_user_id和hire_open_id二选一填写，可以都为空
	 */
	@ApiField("hire_user_id")
	private String hireUserId;

	/**
	 * 招工方手机号
	 */
	@ApiField("hire_user_mobile")
	private String hireUserMobile;

	/**
	 * 招工方姓名
	 */
	@ApiField("hire_user_name")
	private String hireUserName;

	/**
	 * 岗位详情内容
	 */
	@ApiField("job_detail")
	private String jobDetail;

	/**
	 * 岗位招聘结束时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("job_end_time")
	private Date jobEndTime;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 当岗位状态 = 停止招聘时，必填；
	 */
	@ApiField("job_off_reason")
	private String jobOffReason;

	/**
	 * 岗位类型
用于岗位筛选、岗位匹配等场景，具体枚举值清单如下（传第三级岗位类型Code）：<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/nmowzfqvl8itkado" target="_blank">岗位类型清单</a>
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 外部服务商雇主id
	 */
	@ApiField("out_hire_user_id")
	private String outHireUserId;

	/**
	 * ISV侧岗位唯一标识
	 */
	@ApiField("out_job_id")
	private String outJobId;

	/**
	 * 岗位就业模式
	 */
	@ApiField("part_time_mode")
	private String partTimeMode;

	/**
	 * 绩效奖金；（单位：元）
	 */
	@ApiField("performance_bonus")
	private String performanceBonus;

	/**
	 * 0时为不限
	 */
	@ApiField("recruit_count")
	private Long recruitCount;

	/**
	 * 最大薪资，薪资单位为面议时填面议；（单位：元）
	 */
	@ApiField("salary_max")
	private String salaryMax;

	/**
	 * 薪资单位为面议时填面议；（单位：元）
	 */
	@ApiField("salary_min")
	private String salaryMin;

	/**
	 * 岗位薪资单位
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * B端岗位详情地址
	 */
	@ApiField("server_job_url")
	private String serverJobUrl;

	/**
	 * 岗位来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 工作结束日期，格式:yyyy-MM-dd
	 */
	@ApiField("work_end_date")
	private String workEndDate;

	/**
	 * 工作时段结束时间，格式：HH:mm:ss
	 */
	@ApiField("work_end_time")
	private String workEndTime;

	/**
	 * 工作要求
	 */
	@ApiListField("work_require")
	@ApiField("string")
	private List<String> workRequire;

	/**
	 * 工作开始日期，格式:yyyy-MM-dd
	 */
	@ApiField("work_start_date")
	private String workStartDate;

	/**
	 * 工作时段开始时间，格式：HH:mm:ss
	 */
	@ApiField("work_start_time")
	private String workStartTime;

	/**
	 * 工作年限
	 */
	@ApiField("working_years")
	private String workingYears;

	public String getAcademicRequire() {
		return this.academicRequire;
	}
	public void setAcademicRequire(String academicRequire) {
		this.academicRequire = academicRequire;
	}

	public JobAddress getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(JobAddress addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getClientJobUrl() {
		return this.clientJobUrl;
	}
	public void setClientJobUrl(String clientJobUrl) {
		this.clientJobUrl = clientJobUrl;
	}

	public List<String> getEmployeeWelfare() {
		return this.employeeWelfare;
	}
	public void setEmployeeWelfare(List<String> employeeWelfare) {
		this.employeeWelfare = employeeWelfare;
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

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGraduationTime() {
		return this.graduationTime;
	}
	public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
	}

	public String getHireOpenId() {
		return this.hireOpenId;
	}
	public void setHireOpenId(String hireOpenId) {
		this.hireOpenId = hireOpenId;
	}

	public String getHireStatus() {
		return this.hireStatus;
	}
	public void setHireStatus(String hireStatus) {
		this.hireStatus = hireStatus;
	}

	public String getHireUserId() {
		return this.hireUserId;
	}
	public void setHireUserId(String hireUserId) {
		this.hireUserId = hireUserId;
	}

	public String getHireUserMobile() {
		return this.hireUserMobile;
	}
	public void setHireUserMobile(String hireUserMobile) {
		this.hireUserMobile = hireUserMobile;
	}

	public String getHireUserName() {
		return this.hireUserName;
	}
	public void setHireUserName(String hireUserName) {
		this.hireUserName = hireUserName;
	}

	public String getJobDetail() {
		return this.jobDetail;
	}
	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
	}

	public Date getJobEndTime() {
		return this.jobEndTime;
	}
	public void setJobEndTime(Date jobEndTime) {
		this.jobEndTime = jobEndTime;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobOffReason() {
		return this.jobOffReason;
	}
	public void setJobOffReason(String jobOffReason) {
		this.jobOffReason = jobOffReason;
	}

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getOutHireUserId() {
		return this.outHireUserId;
	}
	public void setOutHireUserId(String outHireUserId) {
		this.outHireUserId = outHireUserId;
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

	public String getPerformanceBonus() {
		return this.performanceBonus;
	}
	public void setPerformanceBonus(String performanceBonus) {
		this.performanceBonus = performanceBonus;
	}

	public Long getRecruitCount() {
		return this.recruitCount;
	}
	public void setRecruitCount(Long recruitCount) {
		this.recruitCount = recruitCount;
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

	public String getServerJobUrl() {
		return this.serverJobUrl;
	}
	public void setServerJobUrl(String serverJobUrl) {
		this.serverJobUrl = serverJobUrl;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getWorkEndDate() {
		return this.workEndDate;
	}
	public void setWorkEndDate(String workEndDate) {
		this.workEndDate = workEndDate;
	}

	public String getWorkEndTime() {
		return this.workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}

	public List<String> getWorkRequire() {
		return this.workRequire;
	}
	public void setWorkRequire(List<String> workRequire) {
		this.workRequire = workRequire;
	}

	public String getWorkStartDate() {
		return this.workStartDate;
	}
	public void setWorkStartDate(String workStartDate) {
		this.workStartDate = workStartDate;
	}

	public String getWorkStartTime() {
		return this.workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}

	public String getWorkingYears() {
		return this.workingYears;
	}
	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}

}

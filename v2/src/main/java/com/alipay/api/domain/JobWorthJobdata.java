package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工作证职业数据回流接口字段
 *
 * @author auto create
 * @since 1.0, 2023-06-09 14:06:28
 */
public class JobWorthJobdata extends AlipayObject {

	private static final long serialVersionUID = 7452433885144732855L;

	/**
	 * 证书发证机构
	 */
	@ApiField("certificate_grant_institution")
	private String certificateGrantInstitution;

	/**
	 * 证书编号
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 证书等级：中文
	 */
	@ApiField("certificate_level")
	private String certificateLevel;

	/**
	 * 证书名称
	 */
	@ApiField("certificate_name")
	private String certificateName;

	/**
	 * 工作证图片上传接口返回的id
	 */
	@ApiField("certificate_pic_id")
	private String certificatePicId;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 学历，可以用以下字段HIGHSCHOOL_AND_BELOW（高中及以下），POLYTECHNIC（中专），COLLEGE（大专），BACHELOR（本科），MASTER（硕士），DOCTOR_AND_ABOVE（博士及以上）
	 */
	@ApiField("degree")
	private String degree;

	/**
	 * 商户侧投递岗位id
	 */
	@ApiField("delivery_position_id")
	private String deliveryPositionId;

	/**
	 * 投递时间戳
	 */
	@ApiField("delivery_time")
	private Long deliveryTime;

	/**
	 * 教育状态只有两种，GRADUATE(毕业)，STUDY（未毕业）
	 */
	@ApiField("education_status")
	private String educationStatus;

	/**
	 * 报名流水号
	 */
	@ApiField("entry_no")
	private String entryNo;

	/**
	 * 考试分数
	 */
	@ApiField("exam_score")
	private String examScore;

	/**
	 * 工作证图片上传接口返回的id
	 */
	@ApiField("head_pic_id")
	private String headPicId;

	/**
	 * 求职意向，城市的adccode  例如110000（北京市）
	 */
	@ApiField("intention_city")
	private String intentionCity;

	/**
	 * 意向城市名，例如北京市，传入北京即可，大理白族自治州，传入大理即可
	 */
	@ApiField("intention_city_name")
	private String intentionCityName;

	/**
	 * 发证日期，ms时间戳
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 岗位对应的职业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 职业名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 商户职业Id
	 */
	@ApiField("ka_job_id")
	private String kaJobId;

	/**
	 * 商户职业名称
	 */
	@ApiField("ka_job_name")
	private String kaJobName;

	/**
	 * 商户行业Id
	 */
	@ApiField("ka_profession_id")
	private String kaProfessionId;

	/**
	 * 商户行业名称
	 */
	@ApiField("ka_profession_name")
	private String kaProfessionName;

	/**
	 * 省份
	 */
	@ApiField("location")
	private String location;

	/**
	 * 毕业的月
	 */
	@ApiField("month")
	private String month;

	/**
	 * 对应类型相关接口生成
	 */
	@ApiField("once_token")
	private String onceToken;

	/**
	 * 岗位对应的行业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
	 */
	@ApiField("profession_id")
	private String professionId;

	/**
	 * 行业名称
	 */
	@ApiField("profession_name")
	private String professionName;

	/**
	 * 求职意向，薪水范围，不能低于salary_min
	 */
	@ApiField("salary_max")
	private String salaryMax;

	/**
	 * 求职意向，薪水范围，不能高于salary_max
	 */
	@ApiField("salary_min")
	private String salaryMin;

	/**
	 * 薪资单位，元/日(DAY)、元/次(TIME)、元/月(MONTH)、元/小时(HOUR)、元/件 (NUM)、元/周 (WEEK)、其他 (OTHER)
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * 学校
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 用英文逗号分隔，最多6项
	 */
	@ApiField("skill_name")
	private String skillName;

	/**
	 * 参加工作的时间，格式形如 2011-07
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 信息类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 有效期：开始结束 ms 时间戳
	 */
	@ApiField("valid_date_end")
	private String validDateEnd;

	/**
	 * 有效期：开始时间 ms时间戳
	 */
	@ApiField("valid_date_start")
	private String validDateStart;

	/**
	 * 校验状态
	 */
	@ApiField("verify_status")
	private String verifyStatus;

	/**
	 * 工作描述
	 */
	@ApiField("work_desc")
	private String workDesc;

	/**
	 * 工作结束时间，毫秒级时间戳
	 */
	@ApiField("work_end_time")
	private String workEndTime;

	/**
	 * 工作经历工作地
	 */
	@ApiField("work_place")
	private String workPlace;

	/**
	 * 岗位属性：全职(FULL_TIME)或者兼职(PART_TIME)
	 */
	@ApiField("work_property")
	private String workProperty;

	/**
	 * 工作开始时间，毫秒级时间戳
	 */
	@ApiField("work_start_time")
	private String workStartTime;

	/**
	 * 毕业的年
	 */
	@ApiField("year")
	private String year;

	public String getCertificateGrantInstitution() {
		return this.certificateGrantInstitution;
	}
	public void setCertificateGrantInstitution(String certificateGrantInstitution) {
		this.certificateGrantInstitution = certificateGrantInstitution;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateLevel() {
		return this.certificateLevel;
	}
	public void setCertificateLevel(String certificateLevel) {
		this.certificateLevel = certificateLevel;
	}

	public String getCertificateName() {
		return this.certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificatePicId() {
		return this.certificatePicId;
	}
	public void setCertificatePicId(String certificatePicId) {
		this.certificatePicId = certificatePicId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDegree() {
		return this.degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDeliveryPositionId() {
		return this.deliveryPositionId;
	}
	public void setDeliveryPositionId(String deliveryPositionId) {
		this.deliveryPositionId = deliveryPositionId;
	}

	public Long getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(Long deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getEducationStatus() {
		return this.educationStatus;
	}
	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}

	public String getEntryNo() {
		return this.entryNo;
	}
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	public String getExamScore() {
		return this.examScore;
	}
	public void setExamScore(String examScore) {
		this.examScore = examScore;
	}

	public String getHeadPicId() {
		return this.headPicId;
	}
	public void setHeadPicId(String headPicId) {
		this.headPicId = headPicId;
	}

	public String getIntentionCity() {
		return this.intentionCity;
	}
	public void setIntentionCity(String intentionCity) {
		this.intentionCity = intentionCity;
	}

	public String getIntentionCityName() {
		return this.intentionCityName;
	}
	public void setIntentionCityName(String intentionCityName) {
		this.intentionCityName = intentionCityName;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
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

	public String getKaJobId() {
		return this.kaJobId;
	}
	public void setKaJobId(String kaJobId) {
		this.kaJobId = kaJobId;
	}

	public String getKaJobName() {
		return this.kaJobName;
	}
	public void setKaJobName(String kaJobName) {
		this.kaJobName = kaJobName;
	}

	public String getKaProfessionId() {
		return this.kaProfessionId;
	}
	public void setKaProfessionId(String kaProfessionId) {
		this.kaProfessionId = kaProfessionId;
	}

	public String getKaProfessionName() {
		return this.kaProfessionName;
	}
	public void setKaProfessionName(String kaProfessionName) {
		this.kaProfessionName = kaProfessionName;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getOnceToken() {
		return this.onceToken;
	}
	public void setOnceToken(String onceToken) {
		this.onceToken = onceToken;
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

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSkillName() {
		return this.skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValidDateEnd() {
		return this.validDateEnd;
	}
	public void setValidDateEnd(String validDateEnd) {
		this.validDateEnd = validDateEnd;
	}

	public String getValidDateStart() {
		return this.validDateStart;
	}
	public void setValidDateStart(String validDateStart) {
		this.validDateStart = validDateStart;
	}

	public String getVerifyStatus() {
		return this.verifyStatus;
	}
	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getWorkDesc() {
		return this.workDesc;
	}
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}

	public String getWorkEndTime() {
		return this.workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}

	public String getWorkPlace() {
		return this.workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getWorkProperty() {
		return this.workProperty;
	}
	public void setWorkProperty(String workProperty) {
		this.workProperty = workProperty;
	}

	public String getWorkStartTime() {
		return this.workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}

	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}

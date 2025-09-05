package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * moka招聘数据同步
 *
 * @author auto create
 * @since 1.0, 2025-08-11 10:15:55
 */
public class AlipayDigitalmgmtHrcampuscoreEntrySyncModel extends AlipayObject {

	private static final long serialVersionUID = 2489988933718465681L;

	/**
	 * 校招签约三方名称（校招传）
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/**
	 * 三方协议状态（校招传）
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/**
	 * 是否需要添加预入职申请单
	 */
	@ApiField("apply_status")
	private Boolean applyStatus;

	/**
	 * 校招必填
	 */
	@ApiField("approval_id")
	private String approvalId;

	/**
	 * 校招批次英文名称
	 */
	@ApiField("batch_en_name")
	private String batchEnName;

	/**
	 * 入职薪资批次
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 校招批次中文名称
	 */
	@ApiField("batch_name")
	private String batchName;

	/**
	 * 校招批次类型
	 */
	@ApiField("batch_type")
	private String batchType;

	/**
	 * 上年度实际奖金 单位人民币
	 */
	@ApiField("bonus_all_year_last")
	private String bonusAllYearLast;

	/**
	 * 年度目标奖金 单位人民币
	 */
	@ApiField("bonus_of_year_last")
	private String bonusOfYearLast;

	/**
	 * 校招阶段
	 */
	@ApiField("campus_phase_status")
	private String campusPhaseStatus;

	/**
	 * 901入职单必填(工号)
	 */
	@ApiField("candidate_work_no")
	private String candidateWorkNo;

	/**
	 * 目前月资 人民币
	 */
	@ApiField("current_salary_month")
	private String currentSalaryMonth;

	/**
	 * 其他薪资 单位人民币
	 */
	@ApiField("current_salary_other")
	private String currentSalaryOther;

	/**
	 * 目前年薪 人民币
	 */
	@ApiField("current_salary_year")
	private String currentSalaryYear;

	/**
	 * 入职部门
	 */
	@ApiField("dept_no")
	private String deptNo;

	/**
	 * 直接主管工号
	 */
	@ApiField("direct_manager")
	private String directManager;

	/**
	 * 员工类型
	 */
	@ApiField("employee_type")
	private String employeeType;

	/**
	 * 发放月数 单位月
	 */
	@ApiField("give_out_month")
	private String giveOutMonth;

	/**
	 * 毕业时间
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/**
	 * 是否有三方协议(针对校招)
	 */
	@ApiField("has_agreement")
	private String hasAgreement;

	/**
	 * 候选人最高学历： 初中 高中 职高 中专 大学专科 大学本科 硕士研究生 博士研究生 未知 博士后 初中以下
	 */
	@ApiField("hight_degree")
	private String hightDegree;

	/**
	 * 传渠道名称，入职系统没有该值，会自动保存到数据库
	 */
	@ApiField("hire_channel")
	private String hireChannel;

	/**
	 * 招聘类型：
社招：1
校招：2
	 */
	@ApiField("hire_channel_type")
	private Long hireChannelType;

	/**
	 * 招聘来源地：郑州、杭州、长沙
	 */
	@ApiField("hire_from_place")
	private String hireFromPlace;

	/**
	 * 招聘工作年限 单位年
	 */
	@ApiField("hire_work_year")
	private String hireWorkYear;

	/**
	 * 期望薪资 单位人民币
	 */
	@ApiField("hope_salary")
	private String hopeSalary;

	/**
	 * hrg域账号
	 */
	@ApiField("hrg_work_no")
	private String hrgWorkNo;

	/**
	 * 居民身份证号属于隐私信息，非必填，可内部hr工作台系统维护。
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 证件类型 默认：18位身份证
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/**
	 * 面试确定的扩展层级（S1、S2、S3、S4、S5、S6、S7、S8、S9）
	 */
	@ApiField("init_ext_level_code")
	private String initExtLevelCode;

	/**
	 * 实习生定级
	 */
	@ApiField("intern_grading")
	private String internGrading;

	/**
	 * 面试评价信息
	 */
	@ApiField("interview_info")
	private String interviewInfo;

	/**
	 * 面试履历id
	 */
	@ApiField("interview_resume_id")
	private String interviewResumeId;

	/**
	 * 是否已婚
	 */
	@ApiField("is_married")
	private String isMarried;

	/**
	 * 是否901入职单
	 */
	@ApiField("is_nine_zero_one")
	private String isNineZeroOne;

	/**
	 * 是否海外招聘
	 */
	@ApiField("is_oversea")
	private String isOversea;

	/**
	 * 候选人是否实习生：true||false
	 */
	@ApiField("is_practice")
	private Boolean isPractice;

	/**
	 * 是否有股权
	 */
	@ApiField("is_rsu_last")
	private String isRsuLast;

	/**
	 * 社招应聘id
	 */
	@ApiField("job_application_id")
	private String jobApplicationId;

	/**
	 * 上家公司名称
	 */
	@ApiField("last_master")
	private String lastMaster;

	/**
	 * 层级（SZML-S1、SZML-S2、SZML-S3、SZML-S4、SZML-S5、SZML-S6、SZML-S7、SZML-S8、SZML-S9）
	 */
	@ApiField("level_code")
	private String levelCode;

	/**
	 * 层级细分(+、-、=)
	 */
	@ApiField("level_code_ext")
	private String levelCodeExt;

	/**
	 * 候选人邮箱
	 */
	@ApiField("mail")
	private String mail;

	/**
	 * 候选人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 候选人电话区号
	 */
	@ApiField("mobile_zone")
	private String mobileZone;

	/**
	 * 候选人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 国家
	 */
	@ApiField("national")
	private String national;

	/**
	 * 津贴 单位人民币
	 */
	@ApiField("out_subsidy_before")
	private String outSubsidyBefore;

	/**
	 * 岗位名称
	 */
	@ApiField("position_name")
	private String positionName;

	/**
	 * 面试详情
	 */
	@ApiField("resume")
	private String resume;

	/**
	 * 股权说明
	 */
	@ApiField("rsu_last_remark")
	private String rsuLastRemark;

	/**
	 * 薪资币种
	 */
	@ApiField("salary_currency")
	private String salaryCurrency;

	/**
	 * 同等职位工作年限 单位年
	 */
	@ApiField("same_work_exp")
	private String sameWorkExp;

	/**
	 * 毕业学校
	 */
	@ApiField("school")
	private String school;

	/**
	 * 学校所在地
	 */
	@ApiField("school_position")
	private String schoolPosition;

	/**
	 * 候选人性别:男、女、未知
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 专业
	 */
	@ApiField("specialty")
	private String specialty;

	/**
	 * 公司福利
	 */
	@ApiField("walfare_last")
	private String walfareLast;

	/**
	 * 特色福利
	 */
	@ApiField("walfare_text_last")
	private String walfareTextLast;

	/**
	 * 工作年限 单位年
	 */
	@ApiField("work_experience")
	private String workExperience;

	/**
	 * 工作地编号（6956 河南-郑州-郑州文化产业大厦
4234 浙江-杭州-飞天园区
7394 湖南-长沙-长沙市麓谷信息港）
	 */
	@ApiField("work_place")
	private String workPlace;

	public String getAgreementName() {
		return this.agreementName;
	}
	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}

	public String getAgreementStatus() {
		return this.agreementStatus;
	}
	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public Boolean getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(Boolean applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getApprovalId() {
		return this.approvalId;
	}
	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
	}

	public String getBatchEnName() {
		return this.batchEnName;
	}
	public void setBatchEnName(String batchEnName) {
		this.batchEnName = batchEnName;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return this.batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchType() {
		return this.batchType;
	}
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getBonusAllYearLast() {
		return this.bonusAllYearLast;
	}
	public void setBonusAllYearLast(String bonusAllYearLast) {
		this.bonusAllYearLast = bonusAllYearLast;
	}

	public String getBonusOfYearLast() {
		return this.bonusOfYearLast;
	}
	public void setBonusOfYearLast(String bonusOfYearLast) {
		this.bonusOfYearLast = bonusOfYearLast;
	}

	public String getCampusPhaseStatus() {
		return this.campusPhaseStatus;
	}
	public void setCampusPhaseStatus(String campusPhaseStatus) {
		this.campusPhaseStatus = campusPhaseStatus;
	}

	public String getCandidateWorkNo() {
		return this.candidateWorkNo;
	}
	public void setCandidateWorkNo(String candidateWorkNo) {
		this.candidateWorkNo = candidateWorkNo;
	}

	public String getCurrentSalaryMonth() {
		return this.currentSalaryMonth;
	}
	public void setCurrentSalaryMonth(String currentSalaryMonth) {
		this.currentSalaryMonth = currentSalaryMonth;
	}

	public String getCurrentSalaryOther() {
		return this.currentSalaryOther;
	}
	public void setCurrentSalaryOther(String currentSalaryOther) {
		this.currentSalaryOther = currentSalaryOther;
	}

	public String getCurrentSalaryYear() {
		return this.currentSalaryYear;
	}
	public void setCurrentSalaryYear(String currentSalaryYear) {
		this.currentSalaryYear = currentSalaryYear;
	}

	public String getDeptNo() {
		return this.deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDirectManager() {
		return this.directManager;
	}
	public void setDirectManager(String directManager) {
		this.directManager = directManager;
	}

	public String getEmployeeType() {
		return this.employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getGiveOutMonth() {
		return this.giveOutMonth;
	}
	public void setGiveOutMonth(String giveOutMonth) {
		this.giveOutMonth = giveOutMonth;
	}

	public String getGraduationTime() {
		return this.graduationTime;
	}
	public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
	}

	public String getHasAgreement() {
		return this.hasAgreement;
	}
	public void setHasAgreement(String hasAgreement) {
		this.hasAgreement = hasAgreement;
	}

	public String getHightDegree() {
		return this.hightDegree;
	}
	public void setHightDegree(String hightDegree) {
		this.hightDegree = hightDegree;
	}

	public String getHireChannel() {
		return this.hireChannel;
	}
	public void setHireChannel(String hireChannel) {
		this.hireChannel = hireChannel;
	}

	public Long getHireChannelType() {
		return this.hireChannelType;
	}
	public void setHireChannelType(Long hireChannelType) {
		this.hireChannelType = hireChannelType;
	}

	public String getHireFromPlace() {
		return this.hireFromPlace;
	}
	public void setHireFromPlace(String hireFromPlace) {
		this.hireFromPlace = hireFromPlace;
	}

	public String getHireWorkYear() {
		return this.hireWorkYear;
	}
	public void setHireWorkYear(String hireWorkYear) {
		this.hireWorkYear = hireWorkYear;
	}

	public String getHopeSalary() {
		return this.hopeSalary;
	}
	public void setHopeSalary(String hopeSalary) {
		this.hopeSalary = hopeSalary;
	}

	public String getHrgWorkNo() {
		return this.hrgWorkNo;
	}
	public void setHrgWorkNo(String hrgWorkNo) {
		this.hrgWorkNo = hrgWorkNo;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdCardType() {
		return this.idCardType;
	}
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getInitExtLevelCode() {
		return this.initExtLevelCode;
	}
	public void setInitExtLevelCode(String initExtLevelCode) {
		this.initExtLevelCode = initExtLevelCode;
	}

	public String getInternGrading() {
		return this.internGrading;
	}
	public void setInternGrading(String internGrading) {
		this.internGrading = internGrading;
	}

	public String getInterviewInfo() {
		return this.interviewInfo;
	}
	public void setInterviewInfo(String interviewInfo) {
		this.interviewInfo = interviewInfo;
	}

	public String getInterviewResumeId() {
		return this.interviewResumeId;
	}
	public void setInterviewResumeId(String interviewResumeId) {
		this.interviewResumeId = interviewResumeId;
	}

	public String getIsMarried() {
		return this.isMarried;
	}
	public void setIsMarried(String isMarried) {
		this.isMarried = isMarried;
	}

	public String getIsNineZeroOne() {
		return this.isNineZeroOne;
	}
	public void setIsNineZeroOne(String isNineZeroOne) {
		this.isNineZeroOne = isNineZeroOne;
	}

	public String getIsOversea() {
		return this.isOversea;
	}
	public void setIsOversea(String isOversea) {
		this.isOversea = isOversea;
	}

	public Boolean getIsPractice() {
		return this.isPractice;
	}
	public void setIsPractice(Boolean isPractice) {
		this.isPractice = isPractice;
	}

	public String getIsRsuLast() {
		return this.isRsuLast;
	}
	public void setIsRsuLast(String isRsuLast) {
		this.isRsuLast = isRsuLast;
	}

	public String getJobApplicationId() {
		return this.jobApplicationId;
	}
	public void setJobApplicationId(String jobApplicationId) {
		this.jobApplicationId = jobApplicationId;
	}

	public String getLastMaster() {
		return this.lastMaster;
	}
	public void setLastMaster(String lastMaster) {
		this.lastMaster = lastMaster;
	}

	public String getLevelCode() {
		return this.levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelCodeExt() {
		return this.levelCodeExt;
	}
	public void setLevelCodeExt(String levelCodeExt) {
		this.levelCodeExt = levelCodeExt;
	}

	public String getMail() {
		return this.mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobileZone() {
		return this.mobileZone;
	}
	public void setMobileZone(String mobileZone) {
		this.mobileZone = mobileZone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNational() {
		return this.national;
	}
	public void setNational(String national) {
		this.national = national;
	}

	public String getOutSubsidyBefore() {
		return this.outSubsidyBefore;
	}
	public void setOutSubsidyBefore(String outSubsidyBefore) {
		this.outSubsidyBefore = outSubsidyBefore;
	}

	public String getPositionName() {
		return this.positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getResume() {
		return this.resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getRsuLastRemark() {
		return this.rsuLastRemark;
	}
	public void setRsuLastRemark(String rsuLastRemark) {
		this.rsuLastRemark = rsuLastRemark;
	}

	public String getSalaryCurrency() {
		return this.salaryCurrency;
	}
	public void setSalaryCurrency(String salaryCurrency) {
		this.salaryCurrency = salaryCurrency;
	}

	public String getSameWorkExp() {
		return this.sameWorkExp;
	}
	public void setSameWorkExp(String sameWorkExp) {
		this.sameWorkExp = sameWorkExp;
	}

	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchoolPosition() {
		return this.schoolPosition;
	}
	public void setSchoolPosition(String schoolPosition) {
		this.schoolPosition = schoolPosition;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSpecialty() {
		return this.specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getWalfareLast() {
		return this.walfareLast;
	}
	public void setWalfareLast(String walfareLast) {
		this.walfareLast = walfareLast;
	}

	public String getWalfareTextLast() {
		return this.walfareTextLast;
	}
	public void setWalfareTextLast(String walfareTextLast) {
		this.walfareTextLast = walfareTextLast;
	}

	public String getWorkExperience() {
		return this.workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getWorkPlace() {
		return this.workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

}

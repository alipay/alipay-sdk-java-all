package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证商家传入的工作岗位信息
 *
 * @author auto create
 * @since 1.0, 2022-07-12 14:15:50
 */
public class JobWorthPositionInfo extends AlipayObject {

	private static final long serialVersionUID = 5868636833525788777L;

	/**
	 * 职位要求-年龄要求	无要求（不传）、28岁以上(OVER28)、40岁以下(BELOW40)、25岁～35岁(25TO35)
	 */
	@ApiField("age")
	private String age;

	/**
	 * 福利，现有标签，最多5个标签，使用英文,分割
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 技能、证书等要求，比如学历、健康证、普通话或其他技能证书等,参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
	 */
	@ApiField("certifications")
	private String certifications;

	/**
	 * 发布企业统一社会信用代码
	 */
	@ApiField("company_certificate")
	private String companyCertificate;

	/**
	 * 企业工商全称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 招聘人数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 学历要求,HIGHSCHOOL_AND_BELOW（高中及以下），POLYTECHNIC（中专），COLLEGE（大专），BACHELOR（本科），MASTER（硕士），DOCTOR_AND_ABOVE（博士及以上）
	 */
	@ApiField("education")
	private String education;

	/**
	 * 无要求（不传）、男或者女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 合作方jobId
	 */
	@ApiField("ka_position_id")
	private String kaPositionId;

	/**
	 * 长文本描述
	 */
	@ApiField("position_desc")
	private String positionDesc;

	/**
	 * 工作证岗位库的职位主键，只有更新职位信息时需要传入
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 岗位对应的行业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
	 */
	@ApiField("position_job_id")
	private String positionJobId;

	/**
	 * 岗位对应的职业名称
	 */
	@ApiField("position_job_name")
	private String positionJobName;

	/**
	 * 岗位对应的职业id，字段参考https://www.yuque.com/wx3dkp/gwckr4/bs03t3
	 */
	@ApiField("position_profession_id")
	private String positionProfessionId;

	/**
	 * 岗位属性：全职(FULL_TIME)或者兼职(PART_TIME)
	 */
	@ApiField("position_property")
	private String positionProperty;

	/**
	 * 职位的状态，只有上架(UNCHECK)和下架(OFFLINE)两种
	 */
	@ApiField("position_status")
	private String positionStatus;

	/**
	 * 短文本描述
	 */
	@ApiField("position_title")
	private String positionTitle;

	/**
	 * 薪水范围，不能低于salary_min
	 */
	@ApiField("salary_max")
	private String salaryMax;

	/**
	 * 薪水范围，不能高于salary_max
	 */
	@ApiField("salary_min")
	private String salaryMin;

	/**
	 * 薪资类型：日结(DAY)、月结(MONTH)、周结(WEEK)、完工结(DONE)、其他(OTHER)
	 */
	@ApiField("salary_type")
	private String salaryType;

	/**
	 * 薪资单位，元/日(DAY)、元/次(TIME)、元/月(MONTH)、元/小时(HOUR)、元/件 (NUM)、元/周 (WEEK)、其他 (OTHER)
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * 岗位需要的技能标签，最多5个，使用英文逗号分割
	 */
	@ApiField("skill_tag")
	private String skillTag;

	/**
	 * 职位跳转链接，当前只支持支付宝小程序，也就是alipays://platformapi/ 开头
	 */
	@ApiField("skip_url")
	private String skipUrl;

	/**
	 * 高德city code，例：北京010，线上工作9999
	 */
	@ApiField("work_city")
	private String workCity;

	/**
	 * 经纬度，前面是经度，后面是纬度，使用英文逗号隔开
	 */
	@ApiField("work_longitude")
	private String workLongitude;

	/**
	 * 工作地所在的区县,使用高德的adcode，例：朝阳区110105
	 */
	@ApiField("work_region")
	private String workRegion;

	/**
	 * 工作年限，1年以下（ONE）、1～3年（THREE）、3～5年（FIVE）、5～10年（TEN）、10年以上（OVER_TEN）
	 */
	@ApiField("work_year")
	private String workYear;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getCertifications() {
		return this.certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public String getCompanyCertificate() {
		return this.companyCertificate;
	}
	public void setCompanyCertificate(String companyCertificate) {
		this.companyCertificate = companyCertificate;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getEducation() {
		return this.education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getKaPositionId() {
		return this.kaPositionId;
	}
	public void setKaPositionId(String kaPositionId) {
		this.kaPositionId = kaPositionId;
	}

	public String getPositionDesc() {
		return this.positionDesc;
	}
	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getPositionJobId() {
		return this.positionJobId;
	}
	public void setPositionJobId(String positionJobId) {
		this.positionJobId = positionJobId;
	}

	public String getPositionJobName() {
		return this.positionJobName;
	}
	public void setPositionJobName(String positionJobName) {
		this.positionJobName = positionJobName;
	}

	public String getPositionProfessionId() {
		return this.positionProfessionId;
	}
	public void setPositionProfessionId(String positionProfessionId) {
		this.positionProfessionId = positionProfessionId;
	}

	public String getPositionProperty() {
		return this.positionProperty;
	}
	public void setPositionProperty(String positionProperty) {
		this.positionProperty = positionProperty;
	}

	public String getPositionStatus() {
		return this.positionStatus;
	}
	public void setPositionStatus(String positionStatus) {
		this.positionStatus = positionStatus;
	}

	public String getPositionTitle() {
		return this.positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
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

	public String getSalaryType() {
		return this.salaryType;
	}
	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}

	public String getSalaryUnit() {
		return this.salaryUnit;
	}
	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	public String getSkillTag() {
		return this.skillTag;
	}
	public void setSkillTag(String skillTag) {
		this.skillTag = skillTag;
	}

	public String getSkipUrl() {
		return this.skipUrl;
	}
	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}

	public String getWorkCity() {
		return this.workCity;
	}
	public void setWorkCity(String workCity) {
		this.workCity = workCity;
	}

	public String getWorkLongitude() {
		return this.workLongitude;
	}
	public void setWorkLongitude(String workLongitude) {
		this.workLongitude = workLongitude;
	}

	public String getWorkRegion() {
		return this.workRegion;
	}
	public void setWorkRegion(String workRegion) {
		this.workRegion = workRegion;
	}

	public String getWorkYear() {
		return this.workYear;
	}
	public void setWorkYear(String workYear) {
		this.workYear = workYear;
	}

}

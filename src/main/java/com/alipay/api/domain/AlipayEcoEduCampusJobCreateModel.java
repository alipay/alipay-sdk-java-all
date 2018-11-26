package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实习生职位推送（新增/修改）接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:00
 */
public class AlipayEcoEduCampusJobCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1251566215611736585L;

	/**
	 * 城市编码
	 */
	@ApiField("area_city_code")
	private String areaCityCode;

	/**
	 * 城市名称
	 */
	@ApiField("area_city_name")
	private String areaCityName;

	/**
	 * 区编码
	 */
	@ApiField("area_district_code")
	private String areaDistrictCode;

	/**
	 * 区名称
	 */
	@ApiField("area_district_name")
	private String areaDistrictName;

	/**
	 * 工作详细地址
	 */
	@ApiField("area_job_address")
	private String areaJobAddress;

	/**
	 * 省份编码（直辖市
	 */
	@ApiField("area_province_code")
	private Long areaProvinceCode;

	/**
	 * 省份名称（直辖市）
	 */
	@ApiField("area_province_name")
	private String areaProvinceName;

	/**
	 * 街道名称
	 */
	@ApiField("area_street_name")
	private String areaStreetName;

	/**
	 * 企业法律名称
	 */
	@ApiField("company_lawname")
	private String companyLawname;

	/**
	 * 参数描述企业Logo
	 */
	@ApiField("company_logo")
	private String companyLogo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 第三方公司ID
	 */
	@ApiField("company_source")
	private String companySource;

	/**
	 * 备注json 数据
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 过期时间(毫秒数)
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 刷新时间(毫秒数)
	 */
	@ApiField("gmt_refresh")
	private String gmtRefresh;

	/**
	 * 职位开始时间(毫秒数)
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 职位描述
	 */
	@ApiField("job_desc")
	private String jobDesc;

	/**
	 * 招聘人数
	 */
	@ApiField("job_hire_number")
	private Long jobHireNumber;

	/**
	 * 职位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 职业亮点/关键字
	 */
	@ApiField("job_perk")
	private String jobPerk;

	/**
	 * 要求简历语言（1中文；2英文）
	 */
	@ApiField("job_resume_lg")
	private Long jobResumeLg;

	/**
	 * 学历要求专科（1:大专以下2:大专3:本科4:硕士5:博士6:其他7:不限）
	 */
	@ApiField("job_rq_education")
	private Long jobRqEducation;

	/**
	 * 职业一级分类code
	 */
	@ApiField("job_tier_one_code")
	private String jobTierOneCode;

	/**
	 * 职业一级分类name
	 */
	@ApiField("job_tier_one_name")
	private String jobTierOneName;

	/**
	 * 职业三级分类code
	 */
	@ApiField("job_tier_three_code")
	private String jobTierThreeCode;

	/**
	 * 职业三级分类name
	 */
	@ApiField("job_tier_three_name")
	private String jobTierThreeName;

	/**
	 * 职业二级分类code
	 */
	@ApiField("job_tier_two_code")
	private String jobTierTwoCode;

	/**
	 * 职业二级分类name
	 */
	@ApiField("job_tier_two_name")
	private String jobTierTwoName;

	/**
	 * 职位类型枚举（1实习；2兼职；3全职；）
	 */
	@ApiField("job_type")
	private Long jobType;

	/**
	 * 最大薪资（单位￥）
	 */
	@ApiField("payment_max")
	private Long paymentMax;

	/**
	 * 最小薪资（单位￥）
	 */
	@ApiField("payment_min")
	private Long paymentMin;

	/**
	 * 薪资单位(1:天2:月3:周)
	 */
	@ApiField("payment_unit")
	private Long paymentUnit;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 每周到岗天数
	 */
	@ApiField("tra_job_freq")
	private Long traJobFreq;

	/**
	 * 实习时间长度(单位月)
	 */
	@ApiField("tra_job_period")
	private Long traJobPeriod;

	/**
	 * 是否可转正(1可以；0不可以)
	 */
	@ApiField("tra_job_promot")
	private Long traJobPromot;

	public String getAreaCityCode() {
		return this.areaCityCode;
	}
	public void setAreaCityCode(String areaCityCode) {
		this.areaCityCode = areaCityCode;
	}

	public String getAreaCityName() {
		return this.areaCityName;
	}
	public void setAreaCityName(String areaCityName) {
		this.areaCityName = areaCityName;
	}

	public String getAreaDistrictCode() {
		return this.areaDistrictCode;
	}
	public void setAreaDistrictCode(String areaDistrictCode) {
		this.areaDistrictCode = areaDistrictCode;
	}

	public String getAreaDistrictName() {
		return this.areaDistrictName;
	}
	public void setAreaDistrictName(String areaDistrictName) {
		this.areaDistrictName = areaDistrictName;
	}

	public String getAreaJobAddress() {
		return this.areaJobAddress;
	}
	public void setAreaJobAddress(String areaJobAddress) {
		this.areaJobAddress = areaJobAddress;
	}

	public Long getAreaProvinceCode() {
		return this.areaProvinceCode;
	}
	public void setAreaProvinceCode(Long areaProvinceCode) {
		this.areaProvinceCode = areaProvinceCode;
	}

	public String getAreaProvinceName() {
		return this.areaProvinceName;
	}
	public void setAreaProvinceName(String areaProvinceName) {
		this.areaProvinceName = areaProvinceName;
	}

	public String getAreaStreetName() {
		return this.areaStreetName;
	}
	public void setAreaStreetName(String areaStreetName) {
		this.areaStreetName = areaStreetName;
	}

	public String getCompanyLawname() {
		return this.companyLawname;
	}
	public void setCompanyLawname(String companyLawname) {
		this.companyLawname = companyLawname;
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

	public String getCompanySource() {
		return this.companySource;
	}
	public void setCompanySource(String companySource) {
		this.companySource = companySource;
	}

	public String getContentVar() {
		return this.contentVar;
	}
	public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getGmtRefresh() {
		return this.gmtRefresh;
	}
	public void setGmtRefresh(String gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getJobDesc() {
		return this.jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public Long getJobHireNumber() {
		return this.jobHireNumber;
	}
	public void setJobHireNumber(Long jobHireNumber) {
		this.jobHireNumber = jobHireNumber;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobPerk() {
		return this.jobPerk;
	}
	public void setJobPerk(String jobPerk) {
		this.jobPerk = jobPerk;
	}

	public Long getJobResumeLg() {
		return this.jobResumeLg;
	}
	public void setJobResumeLg(Long jobResumeLg) {
		this.jobResumeLg = jobResumeLg;
	}

	public Long getJobRqEducation() {
		return this.jobRqEducation;
	}
	public void setJobRqEducation(Long jobRqEducation) {
		this.jobRqEducation = jobRqEducation;
	}

	public String getJobTierOneCode() {
		return this.jobTierOneCode;
	}
	public void setJobTierOneCode(String jobTierOneCode) {
		this.jobTierOneCode = jobTierOneCode;
	}

	public String getJobTierOneName() {
		return this.jobTierOneName;
	}
	public void setJobTierOneName(String jobTierOneName) {
		this.jobTierOneName = jobTierOneName;
	}

	public String getJobTierThreeCode() {
		return this.jobTierThreeCode;
	}
	public void setJobTierThreeCode(String jobTierThreeCode) {
		this.jobTierThreeCode = jobTierThreeCode;
	}

	public String getJobTierThreeName() {
		return this.jobTierThreeName;
	}
	public void setJobTierThreeName(String jobTierThreeName) {
		this.jobTierThreeName = jobTierThreeName;
	}

	public String getJobTierTwoCode() {
		return this.jobTierTwoCode;
	}
	public void setJobTierTwoCode(String jobTierTwoCode) {
		this.jobTierTwoCode = jobTierTwoCode;
	}

	public String getJobTierTwoName() {
		return this.jobTierTwoName;
	}
	public void setJobTierTwoName(String jobTierTwoName) {
		this.jobTierTwoName = jobTierTwoName;
	}

	public Long getJobType() {
		return this.jobType;
	}
	public void setJobType(Long jobType) {
		this.jobType = jobType;
	}

	public Long getPaymentMax() {
		return this.paymentMax;
	}
	public void setPaymentMax(Long paymentMax) {
		this.paymentMax = paymentMax;
	}

	public Long getPaymentMin() {
		return this.paymentMin;
	}
	public void setPaymentMin(Long paymentMin) {
		this.paymentMin = paymentMin;
	}

	public Long getPaymentUnit() {
		return this.paymentUnit;
	}
	public void setPaymentUnit(Long paymentUnit) {
		this.paymentUnit = paymentUnit;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public Long getTraJobFreq() {
		return this.traJobFreq;
	}
	public void setTraJobFreq(Long traJobFreq) {
		this.traJobFreq = traJobFreq;
	}

	public Long getTraJobPeriod() {
		return this.traJobPeriod;
	}
	public void setTraJobPeriod(Long traJobPeriod) {
		this.traJobPeriod = traJobPeriod;
	}

	public Long getTraJobPromot() {
		return this.traJobPromot;
	}
	public void setTraJobPromot(Long traJobPromot) {
		this.traJobPromot = traJobPromot;
	}

}

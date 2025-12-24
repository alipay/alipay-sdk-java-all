package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-10 20:47:42
 */
public class OrganizationJobInfo extends AlipayObject {

	private static final long serialVersionUID = 8297614525889394542L;

	/**
	 * 岗位学历要求
	 */
	@ApiField("academic_require")
	private String academicRequire;

	/**
	 * 年龄范围（单位：岁），
其他示例： 不限,不限  18,不限  不限,60
	 */
	@ApiField("age")
	private String age;

	/**
	 * 雇主企业品牌logo
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 雇主企业品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 岗位行政地区编码
</br>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/ed5yn3asbtes7ni4" target="_blank">全量城市行政区划编码（2022Q2版本）
</a></br>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/yi0uix3f0babcfzi" target="_blank">全量区县行政区划编码（2022Q2版本）
</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 招聘人数，为0或为空时不限人数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 雇主企业信用代码
	 */
	@ApiField("employer_cert_no")
	private String employerCertNo;

	/**
	 * 雇主名称(企业名称)
	 */
	@ApiField("employer_name")
	private String employerName;

	/**
	 * 经纬度（经度,纬度）,逗号分隔
	 */
	@ApiField("geo")
	private String geo;

	/**
	 * 岗位详情跳转地址
	 */
	@ApiField("job_detail_url")
	private String jobDetailUrl;

	/**
	 * null
	 */
	@ApiListField("job_features")
	@ApiField("string")
	private List<String> jobFeatures;

	/**
	 * 支付宝岗位id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位类型编码
</br>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/nmowzfqvl8itkado" target="_blank">岗位类型清单</a>
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 岗位类型名称
	 */
	@ApiField("job_type_name")
	private String jobTypeName;

	/**
	 * 服务商名称（简称或全称）
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 薪资结算方式
	 */
	@ApiField("pay_period")
	private String payPeriod;

	/**
	 * 薪资范围（单位：元），最小薪资和最大薪资逗号分隔
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 岗位就业模式
	 */
	@ApiField("work_nature")
	private String workNature;

	/**
	 * 工作年限要求
	 */
	@ApiField("working_years")
	private String workingYears;

	public String getAcademicRequire() {
		return this.academicRequire;
	}
	public void setAcademicRequire(String academicRequire) {
		this.academicRequire = academicRequire;
	}

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getEmployerCertNo() {
		return this.employerCertNo;
	}
	public void setEmployerCertNo(String employerCertNo) {
		this.employerCertNo = employerCertNo;
	}

	public String getEmployerName() {
		return this.employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getGeo() {
		return this.geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
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

	public String getJobType() {
		return this.jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobTypeName() {
		return this.jobTypeName;
	}
	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
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

	public String getWorkNature() {
		return this.workNature;
	}
	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

	public String getWorkingYears() {
		return this.workingYears;
	}
	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}

}

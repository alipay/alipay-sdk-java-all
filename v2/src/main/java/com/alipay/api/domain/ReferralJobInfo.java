package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-26 16:09:45
 */
public class ReferralJobInfo extends AlipayObject {

	private static final long serialVersionUID = 2255116296926173881L;

	/**
	 * 学历要求
	 */
	@ApiField("academic_require")
	private String academicRequire;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地址名称
	 */
	@ApiField("address_name")
	private String addressName;

	/**
	 * 年龄要求
	 */
	@ApiField("age")
	private String age;

	/**
	 * 传入经纬度时返回距离，单位为米
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 传入经纬度时返回展示文案
	 */
	@ApiField("distance_display")
	private String distanceDisplay;

	/**
	 * 招聘结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 岗位经纬度，格式为经度,纬度
	 */
	@ApiField("geo")
	private String geo;

	/**
	 * 职位描述
	 */
	@ApiField("job_desc")
	private String jobDesc;

	/**
	 * 岗位ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 岗位类型
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 发薪日期
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 结算方式
	 */
	@ApiField("pay_period")
	private String payPeriod;

	/**
	 * 平台名称
	 */
	@ApiField("platform_name")
	private String platformName;

	/**
	 * 招聘人数
	 */
	@ApiField("recruitment_count")
	private Long recruitmentCount;

	/**
	 * 薪资范围，单位：元
	 */
	@ApiField("salary")
	private String salary;

	/**
	 * 薪资单位
	 */
	@ApiField("salary_unit")
	private String salaryUnit;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 工作性质
	 */
	@ApiField("work_nature")
	private String workNature;

	public String getAcademicRequire() {
		return this.academicRequire;
	}
	public void setAcademicRequire(String academicRequire) {
		this.academicRequire = academicRequire;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressName() {
		return this.addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public String getDistanceDisplay() {
		return this.distanceDisplay;
	}
	public void setDistanceDisplay(String distanceDisplay) {
		this.distanceDisplay = distanceDisplay;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getGeo() {
		return this.geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getJobDesc() {
		return this.jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
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

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayPeriod() {
		return this.payPeriod;
	}
	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}

	public String getPlatformName() {
		return this.platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public Long getRecruitmentCount() {
		return this.recruitmentCount;
	}
	public void setRecruitmentCount(Long recruitmentCount) {
		this.recruitmentCount = recruitmentCount;
	}

	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSalaryUnit() {
		return this.salaryUnit;
	}
	public void setSalaryUnit(String salaryUnit) {
		this.salaryUnit = salaryUnit;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getWorkNature() {
		return this.workNature;
	}
	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

}

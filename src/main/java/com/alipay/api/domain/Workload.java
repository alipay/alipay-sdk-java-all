package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工作量评估
 *
 * @author auto create
 * @since 1.0, 2021-08-06 20:23:20
 */
public class Workload extends AlipayObject {

	private static final long serialVersionUID = 3822125321996298352L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 岗位编码
	 */
	@ApiField("job_code")
	private String jobCode;

	/**
	 * 岗位名称
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 层级编码
	 */
	@ApiField("level_code")
	private String levelCode;

	/**
	 * 层级名称
	 */
	@ApiField("level_name")
	private String levelName;

	/**
	 * 按月专用，月数
	 */
	@ApiField("months")
	private String months;

	/**
	 * 计件专用，总件数
	 */
	@ApiField("packages")
	private String packages;

	/**
	 * 工作量（人天）
	 */
	@ApiField("person_day")
	private String personDay;

	/**
	 * 按月专用，人数
	 */
	@ApiField("persons")
	private String persons;

	/**
	 * 单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 价格类型
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 项目编码
	 */
	@ApiField("project_code")
	private String projectCode;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 办公地点编码
	 */
	@ApiField("site_code")
	private String siteCode;

	/**
	 * 地办公点名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 金额合计
	 */
	@ApiField("total_price")
	private String totalPrice;

	/**
	 * 计件专用，参考工作效率
	 */
	@ApiField("work_efficiency")
	private String workEfficiency;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getJobCode() {
		return this.jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getLevelCode() {
		return this.levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelName() {
		return this.levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getMonths() {
		return this.months;
	}
	public void setMonths(String months) {
		this.months = months;
	}

	public String getPackages() {
		return this.packages;
	}
	public void setPackages(String packages) {
		this.packages = packages;
	}

	public String getPersonDay() {
		return this.personDay;
	}
	public void setPersonDay(String personDay) {
		this.personDay = personDay;
	}

	public String getPersons() {
		return this.persons;
	}
	public void setPersons(String persons) {
		this.persons = persons;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getProjectCode() {
		return this.projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSiteCode() {
		return this.siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteName() {
		return this.siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getWorkEfficiency() {
		return this.workEfficiency;
	}
	public void setWorkEfficiency(String workEfficiency) {
		this.workEfficiency = workEfficiency;
	}

}

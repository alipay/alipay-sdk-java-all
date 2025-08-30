package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 求职意向
 *
 * @author auto create
 * @since 1.0, 2025-08-27 20:17:36
 */
public class UserIntentionInfo extends AlipayObject {

	private static final long serialVersionUID = 7896131136567943497L;

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
	 * 期望工作类型
	 */
	@ApiField("expect_job_type")
	private String expectJobType;

	/**
	 * 期望薪资最大值，单位元
	 */
	@ApiField("expect_salary_max")
	private String expectSalaryMax;

	/**
	 * 薪资最小值,单位元
	 */
	@ApiField("expect_salary_min")
	private String expectSalaryMin;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 工作性质
	 */
	@ApiField("work_nature")
	private String workNature;

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

	public String getExpectJobType() {
		return this.expectJobType;
	}
	public void setExpectJobType(String expectJobType) {
		this.expectJobType = expectJobType;
	}

	public String getExpectSalaryMax() {
		return this.expectSalaryMax;
	}
	public void setExpectSalaryMax(String expectSalaryMax) {
		this.expectSalaryMax = expectSalaryMax;
	}

	public String getExpectSalaryMin() {
		return this.expectSalaryMin;
	}
	public void setExpectSalaryMin(String expectSalaryMin) {
		this.expectSalaryMin = expectSalaryMin;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getWorkNature() {
		return this.workNature;
	}
	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

}

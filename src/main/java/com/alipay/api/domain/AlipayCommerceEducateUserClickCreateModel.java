package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 岗位点击用户信息行为
 *
 * @author auto create
 * @since 1.0, 2020-05-26 20:27:11
 */
public class AlipayCommerceEducateUserClickCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5195289558794666462L;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 点击次数
	 */
	@ApiField("click_time")
	private String clickTime;

	/**
	 * 点击兼职岗位所属公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 扩展字段
	 */
	@ApiField("features")
	private String features;

	/**
	 * 是否报名岗位
	 */
	@ApiField("is_apply_job")
	private String isApplyJob;

	/**
	 * 岗位id
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 点击兼职岗位名称
	 */
	@ApiField("parttime_job_name")
	private String parttimeJobName;

	/**
	 * 点击进入岗位详情页面平均停留时长
	 */
	@ApiField("stay_avg_time")
	private String stayAvgTime;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getClickTime() {
		return this.clickTime;
	}
	public void setClickTime(String clickTime) {
		this.clickTime = clickTime;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getFeatures() {
		return this.features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

	public String getIsApplyJob() {
		return this.isApplyJob;
	}
	public void setIsApplyJob(String isApplyJob) {
		this.isApplyJob = isApplyJob;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getParttimeJobName() {
		return this.parttimeJobName;
	}
	public void setParttimeJobName(String parttimeJobName) {
		this.parttimeJobName = parttimeJobName;
	}

	public String getStayAvgTime() {
		return this.stayAvgTime;
	}
	public void setStayAvgTime(String stayAvgTime) {
		this.stayAvgTime = stayAvgTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

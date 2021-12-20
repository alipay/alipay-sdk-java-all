package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高考智能填报信息同步
 *
 * @author auto create
 * @since 1.0, 2020-08-14 14:12:49
 */
public class AlipayCommerceEducateNceeApplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 8683483219455758267L;

	/**
	 * 批次
	 */
	@ApiField("batch")
	private String batch;

	/**
	 * 选科或选测信息
	 */
	@ApiField("course")
	private String course;

	/**
	 * 专业关注数
	 */
	@ApiField("interested_major_num")
	private Long interestedMajorNum;

	/**
	 * 院校关注数
	 */
	@ApiField("interested_school_num")
	private Long interestedSchoolNum;

	/**
	 * 是否支持一键填报
	 */
	@ApiField("one_key_support")
	private Long oneKeySupport;

	/**
	 * 省份
	 */
	@ApiField("province_code")
	private Long provinceCode;

	/**
	 * 志愿表数
	 */
	@ApiField("purpose_form_num")
	private Long purposeFormNum;

	/**
	 * 位次
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 报告数
	 */
	@ApiField("report_num")
	private Long reportNum;

	/**
	 * 高考分数
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 可选数量
	 */
	@ApiField("selected_num")
	private Long selectedNum;

	/**
	 * 科类
	 */
	@ApiField("subject")
	private Long subject;

	/**
	 * 批次总数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/**
	 * 模板类型
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 高考年份
	 */
	@ApiField("year")
	private Long year;

	public String getBatch() {
		return this.batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getCourse() {
		return this.course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public Long getInterestedMajorNum() {
		return this.interestedMajorNum;
	}
	public void setInterestedMajorNum(Long interestedMajorNum) {
		this.interestedMajorNum = interestedMajorNum;
	}

	public Long getInterestedSchoolNum() {
		return this.interestedSchoolNum;
	}
	public void setInterestedSchoolNum(Long interestedSchoolNum) {
		this.interestedSchoolNum = interestedSchoolNum;
	}

	public Long getOneKeySupport() {
		return this.oneKeySupport;
	}
	public void setOneKeySupport(Long oneKeySupport) {
		this.oneKeySupport = oneKeySupport;
	}

	public Long getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Long getPurposeFormNum() {
		return this.purposeFormNum;
	}
	public void setPurposeFormNum(Long purposeFormNum) {
		this.purposeFormNum = purposeFormNum;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Long getReportNum() {
		return this.reportNum;
	}
	public void setReportNum(Long reportNum) {
		this.reportNum = reportNum;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public Long getSelectedNum() {
		return this.selectedNum;
	}
	public void setSelectedNum(Long selectedNum) {
		this.selectedNum = selectedNum;
	}

	public Long getSubject() {
		return this.subject;
	}
	public void setSubject(Long subject) {
		this.subject = subject;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getYear() {
		return this.year;
	}
	public void setYear(Long year) {
		this.year = year;
	}

}

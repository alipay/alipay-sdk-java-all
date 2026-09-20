package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:38:55
 */
public class MedicalHmAssessmentRecord extends AlipayObject {

	private static final long serialVersionUID = 1634256431161719152L;

	/**
	 * 答案列表Json
	 */
	@ApiField("answers_json")
	private String answersJson;

	/**
	 * 评估报告 jsonarray
	 */
	@ApiField("assessment_detail")
	private String assessmentDetail;

	/**
	 * 用户测量表业务ID
	 */
	@ApiField("assessment_id")
	private String assessmentId;

	/**
	 * 分数评级
	 */
	@ApiField("assessment_level")
	private String assessmentLevel;

	/**
	 * 量表名称
	 */
	@ApiField("assessment_name")
	private String assessmentName;

	/**
	 * 用户测量记录表业务ID
	 */
	@ApiField("assessment_record_id")
	private String assessmentRecordId;

	/**
	 * 评估得分
	 */
	@ApiField("assessment_score")
	private String assessmentScore;

	/**
	 * 评估结果
	 */
	@ApiField("assessment_summary")
	private String assessmentSummary;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	public String getAnswersJson() {
		return this.answersJson;
	}
	public void setAnswersJson(String answersJson) {
		this.answersJson = answersJson;
	}

	public String getAssessmentDetail() {
		return this.assessmentDetail;
	}
	public void setAssessmentDetail(String assessmentDetail) {
		this.assessmentDetail = assessmentDetail;
	}

	public String getAssessmentId() {
		return this.assessmentId;
	}
	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public String getAssessmentLevel() {
		return this.assessmentLevel;
	}
	public void setAssessmentLevel(String assessmentLevel) {
		this.assessmentLevel = assessmentLevel;
	}

	public String getAssessmentName() {
		return this.assessmentName;
	}
	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public String getAssessmentRecordId() {
		return this.assessmentRecordId;
	}
	public void setAssessmentRecordId(String assessmentRecordId) {
		this.assessmentRecordId = assessmentRecordId;
	}

	public String getAssessmentScore() {
		return this.assessmentScore;
	}
	public void setAssessmentScore(String assessmentScore) {
		this.assessmentScore = assessmentScore;
	}

	public String getAssessmentSummary() {
		return this.assessmentSummary;
	}
	public void setAssessmentSummary(String assessmentSummary) {
		this.assessmentSummary = assessmentSummary;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}

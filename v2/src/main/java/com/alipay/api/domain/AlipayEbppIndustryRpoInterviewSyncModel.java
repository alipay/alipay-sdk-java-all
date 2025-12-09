package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商将岗位的面试结果同步支付宝就业
 *
 * @author auto create
 * @since 1.0, 2025-11-12 13:52:43
 */
public class AlipayEbppIndustryRpoInterviewSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7752582712523341489L;

	/**
	 * 候选人面试评估摘要
	 */
	@ApiField("assessment_digest")
	private String assessmentDigest;

	/**
	 * 候选人面试评估结果
	 */
	@ApiField("assessment_result")
	private String assessmentResult;

	/**
	 * 面试完成的状态
	 */
	@ApiField("completed_status")
	private String completedStatus;

	/**
	 * 候选人完成面试时间
	 */
	@ApiField("completed_time")
	private Date completedTime;

	/**
	 * 候选人面试时长，最大24小时，单位：秒
	 */
	@ApiField("interview_duration")
	private Long interviewDuration;

	/**
	 * 候选人面试场次支付宝单号
	 */
	@ApiField("interview_no")
	private String interviewNo;

	/**
	 * 候选人面试综合得分，0-100之间数值
	 */
	@ApiField("interview_score")
	private String interviewScore;

	/**
	 * 候选人面试状态
	 */
	@ApiField("interview_status")
	private String interviewStatus;

	/**
	 * 候选人面试出报告时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	/**
	 * 候选人面试报告链接url
	 */
	@ApiField("report_url")
	private String reportUrl;

	public String getAssessmentDigest() {
		return this.assessmentDigest;
	}
	public void setAssessmentDigest(String assessmentDigest) {
		this.assessmentDigest = assessmentDigest;
	}

	public String getAssessmentResult() {
		return this.assessmentResult;
	}
	public void setAssessmentResult(String assessmentResult) {
		this.assessmentResult = assessmentResult;
	}

	public String getCompletedStatus() {
		return this.completedStatus;
	}
	public void setCompletedStatus(String completedStatus) {
		this.completedStatus = completedStatus;
	}

	public Date getCompletedTime() {
		return this.completedTime;
	}
	public void setCompletedTime(Date completedTime) {
		this.completedTime = completedTime;
	}

	public Long getInterviewDuration() {
		return this.interviewDuration;
	}
	public void setInterviewDuration(Long interviewDuration) {
		this.interviewDuration = interviewDuration;
	}

	public String getInterviewNo() {
		return this.interviewNo;
	}
	public void setInterviewNo(String interviewNo) {
		this.interviewNo = interviewNo;
	}

	public String getInterviewScore() {
		return this.interviewScore;
	}
	public void setInterviewScore(String interviewScore) {
		this.interviewScore = interviewScore;
	}

	public String getInterviewStatus() {
		return this.interviewStatus;
	}
	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getReportUrl() {
		return this.reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}

}

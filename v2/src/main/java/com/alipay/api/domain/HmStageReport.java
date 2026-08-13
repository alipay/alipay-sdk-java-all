package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:10:19
 */
public class HmStageReport extends AlipayObject {

	private static final long serialVersionUID = 7849976632343184683L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 报告正文(Markdown)
	 */
	@ApiField("content_markdown")
	private String contentMarkdown;

	/**
	 * 周期结束
	 */
	@ApiField("period_end")
	private Date periodEnd;

	/**
	 * 周期序号
	 */
	@ApiField("period_index")
	private Long periodIndex;

	/**
	 * 周期开始
	 */
	@ApiField("period_start")
	private Date periodStart;

	/**
	 * 报告 ID
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 报告生成时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getContentMarkdown() {
		return this.contentMarkdown;
	}
	public void setContentMarkdown(String contentMarkdown) {
		this.contentMarkdown = contentMarkdown;
	}

	public Date getPeriodEnd() {
		return this.periodEnd;
	}
	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Long getPeriodIndex() {
		return this.periodIndex;
	}
	public void setPeriodIndex(Long periodIndex) {
		this.periodIndex = periodIndex;
	}

	public Date getPeriodStart() {
		return this.periodStart;
	}
	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}

	public String getReportId() {
		return this.reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

}

package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险报案信息实体
 *
 * @author auto create
 * @since 1.0, 2020-05-12 14:14:37
 */
public class InsClaimReport extends AlipayObject {

	private static final long serialVersionUID = 3745694149885763365L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险事故描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 案件附件列表
	 */
	@ApiListField("attachments")
	@ApiField("ins_claim_attachment")
	private List<InsClaimAttachment> attachments;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 报案类型
	 */
	@ApiField("claim_report_type")
	private String claimReportType;

	/**
	 * 赔案信息
	 */
	@ApiListField("claims")
	@ApiField("ins_claim")
	private List<InsClaim> claims;

	/**
	 * 案件进度列表
	 */
	@ApiListField("progress")
	@ApiField("ins_claim_report_progress")
	private List<InsClaimReportProgress> progress;

	/**
	 * 当status 值为不予受理:REJECTED时候返回
	 */
	@ApiField("report_reject_reason")
	private String reportRejectReason;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

	/**
	 * 报案来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 案件状态
	 */
	@ApiField("status")
	private String status;

	public String getAccidentAddress() {
		return this.accidentAddress;
	}
	public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

	public String getAccidentDesc() {
		return this.accidentDesc;
	}
	public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

	public Date getAccidentTime() {
		return this.accidentTime;
	}
	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	public List<InsClaimAttachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<InsClaimAttachment> attachments) {
		this.attachments = attachments;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getClaimReportType() {
		return this.claimReportType;
	}
	public void setClaimReportType(String claimReportType) {
		this.claimReportType = claimReportType;
	}

	public List<InsClaim> getClaims() {
		return this.claims;
	}
	public void setClaims(List<InsClaim> claims) {
		this.claims = claims;
	}

	public List<InsClaimReportProgress> getProgress() {
		return this.progress;
	}
	public void setProgress(List<InsClaimReportProgress> progress) {
		this.progress = progress;
	}

	public String getReportRejectReason() {
		return this.reportRejectReason;
	}
	public void setReportRejectReason(String reportRejectReason) {
		this.reportRejectReason = reportRejectReason;
	}

	public InsPerson getReporter() {
		return this.reporter;
	}
	public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

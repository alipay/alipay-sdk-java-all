package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class OpenapiInterviewReportItemDTO extends AlipayObject {

	private static final long serialVersionUID = 2345432486739189551L;

	/**
	 * 面试间ID
	 */
	@ApiField("ai_interview_id")
	private String aiInterviewId;

	/**
	 * 面试状态
	 */
	@ApiField("ai_interview_status")
	private String aiInterviewStatus;

	/**
	 * 面试评语
	 */
	@ApiField("report_comment")
	private String reportComment;

	/**
	 * null
	 */
	@ApiListField("report_comment_all")
	@ApiField("report_comment_detail_d_t_o")
	private List<ReportCommentDetailDTO> reportCommentAll;

	/**
	 * 百分制
	 */
	@ApiField("report_score")
	private Long reportScore;

	/**
	 * 报告链接
	 */
	@ApiField("report_url")
	private String reportUrl;

	public String getAiInterviewId() {
		return this.aiInterviewId;
	}
	public void setAiInterviewId(String aiInterviewId) {
		this.aiInterviewId = aiInterviewId;
	}

	public String getAiInterviewStatus() {
		return this.aiInterviewStatus;
	}
	public void setAiInterviewStatus(String aiInterviewStatus) {
		this.aiInterviewStatus = aiInterviewStatus;
	}

	public String getReportComment() {
		return this.reportComment;
	}
	public void setReportComment(String reportComment) {
		this.reportComment = reportComment;
	}

	public List<ReportCommentDetailDTO> getReportCommentAll() {
		return this.reportCommentAll;
	}
	public void setReportCommentAll(List<ReportCommentDetailDTO> reportCommentAll) {
		this.reportCommentAll = reportCommentAll;
	}

	public Long getReportScore() {
		return this.reportScore;
	}
	public void setReportScore(Long reportScore) {
		this.reportScore = reportScore;
	}

	public String getReportUrl() {
		return this.reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}

}

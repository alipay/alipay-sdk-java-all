package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BasicInfo;
import com.alipay.api.domain.CompetencyDetails;
import com.alipay.api.domain.ComprehensiveEvaluation;
import com.alipay.api.domain.DetectionDetail;
import com.alipay.api.domain.EliminationRuleDetailItem;
import com.alipay.api.domain.QuestionDetails;
import com.alipay.api.domain.ReportUrlItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jobinterview.interview.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class AlipayEbppJobinterviewInterviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3875892242875733146L;

	/** 
	 * 候选人基本信息
	 */
	@ApiField("basic_info")
	private BasicInfo basicInfo;

	/** 
	 * 候选人唯一 ID
	 */
	@ApiField("candidate_id")
	private String candidateId;

	/** 
	 * 胜任力评估详情
	 */
	@ApiField("competency_details")
	private CompetencyDetails competencyDetails;

	/** 
	 * 综合评估
	 */
	@ApiField("comprehensive_evaluation")
	private ComprehensiveEvaluation comprehensiveEvaluation;

	/** 
	 * 检测详情
	 */
	@ApiField("detection_detail")
	private DetectionDetail detectionDetail;

	/** 
	 * 淘汰机制明细
	 */
	@ApiField("elimination_rule_detail")
	private EliminationRuleDetailItem eliminationRuleDetail;

	/** 
	 * 供应商侧候选人唯一标识
	 */
	@ApiField("external_candidate_id")
	private String externalCandidateId;

	/** 
	 * 发起面试时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("initiate_start_time")
	private String initiateStartTime;

	/** 
	 * 面试完成作答时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("interview_end_time")
	private String interviewEndTime;

	/** 
	 * 是否通过（status=FINISHED 时返回）
	 */
	@ApiField("interview_qualified")
	private Boolean interviewQualified;

	/** 
	 * 面试开始时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("interview_start_time")
	private String interviewStartTime;

	/** 
	 * 综合评论
	 */
	@ApiField("interview_summary")
	private String interviewSummary;

	/** 
	 * 面试链接（status=IN_PROGRESS 时返回新链接，其余可能为空）
	 */
	@ApiField("interview_url")
	private String interviewUrl;

	/** 
	 * 答题环节详情
	 */
	@ApiField("question_details")
	private QuestionDetails questionDetails;

	/** 
	 * 面试报告生成时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("report_generation_time")
	private String reportGenerationTime;

	/** 
	 * 报告链接(status=COMPLETED 时返回)
	 */
	@ApiField("report_url_list")
	private ReportUrlItem reportUrlList;

	/** 
	 * 报告链接过期时间（yyyy-MM-dd HH:mm:ss，仅 FINISHED 且报告链接就绪时返回）
	 */
	@ApiField("room_expire_time")
	private String roomExpireTime;

	/** 
	 * 得分（status=FINISHED 时返回，0-100）
	 */
	@ApiField("score")
	private Long score;

	/** 
	 * 面试状态（对外 6 态：REGISTERED/OPENED/IN_PROGRESS/SUBMITTED/SCORING/FINISHED/CANCELED/NOT_CREATED）
	 */
	@ApiField("status")
	private String status;

	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public BasicInfo getBasicInfo( ) {
		return this.basicInfo;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateId( ) {
		return this.candidateId;
	}

	public void setCompetencyDetails(CompetencyDetails competencyDetails) {
		this.competencyDetails = competencyDetails;
	}
	public CompetencyDetails getCompetencyDetails( ) {
		return this.competencyDetails;
	}

	public void setComprehensiveEvaluation(ComprehensiveEvaluation comprehensiveEvaluation) {
		this.comprehensiveEvaluation = comprehensiveEvaluation;
	}
	public ComprehensiveEvaluation getComprehensiveEvaluation( ) {
		return this.comprehensiveEvaluation;
	}

	public void setDetectionDetail(DetectionDetail detectionDetail) {
		this.detectionDetail = detectionDetail;
	}
	public DetectionDetail getDetectionDetail( ) {
		return this.detectionDetail;
	}

	public void setEliminationRuleDetail(EliminationRuleDetailItem eliminationRuleDetail) {
		this.eliminationRuleDetail = eliminationRuleDetail;
	}
	public EliminationRuleDetailItem getEliminationRuleDetail( ) {
		return this.eliminationRuleDetail;
	}

	public void setExternalCandidateId(String externalCandidateId) {
		this.externalCandidateId = externalCandidateId;
	}
	public String getExternalCandidateId( ) {
		return this.externalCandidateId;
	}

	public void setInitiateStartTime(String initiateStartTime) {
		this.initiateStartTime = initiateStartTime;
	}
	public String getInitiateStartTime( ) {
		return this.initiateStartTime;
	}

	public void setInterviewEndTime(String interviewEndTime) {
		this.interviewEndTime = interviewEndTime;
	}
	public String getInterviewEndTime( ) {
		return this.interviewEndTime;
	}

	public void setInterviewQualified(Boolean interviewQualified) {
		this.interviewQualified = interviewQualified;
	}
	public Boolean getInterviewQualified( ) {
		return this.interviewQualified;
	}

	public void setInterviewStartTime(String interviewStartTime) {
		this.interviewStartTime = interviewStartTime;
	}
	public String getInterviewStartTime( ) {
		return this.interviewStartTime;
	}

	public void setInterviewSummary(String interviewSummary) {
		this.interviewSummary = interviewSummary;
	}
	public String getInterviewSummary( ) {
		return this.interviewSummary;
	}

	public void setInterviewUrl(String interviewUrl) {
		this.interviewUrl = interviewUrl;
	}
	public String getInterviewUrl( ) {
		return this.interviewUrl;
	}

	public void setQuestionDetails(QuestionDetails questionDetails) {
		this.questionDetails = questionDetails;
	}
	public QuestionDetails getQuestionDetails( ) {
		return this.questionDetails;
	}

	public void setReportGenerationTime(String reportGenerationTime) {
		this.reportGenerationTime = reportGenerationTime;
	}
	public String getReportGenerationTime( ) {
		return this.reportGenerationTime;
	}

	public void setReportUrlList(ReportUrlItem reportUrlList) {
		this.reportUrlList = reportUrlList;
	}
	public ReportUrlItem getReportUrlList( ) {
		return this.reportUrlList;
	}

	public void setRoomExpireTime(String roomExpireTime) {
		this.roomExpireTime = roomExpireTime;
	}
	public String getRoomExpireTime( ) {
		return this.roomExpireTime;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	public Long getScore( ) {
		return this.score;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

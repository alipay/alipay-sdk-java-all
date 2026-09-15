package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 答题环节详情
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class QuestionDetails extends AlipayObject {

	private static final long serialVersionUID = 8194137878376431586L;

	/**
	 * AI 点评
	 */
	@ApiField("ai_comment")
	private String aiComment;

	/**
	 * null
	 */
	@ApiListField("competency_dimensions")
	@ApiField("string")
	private List<String> competencyDimensions;

	/**
	 * 检测结果
	 */
	@ApiField("detect_result")
	private String detectResult;

	/**
	 * 淘汰规则结论：PASS / NOT_PASS / PENDING
	 */
	@ApiField("elimination_rule_result")
	private String eliminationRuleResult;

	/**
	 * null
	 */
	@ApiListField("follow_questions")
	@ApiField("follow_questions")
	private List<FollowQuestions> followQuestions;

	/**
	 * null
	 */
	@ApiListField("options")
	@ApiField("options")
	private List<Options> options;

	/**
	 * 题目序号
	 */
	@ApiField("question_no")
	private String questionNo;

	/**
	 * 题目分值
	 */
	@ApiField("question_score")
	private String questionScore;

	/**
	 * 题目标题
	 */
	@ApiField("question_title")
	private String questionTitle;

	/**
	 * 题目类型
	 */
	@ApiField("question_type")
	private String questionType;

	/**
	 * 题型编码
	 */
	@ApiField("type_code")
	private String typeCode;

	/**
	 * 候选人选择结果
	 */
	@ApiField("user_answer")
	private String userAnswer;

	/**
	 * 候选人得分（默认十分制），与题目分值（满分）同量纲，非固定百分制
	 */
	@ApiField("user_score")
	private String userScore;

	public String getAiComment() {
		return this.aiComment;
	}
	public void setAiComment(String aiComment) {
		this.aiComment = aiComment;
	}

	public List<String> getCompetencyDimensions() {
		return this.competencyDimensions;
	}
	public void setCompetencyDimensions(List<String> competencyDimensions) {
		this.competencyDimensions = competencyDimensions;
	}

	public String getDetectResult() {
		return this.detectResult;
	}
	public void setDetectResult(String detectResult) {
		this.detectResult = detectResult;
	}

	public String getEliminationRuleResult() {
		return this.eliminationRuleResult;
	}
	public void setEliminationRuleResult(String eliminationRuleResult) {
		this.eliminationRuleResult = eliminationRuleResult;
	}

	public List<FollowQuestions> getFollowQuestions() {
		return this.followQuestions;
	}
	public void setFollowQuestions(List<FollowQuestions> followQuestions) {
		this.followQuestions = followQuestions;
	}

	public List<Options> getOptions() {
		return this.options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}

	public String getQuestionNo() {
		return this.questionNo;
	}
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestionScore() {
		return this.questionScore;
	}
	public void setQuestionScore(String questionScore) {
		this.questionScore = questionScore;
	}

	public String getQuestionTitle() {
		return this.questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getQuestionType() {
		return this.questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getUserAnswer() {
		return this.userAnswer;
	}
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public String getUserScore() {
		return this.userScore;
	}
	public void setUserScore(String userScore) {
		this.userScore = userScore;
	}

}

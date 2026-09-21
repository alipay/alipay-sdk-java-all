package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 胜任力评估详情
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class CompetencyDetails extends AlipayObject {

	private static final long serialVersionUID = 5458258951248999991L;

	/**
	 * 考察维度名称
	 */
	@ApiField("competency_item")
	private String competencyItem;

	/**
	 * 等级标签
	 */
	@ApiField("competency_level_tag")
	private String competencyLevelTag;

	/**
	 * 维度总结
	 */
	@ApiField("competency_summary")
	private String competencySummary;

	/**
	 * 分值占比
	 */
	@ApiField("competency_weight")
	private String competencyWeight;

	/**
	 * 关联题目数
	 */
	@ApiField("question_count")
	private String questionCount;

	/**
	 * 维度得分（0-100）
	 */
	@ApiField("score")
	private String score;

	public String getCompetencyItem() {
		return this.competencyItem;
	}
	public void setCompetencyItem(String competencyItem) {
		this.competencyItem = competencyItem;
	}

	public String getCompetencyLevelTag() {
		return this.competencyLevelTag;
	}
	public void setCompetencyLevelTag(String competencyLevelTag) {
		this.competencyLevelTag = competencyLevelTag;
	}

	public String getCompetencySummary() {
		return this.competencySummary;
	}
	public void setCompetencySummary(String competencySummary) {
		this.competencySummary = competencySummary;
	}

	public String getCompetencyWeight() {
		return this.competencyWeight;
	}
	public void setCompetencyWeight(String competencyWeight) {
		this.competencyWeight = competencyWeight;
	}

	public String getQuestionCount() {
		return this.questionCount;
	}
	public void setQuestionCount(String questionCount) {
		this.questionCount = questionCount;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}

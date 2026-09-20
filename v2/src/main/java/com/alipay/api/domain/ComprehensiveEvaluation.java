package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 综合评估
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class ComprehensiveEvaluation extends AlipayObject {

	private static final long serialVersionUID = 3122482863766719845L;

	/**
	 * null
	 */
	@ApiListField("abnormal_tags")
	@ApiField("string")
	private List<String> abnormalTags;

	/**
	 * 否	淘汰规则整体结论：PASS / NOT_PASS / PENDING
	 */
	@ApiField("elimination_rule_result")
	private String eliminationRuleResult;

	/**
	 * 面试结果
	 */
	@ApiField("interview_result")
	private String interviewResult;

	/**
	 * AI面试总结
	 */
	@ApiField("interview_summary")
	private String interviewSummary;

	/**
	 * 推荐标签（按通过阈值与得分计算）
	 */
	@ApiField("recommend_tag")
	private String recommendTag;

	public List<String> getAbnormalTags() {
		return this.abnormalTags;
	}
	public void setAbnormalTags(List<String> abnormalTags) {
		this.abnormalTags = abnormalTags;
	}

	public String getEliminationRuleResult() {
		return this.eliminationRuleResult;
	}
	public void setEliminationRuleResult(String eliminationRuleResult) {
		this.eliminationRuleResult = eliminationRuleResult;
	}

	public String getInterviewResult() {
		return this.interviewResult;
	}
	public void setInterviewResult(String interviewResult) {
		this.interviewResult = interviewResult;
	}

	public String getInterviewSummary() {
		return this.interviewSummary;
	}
	public void setInterviewSummary(String interviewSummary) {
		this.interviewSummary = interviewSummary;
	}

	public String getRecommendTag() {
		return this.recommendTag;
	}
	public void setRecommendTag(String recommendTag) {
		this.recommendTag = recommendTag;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审核规则详情
 *
 * @author auto create
 * @since 1.0, 2022-04-13 10:45:08
 */
public class RuleInfo extends AlipayObject {

	private static final long serialVersionUID = 3276457825983126834L;

	/**
	 * 规则关注度：BLOCK（阻断）、ATTENTION（提醒）
	 */
	@ApiField("attention_level")
	private String attentionLevel;

	/**
	 * 机审反馈内容。一般当机审有误时，补充具体机审有误的说明。
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * CORRECT-机审正确；ERROR-机审有误
	 */
	@ApiField("mark_result")
	private String markResult;

	/**
	 * 风险等级（高、中、低三类）
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险提示信息
	 */
	@ApiField("risk_tips")
	private String riskTips;

	/**
	 * 规则编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 规则机审状态，机审通过/机审驳回 ROBOT_PASS/ROBOT_REVIEW_REJECT
用于	人工打标规则结果提交 接口中的status传参
	 */
	@ApiField("status")
	private String status;

	public String getAttentionLevel() {
		return this.attentionLevel;
	}
	public void setAttentionLevel(String attentionLevel) {
		this.attentionLevel = attentionLevel;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMarkResult() {
		return this.markResult;
	}
	public void setMarkResult(String markResult) {
		this.markResult = markResult;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskTips() {
		return this.riskTips;
	}
	public void setRiskTips(String riskTips) {
		this.riskTips = riskTips;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

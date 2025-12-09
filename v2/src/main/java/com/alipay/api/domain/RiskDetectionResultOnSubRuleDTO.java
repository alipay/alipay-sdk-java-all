package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 【风险检测规则-风险判定子规则级别】的检测结果DTO
 *
 * @author auto create
 * @since 1.0, 2024-12-05 15:37:21
 */
public class RiskDetectionResultOnSubRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 4523345418727453977L;

	/**
	 * 检测结果说明
	 */
	@ApiField("detection_result_memo")
	private String detectionResultMemo;

	/**
	 * 是否阻断
	 */
	@ApiField("need_break")
	private Boolean needBreak;

	/**
	 * 风险判定子规则ID
	 */
	@ApiField("risk_judge_sub_rule_id")
	private String riskJudgeSubRuleId;

	/**
	 * 风险判定子规则名称
	 */
	@ApiField("risk_judge_sub_rule_name")
	private String riskJudgeSubRuleName;

	/**
	 * 风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险规则ID
	 */
	@ApiField("risk_rule_id")
	private String riskRuleId;

	/**
	 * 风险判定子规则内容
	 */
	@ApiField("sub_rule_content")
	private String subRuleContent;

	/**
	 * 风险判定子规则是否匹配成功
	 */
	@ApiField("sub_rule_match_sucess")
	private Boolean subRuleMatchSucess;

	public String getDetectionResultMemo() {
		return this.detectionResultMemo;
	}
	public void setDetectionResultMemo(String detectionResultMemo) {
		this.detectionResultMemo = detectionResultMemo;
	}

	public Boolean getNeedBreak() {
		return this.needBreak;
	}
	public void setNeedBreak(Boolean needBreak) {
		this.needBreak = needBreak;
	}

	public String getRiskJudgeSubRuleId() {
		return this.riskJudgeSubRuleId;
	}
	public void setRiskJudgeSubRuleId(String riskJudgeSubRuleId) {
		this.riskJudgeSubRuleId = riskJudgeSubRuleId;
	}

	public String getRiskJudgeSubRuleName() {
		return this.riskJudgeSubRuleName;
	}
	public void setRiskJudgeSubRuleName(String riskJudgeSubRuleName) {
		this.riskJudgeSubRuleName = riskJudgeSubRuleName;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskRuleId() {
		return this.riskRuleId;
	}
	public void setRiskRuleId(String riskRuleId) {
		this.riskRuleId = riskRuleId;
	}

	public String getSubRuleContent() {
		return this.subRuleContent;
	}
	public void setSubRuleContent(String subRuleContent) {
		this.subRuleContent = subRuleContent;
	}

	public Boolean getSubRuleMatchSucess() {
		return this.subRuleMatchSucess;
	}
	public void setSubRuleMatchSucess(Boolean subRuleMatchSucess) {
		this.subRuleMatchSucess = subRuleMatchSucess;
	}

}

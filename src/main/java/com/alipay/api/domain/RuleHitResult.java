package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 规则匹配信息
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:34:53
 */
public class RuleHitResult extends AlipayObject {

	private static final long serialVersionUID = 1198784175245235981L;

	/**
	 * 命中的句子 详情
	 */
	@ApiListField("hit_dialogues")
	@ApiField("hit_dialogue")
	private List<HitDialogue> hitDialogues;

	/**
	 * 规则命中提示
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 解语花规则配置的风险等级 高中低
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 规则编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	public List<HitDialogue> getHitDialogues() {
		return this.hitDialogues;
	}
	public void setHitDialogues(List<HitDialogue> hitDialogues) {
		this.hitDialogues = hitDialogues;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

}

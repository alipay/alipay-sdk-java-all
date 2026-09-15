package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘汰机制明细
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class EliminationRuleDetailItem extends AlipayObject {

	private static final long serialVersionUID = 1788268242382258483L;

	/**
	 * 业务标识(能力环节=题目ID,检测环节=检测项编码,收集环节=字段编码)
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 检测指标编码(仅检测环节有值)
	 */
	@ApiField("check_metric")
	private String checkMetric;

	/**
	 * 规则描述(用于报告展示淘汰原因)
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 淘汰规则唯一标识
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 一票否决淘汰结论，非平台侧异常编码
	 */
	@ApiField("rule_qualified")
	private String ruleQualified;

	/**
	 * 环节名称
	 */
	@ApiField("stage_name")
	private String stageName;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCheckMetric() {
		return this.checkMetric;
	}
	public void setCheckMetric(String checkMetric) {
		this.checkMetric = checkMetric;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleQualified() {
		return this.ruleQualified;
	}
	public void setRuleQualified(String ruleQualified) {
		this.ruleQualified = ruleQualified;
	}

	public String getStageName() {
		return this.stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

}

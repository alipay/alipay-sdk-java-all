package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RiskRuleResultDTO
 *
 * @author auto create
 * @since 1.0, 2023-07-27 09:40:09
 */
public class RiskRuleResultDTO extends AlipayObject {

	private static final long serialVersionUID = 7582375491412473474L;

	/**
	 * 风险事项详情+非唯一
	 */
	@ApiField("risk_event")
	private String riskEvent;

	/**
	 * 风险等级+非唯一+MEDIUM+LOW+NONE
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险提示+非唯一
	 */
	@ApiField("risk_note")
	private String riskNote;

	/**
	 * 风险分数+非唯一
	 */
	@ApiField("risk_score")
	private Long riskScore;

	/**
	 * 执行的规则的来源+非唯一+ANT_TREE
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getRiskEvent() {
		return this.riskEvent;
	}
	public void setRiskEvent(String riskEvent) {
		this.riskEvent = riskEvent;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskNote() {
		return this.riskNote;
	}
	public void setRiskNote(String riskNote) {
		this.riskNote = riskNote;
	}

	public Long getRiskScore() {
		return this.riskScore;
	}
	public void setRiskScore(Long riskScore) {
		this.riskScore = riskScore;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}

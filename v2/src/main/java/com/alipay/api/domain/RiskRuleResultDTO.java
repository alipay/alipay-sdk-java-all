package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险项内的风险规则计算结果
 *
 * @author auto create
 * @since 1.0, 2023-07-31 11:16:20
 */
public class RiskRuleResultDTO extends AlipayObject {

	private static final long serialVersionUID = 4633154943286287175L;

	/**
	 * 参数名：风险评估的业务详细信息
是否唯一：不唯一
应用场景：业务返回风险为包含复杂结果
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("risk_evaluation_detail")
	private String riskEvaluationDetail;

	/**
	 * 参数名：风险事项详情
是否唯一：不唯一
应用场景：描述风险规则对应的风险事项详情
枚举值：[{"value": "ANT_TREE","name": "规则来源于蚁树"},{"value": "UCRISKCORE","name": "规则来源于天燕"}]
如何获取：不相关
特务说明：无
	 */
	@ApiField("risk_event")
	private String riskEvent;

	/**
	 * 参数名：风险等级
是否唯一：不唯一
应用场景：风险等级用于判断风险严重程度
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 参数名：风险提示
是否唯一：不唯一
应用场景：当前风险规则给到用户的风险提示
枚举值：[{"value": "ANT_TREE","name": "规则来源于蚁树"},{"value": "UCRISKCORE","name": "规则来源于天燕"}]
如何获取：不相关
特务说明：无
	 */
	@ApiField("risk_note")
	private String riskNote;

	/**
	 * 参数名：风险规则的风险分数
是否唯一：不唯一
应用场景：用于判断风险严重程度
枚举值：无
如何获取：不相关
特务说明：无
	 */
	@ApiField("risk_score")
	private Long riskScore;

	/**
	 * 参数名：执行的规则的来源
是否唯一：不唯一
应用场景：标明执行风险规则的风险结果数据来源
枚举值：[{"value": "ANT_TREE","name": "规则来源于蚁树"},{"value": "UCRISKCORE","name": "规则来源于天燕"}]
如何获取：不相关
特务说明：无
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getRiskEvaluationDetail() {
		return this.riskEvaluationDetail;
	}
	public void setRiskEvaluationDetail(String riskEvaluationDetail) {
		this.riskEvaluationDetail = riskEvaluationDetail;
	}

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

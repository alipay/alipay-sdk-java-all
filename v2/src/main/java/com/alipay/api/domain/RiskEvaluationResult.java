package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险评估结果信息
 *
 * @author auto create
 * @since 1.0, 2023-07-28 19:05:35
 */
public class RiskEvaluationResult extends AlipayObject {

	private static final long serialVersionUID = 6112511129632947723L;

	/**
	 * 风险实例id+唯一
	 */
	@ApiField("risk_instance_id")
	private String riskInstanceId;

	/**
	 * 风险评估的风险等级+非唯一+MEDIUM
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 评估的风险规则明细+非唯一
	 */
	@ApiListField("risk_rule_result_list")
	@ApiField("risk_rule_result_d_t_o")
	private List<RiskRuleResultDTO> riskRuleResultList;

	public String getRiskInstanceId() {
		return this.riskInstanceId;
	}
	public void setRiskInstanceId(String riskInstanceId) {
		this.riskInstanceId = riskInstanceId;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public List<RiskRuleResultDTO> getRiskRuleResultList() {
		return this.riskRuleResultList;
	}
	public void setRiskRuleResultList(List<RiskRuleResultDTO> riskRuleResultList) {
		this.riskRuleResultList = riskRuleResultList;
	}

}

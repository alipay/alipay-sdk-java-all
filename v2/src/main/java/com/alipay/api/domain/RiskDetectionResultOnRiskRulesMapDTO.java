package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险检测结果MapDTO
 *
 * @author auto create
 * @since 1.0, 2024-12-05 15:37:21
 */
public class RiskDetectionResultOnRiskRulesMapDTO extends AlipayObject {

	private static final long serialVersionUID = 2442118363231328177L;

	/**
	 * 风险检测规则业务分组key
	 */
	@ApiField("group_key")
	private String groupKey;

	/**
	 * 风险检测规则级别的检测结果列表
	 */
	@ApiListField("risk_detection_result_on_rule_dto_list")
	@ApiField("risk_detection_result_on_rule_d_t_o")
	private List<RiskDetectionResultOnRuleDTO> riskDetectionResultOnRuleDtoList;

	public String getGroupKey() {
		return this.groupKey;
	}
	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public List<RiskDetectionResultOnRuleDTO> getRiskDetectionResultOnRuleDtoList() {
		return this.riskDetectionResultOnRuleDtoList;
	}
	public void setRiskDetectionResultOnRuleDtoList(List<RiskDetectionResultOnRuleDTO> riskDetectionResultOnRuleDtoList) {
		this.riskDetectionResultOnRuleDtoList = riskDetectionResultOnRuleDtoList;
	}

}

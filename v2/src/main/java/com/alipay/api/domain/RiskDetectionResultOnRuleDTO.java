package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 【风险检测规则】级别的检测结果DTO
 *
 * @author auto create
 * @since 1.0, 2024-12-05 15:37:21
 */
public class RiskDetectionResultOnRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 6782226283915688954L;

	/**
	 * 检测模型
	 */
	@ApiField("detection_model")
	private String detectionModel;

	/**
	 * 是否阻断
	 */
	@ApiField("need_break")
	private Boolean needBreak;

	/**
	 * 子规则检测结果列表
	 */
	@ApiListField("risk_detection_result_on_sub_rule_dto_list")
	@ApiField("risk_detection_result_on_sub_rule_d_t_o")
	private List<RiskDetectionResultOnSubRuleDTO> riskDetectionResultOnSubRuleDtoList;

	/**
	 * 风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险点code
	 */
	@ApiField("risk_point_code")
	private String riskPointCode;

	/**
	 * 风险规则ID
	 */
	@ApiField("risk_rule_id")
	private String riskRuleId;

	/**
	 * 风险规则名称
	 */
	@ApiField("risk_rule_name")
	private String riskRuleName;

	public String getDetectionModel() {
		return this.detectionModel;
	}
	public void setDetectionModel(String detectionModel) {
		this.detectionModel = detectionModel;
	}

	public Boolean getNeedBreak() {
		return this.needBreak;
	}
	public void setNeedBreak(Boolean needBreak) {
		this.needBreak = needBreak;
	}

	public List<RiskDetectionResultOnSubRuleDTO> getRiskDetectionResultOnSubRuleDtoList() {
		return this.riskDetectionResultOnSubRuleDtoList;
	}
	public void setRiskDetectionResultOnSubRuleDtoList(List<RiskDetectionResultOnSubRuleDTO> riskDetectionResultOnSubRuleDtoList) {
		this.riskDetectionResultOnSubRuleDtoList = riskDetectionResultOnSubRuleDtoList;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskPointCode() {
		return this.riskPointCode;
	}
	public void setRiskPointCode(String riskPointCode) {
		this.riskPointCode = riskPointCode;
	}

	public String getRiskRuleId() {
		return this.riskRuleId;
	}
	public void setRiskRuleId(String riskRuleId) {
		this.riskRuleId = riskRuleId;
	}

	public String getRiskRuleName() {
		return this.riskRuleName;
	}
	public void setRiskRuleName(String riskRuleName) {
		this.riskRuleName = riskRuleName;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 风险点级别的风险检测结果DTO
 *
 * @author auto create
 * @since 1.0, 2024-12-05 15:37:21
 */
public class RiskDetectionResultOnRiskPointOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 8899215434987424227L;

	/**
	 * 本风险点下，该业务单据后续流程是否需要阻断：true/false
	 */
	@ApiField("need_break")
	private Boolean needBreak;

	/**
	 * 风险检测结果Map列表
	 */
	@ApiListField("risk_detection_result_on_risk_rules_map_dto_list")
	@ApiField("risk_detection_result_on_risk_rules_map_d_t_o")
	private List<RiskDetectionResultOnRiskRulesMapDTO> riskDetectionResultOnRiskRulesMapDtoList;

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

	public Boolean getNeedBreak() {
		return this.needBreak;
	}
	public void setNeedBreak(Boolean needBreak) {
		this.needBreak = needBreak;
	}

	public List<RiskDetectionResultOnRiskRulesMapDTO> getRiskDetectionResultOnRiskRulesMapDtoList() {
		return this.riskDetectionResultOnRiskRulesMapDtoList;
	}
	public void setRiskDetectionResultOnRiskRulesMapDtoList(List<RiskDetectionResultOnRiskRulesMapDTO> riskDetectionResultOnRiskRulesMapDtoList) {
		this.riskDetectionResultOnRiskRulesMapDtoList = riskDetectionResultOnRiskRulesMapDtoList;
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

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货评估结果
 *
 * @author auto create
 * @since 1.0, 2026-10-26 09:37:55
 */
public class ShipAssessmentResultVO extends AlipayObject {

	private static final long serialVersionUID = 2266963877223591131L;

	/**
	 * 错误原因，当发货评估结果为null时返回
	 */
	@ApiField("error_reason")
	private String errorReason;

	/**
	 * 发货建议 true-建议发货，false-不建议发货 当前字段已废弃(字段名称需要修改，将之前的字段废弃)
	 */
	@ApiField("ship_advice")
	@Deprecated
	private Boolean shipAdvice;

	/**
	 * 发货评估风险等级
	 */
	@ApiField("ship_assessment_results_level")
	private String shipAssessmentResultsLevel;

	/**
	 * 发货评估综合风险等级
	 */
	@ApiField("ship_comprehensive_risk_level")
	private String shipComprehensiveRiskLevel;

	/**
	 * 是否为优质订单 true-优质订单 false-非优质订单
	 */
	@ApiField("ship_quality_flag")
	private Boolean shipQualityFlag;

	/**
	 * 专项风险
	 */
	@ApiField("vertical_risk")
	private ShipVerticalRiskVO verticalRisk;

	public String getErrorReason() {
		return this.errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public Boolean getShipAdvice() {
		return this.shipAdvice;
	}
	public void setShipAdvice(Boolean shipAdvice) {
		this.shipAdvice = shipAdvice;
	}

	public String getShipAssessmentResultsLevel() {
		return this.shipAssessmentResultsLevel;
	}
	public void setShipAssessmentResultsLevel(String shipAssessmentResultsLevel) {
		this.shipAssessmentResultsLevel = shipAssessmentResultsLevel;
	}

	public String getShipComprehensiveRiskLevel() {
		return this.shipComprehensiveRiskLevel;
	}
	public void setShipComprehensiveRiskLevel(String shipComprehensiveRiskLevel) {
		this.shipComprehensiveRiskLevel = shipComprehensiveRiskLevel;
	}

	public Boolean getShipQualityFlag() {
		return this.shipQualityFlag;
	}
	public void setShipQualityFlag(Boolean shipQualityFlag) {
		this.shipQualityFlag = shipQualityFlag;
	}

	public ShipVerticalRiskVO getVerticalRisk() {
		return this.verticalRisk;
	}
	public void setVerticalRisk(ShipVerticalRiskVO verticalRisk) {
		this.verticalRisk = verticalRisk;
	}

}

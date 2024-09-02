package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁的机器审核信息，按照初筛、下单区分阶段
 *
 * @author auto create
 * @since 1.0, 2024-06-06 12:00:01
 */
public class AutoRentPhaseRiskDetail extends AlipayObject {

	private static final long serialVersionUID = 6272465322452256774L;

	/**
	 * 多个风控厂商的风控结果详情
	 */
	@ApiListField("auto_rent_single_risk_details")
	@ApiField("auto_rent_single_risk_detail")
	private List<AutoRentSingleRiskDetail> autoRentSingleRiskDetails;

	/**
	 * 当前风控的阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 当前自动审核的汇总风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public List<AutoRentSingleRiskDetail> getAutoRentSingleRiskDetails() {
		return this.autoRentSingleRiskDetails;
	}
	public void setAutoRentSingleRiskDetails(List<AutoRentSingleRiskDetail> autoRentSingleRiskDetails) {
		this.autoRentSingleRiskDetails = autoRentSingleRiskDetails;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

}

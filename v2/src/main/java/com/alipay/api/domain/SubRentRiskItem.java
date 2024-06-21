package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子风险项结果
 *
 * @author auto create
 * @since 1.0, 2024-04-01 15:29:03
 */
public class SubRentRiskItem extends AlipayObject {

	private static final long serialVersionUID = 3169469853649929975L;

	/**
	 * 风险描述
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/**
	 * 风险等级
	 */
	@ApiField("risk_name")
	private String riskName;

	/**
	 * 极低风险
	 */
	@ApiField("risk_rank")
	private String riskRank;

	public String getRiskDesc() {
		return this.riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	public String getRiskName() {
		return this.riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getRiskRank() {
		return this.riskRank;
	}
	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}

}

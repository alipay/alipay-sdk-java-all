package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单风控信息
 *
 * @author auto create
 * @since 1.0, 2025-04-18 17:40:56
 */
public class RentRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 1143891827539879374L;

	/**
	 * 风控结果
	 */
	@ApiField("risk_result")
	private String riskResult;

	/**
	 * 风控结果描述
	 */
	@ApiField("risk_result_desc")
	private String riskResultDesc;

	/**
	 * 风控场景
	 */
	@ApiField("risk_sense")
	private String riskSense;

	public String getRiskResult() {
		return this.riskResult;
	}
	public void setRiskResult(String riskResult) {
		this.riskResult = riskResult;
	}

	public String getRiskResultDesc() {
		return this.riskResultDesc;
	}
	public void setRiskResultDesc(String riskResultDesc) {
		this.riskResultDesc = riskResultDesc;
	}

	public String getRiskSense() {
		return this.riskSense;
	}
	public void setRiskSense(String riskSense) {
		this.riskSense = riskSense;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个风控厂商提供的风控结果
 *
 * @author auto create
 * @since 1.0, 2024-07-05 12:04:51
 */
public class AutoRentSingleRiskDetail extends AlipayObject {

	private static final long serialVersionUID = 6293377523958668317L;

	/**
	 * 综合风险的描述
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/**
	 * 风控等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险分
	 */
	@ApiField("risk_score")
	private String riskScore;

	/**
	 * 提供风控服务的厂商。填写对应厂商的中文名
	 */
	@ApiField("source")
	private String source;

	public String getRiskDesc() {
		return this.riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskScore() {
		return this.riskScore;
	}
	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}

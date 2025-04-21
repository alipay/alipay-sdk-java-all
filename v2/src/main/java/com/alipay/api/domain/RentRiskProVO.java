package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Boolean类型结果，true-命中高风险 false-未命中高风险
 *
 * @author auto create
 * @since 1.0, 2025-04-21 20:07:27
 */
public class RentRiskProVO extends AlipayObject {

	private static final long serialVersionUID = 6627855183748874546L;

	/**
	 * 描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 风险级别
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险级别数据类型
	 */
	@ApiField("risk_level_type")
	private String riskLevelType;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskLevelType() {
		return this.riskLevelType;
	}
	public void setRiskLevelType(String riskLevelType) {
		this.riskLevelType = riskLevelType;
	}

}

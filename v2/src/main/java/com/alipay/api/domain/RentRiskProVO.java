package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Tn_Level类型结果，risk_level字段取值范围T1-T10（T1 ~ T4: 低风险；T5 ~ T6: 中风险；T7 ~ T8: 高风险；T9 ~ T10: 极高风险）
 *
 * @author auto create
 * @since 1.0, 2025-11-04 14:28:38
 */
public class RentRiskProVO extends AlipayObject {

	private static final long serialVersionUID = 4411112557728979874L;

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

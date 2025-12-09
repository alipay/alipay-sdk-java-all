package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智安盾-租赁风险项模型
 *
 * @author auto create
 * @since 1.0, 2025-09-29 17:09:02
 */
public class RiskItemVO extends AlipayObject {

	private static final long serialVersionUID = 8366946386468347783L;

	/**
	 * 命中的风险详细信息 当前字段已废弃(字段删除，后续不再透出)
	 */
	@ApiField("hit_detail")
	@Deprecated
	private String hitDetail;

	/**
	 * 风险编码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 【订单维度共租风险】nor-无共租行为, low-低风险, mid-中风险, high-高风险, sup-超高风险；
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public String getHitDetail() {
		return this.hitDetail;
	}
	public void setHitDetail(String hitDetail) {
		this.hitDetail = hitDetail;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

}

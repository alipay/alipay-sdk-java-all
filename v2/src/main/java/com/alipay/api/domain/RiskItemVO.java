package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-21 16:32:25
 */
public class RiskItemVO extends AlipayObject {

	private static final long serialVersionUID = 6832216974514126923L;

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
	 * 【订单维度共租风险】low / mid / high；
【小程序维度共租风险:】P1 ~ P6，数字越大风险越高；
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

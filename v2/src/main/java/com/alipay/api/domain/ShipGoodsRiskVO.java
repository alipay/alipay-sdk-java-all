package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-05 16:57:41
 */
public class ShipGoodsRiskVO extends AlipayObject {

	private static final long serialVersionUID = 3492964538775525387L;

	/**
	 * true-建议发货
false-不建议发货
	 */
	@ApiField("can_ship_flag")
	private Boolean canShipFlag;

	/**
	 * 发货建议类型,枚举值
	 */
	@ApiField("risk_code")
	private String riskCode;

	public Boolean getCanShipFlag() {
		return this.canShipFlag;
	}
	public void setCanShipFlag(Boolean canShipFlag) {
		this.canShipFlag = canShipFlag;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

}

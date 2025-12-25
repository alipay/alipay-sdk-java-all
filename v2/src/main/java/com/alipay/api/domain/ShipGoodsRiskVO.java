package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-09 20:37:41
 */
public class ShipGoodsRiskVO extends AlipayObject {

	private static final long serialVersionUID = 7846396413126114773L;

	/**
	 * true-建议发货
false-建议根据用户其他风险情况进行综合评估
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

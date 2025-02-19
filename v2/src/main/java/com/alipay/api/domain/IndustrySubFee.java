package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合支付收费明细
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustrySubFee extends AlipayObject {

	private static final long serialVersionUID = 8819424445968319325L;

	/**
	 * 实收费用。单位：元。
	 */
	@ApiField("charge_fee")
	private String chargeFee;

	/**
	 * 原始费用。单位：元。
	 */
	@ApiField("original_charge_fee")
	private String originalChargeFee;

	/**
	 * 签约费率
	 */
	@ApiField("switch_fee_rate")
	private String switchFeeRate;

	public String getChargeFee() {
		return this.chargeFee;
	}
	public void setChargeFee(String chargeFee) {
		this.chargeFee = chargeFee;
	}

	public String getOriginalChargeFee() {
		return this.originalChargeFee;
	}
	public void setOriginalChargeFee(String originalChargeFee) {
		this.originalChargeFee = originalChargeFee;
	}

	public String getSwitchFeeRate() {
		return this.switchFeeRate;
	}
	public void setSwitchFeeRate(String switchFeeRate) {
		this.switchFeeRate = switchFeeRate;
	}

}

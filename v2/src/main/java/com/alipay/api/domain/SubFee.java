package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分渠道计费信息
 *
 * @author auto create
 * @since 1.0, 2023-05-29 22:41:37
 */
public class SubFee extends AlipayObject {

	private static final long serialVersionUID = 3593918485998852492L;

	/**
	 * 实收费用
	 */
	@ApiField("charge_fee")
	private String chargeFee;

	/**
	 * 原始费用
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

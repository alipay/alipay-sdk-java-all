package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分渠道退费信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 17:44:47
 */
public class RefundSubFee extends AlipayObject {

	private static final long serialVersionUID = 1321161789447191816L;

	/**
	 * 实退费用
	 */
	@ApiField("refund_charge_fee")
	private String refundChargeFee;

	/**
	 * 签约费率
	 */
	@ApiField("switch_fee_rate")
	private String switchFeeRate;

	public String getRefundChargeFee() {
		return this.refundChargeFee;
	}
	public void setRefundChargeFee(String refundChargeFee) {
		this.refundChargeFee = refundChargeFee;
	}

	public String getSwitchFeeRate() {
		return this.switchFeeRate;
	}
	public void setSwitchFeeRate(String switchFeeRate) {
		this.switchFeeRate = switchFeeRate;
	}

}

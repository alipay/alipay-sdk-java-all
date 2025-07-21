package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券预充值参数
 *
 * @author auto create
 * @since 1.0, 2023-06-29 12:20:45
 */
public class PaymentVoucherRechargeInfo extends AlipayObject {

	private static final long serialVersionUID = 3841323265842271266L;

	/**
	 * "余额预充值详情 限制: 1、recharge_type为ALIPAY_BALANCE时必传"
	 */
	@ApiField("alipay_balance_recharge_info")
	private PaymentVoucherAlipayBalanceRechargeInfo alipayBalanceRechargeInfo;

	/**
	 * 预充值方式
	 */
	@ApiField("recharge_type")
	private String rechargeType;

	public PaymentVoucherAlipayBalanceRechargeInfo getAlipayBalanceRechargeInfo() {
		return this.alipayBalanceRechargeInfo;
	}
	public void setAlipayBalanceRechargeInfo(PaymentVoucherAlipayBalanceRechargeInfo alipayBalanceRechargeInfo) {
		this.alipayBalanceRechargeInfo = alipayBalanceRechargeInfo;
	}

	public String getRechargeType() {
		return this.rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}

}

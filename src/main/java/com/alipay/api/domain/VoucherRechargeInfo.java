package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值详情
 *
 * @author auto create
 * @since 1.0, 2022-07-28 14:17:16
 */
public class VoucherRechargeInfo extends AlipayObject {

	private static final long serialVersionUID = 1341475415877865657L;

	/**
	 * 预充值方式。 
枚举值:
ALIPAY_BALANCE 支付宝余额预充值
	 */
	@ApiField("recharge_type")
	private String rechargeType;

	/**
	 * 余额预充值详情 
限制: 
recharge_type为ALIPAY_BALANCE时必传
	 */
	@ApiField("voucher_balance_recharge_info")
	private VoucherBalanceRechargeInfo voucherBalanceRechargeInfo;

	public String getRechargeType() {
		return this.rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}

	public VoucherBalanceRechargeInfo getVoucherBalanceRechargeInfo() {
		return this.voucherBalanceRechargeInfo;
	}
	public void setVoucherBalanceRechargeInfo(VoucherBalanceRechargeInfo voucherBalanceRechargeInfo) {
		this.voucherBalanceRechargeInfo = voucherBalanceRechargeInfo;
	}

}

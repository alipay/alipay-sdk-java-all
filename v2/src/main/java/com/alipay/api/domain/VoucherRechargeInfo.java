package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值详情
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:33
 */
public class VoucherRechargeInfo extends AlipayObject {

	private static final long serialVersionUID = 3832868218124322577L;

	/**
	 * 预充值方式。
	 */
	@ApiField("recharge_type")
	private String rechargeType;

	/**
	 * "余额预充值详情 限制: recharge_type为ALIPAY_BALANCE时必传"
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

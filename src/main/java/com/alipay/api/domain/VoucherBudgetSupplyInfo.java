package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金信息
 *
 * @author auto create
 * @since 1.0, 2022-07-28 14:17:16
 */
public class VoucherBudgetSupplyInfo extends AlipayObject {

	private static final long serialVersionUID = 7316795822859124368L;

	/**
	 * 营销资金预算类型 
枚举值: 
NO_CASH 免充值 
RECHARGE 预充值 

1、免充值：制券方无需提前充值资金，用户核销支付券时，直接从订单原价中扣除优惠减价金额，最终只将用户实际支付的金额结算给核销商户，商户实收少于订单原价。 
2.预充值: 制券方需将优惠预算提前充值到支付宝指定营销账户中，用户核销支付券时，系统从该账户可用余额中扣除优惠减价部分对应的资金，连同用户实际支付的资金，一并结算给核销商户，不影响实收。
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 预充值详情 
限制:
budget_type为RECAHRGE时必传
	 */
	@ApiField("voucher_recharge_info")
	private VoucherRechargeInfo voucherRechargeInfo;

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public VoucherRechargeInfo getVoucherRechargeInfo() {
		return this.voucherRechargeInfo;
	}
	public void setVoucherRechargeInfo(VoucherRechargeInfo voucherRechargeInfo) {
		this.voucherRechargeInfo = voucherRechargeInfo;
	}

}

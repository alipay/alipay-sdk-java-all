package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学场景境外行手续费结构体
 *
 * @author auto create
 * @since 1.0, 2026-07-03 14:17:25
 */
public class BankChargeDTO extends AlipayObject {

	private static final long serialVersionUID = 1717393315199445861L;

	/**
	 * 境外手续费金额（外币计价）
	 */
	@ApiField("bank_feecharge_amount")
	private TuitionMoneyDTO bankFeechargeAmount;

	/**
	 * 用户是否可自主选择是否承担境外手续费
	 */
	@ApiField("bank_feecharge_selectable")
	private Boolean bankFeechargeSelectable;

	/**
	 * 该账号是否有境外手续费
	 */
	@ApiField("bank_feecharge_type")
	private Boolean bankFeechargeType;

	public TuitionMoneyDTO getBankFeechargeAmount() {
		return this.bankFeechargeAmount;
	}
	public void setBankFeechargeAmount(TuitionMoneyDTO bankFeechargeAmount) {
		this.bankFeechargeAmount = bankFeechargeAmount;
	}

	public Boolean getBankFeechargeSelectable() {
		return this.bankFeechargeSelectable;
	}
	public void setBankFeechargeSelectable(Boolean bankFeechargeSelectable) {
		this.bankFeechargeSelectable = bankFeechargeSelectable;
	}

	public Boolean getBankFeechargeType() {
		return this.bankFeechargeType;
	}
	public void setBankFeechargeType(Boolean bankFeechargeType) {
		this.bankFeechargeType = bankFeechargeType;
	}

}

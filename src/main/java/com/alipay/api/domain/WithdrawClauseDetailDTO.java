package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现条款模型
 *
 * @author auto create
 * @since 1.0, 2022-01-05 15:28:44
 */
public class WithdrawClauseDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 7821951517665898626L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 资产主体对象
	 */
	@ApiField("trans_out_principal")
	private WitnessPrincipalDTO transOutPrincipal;

	/**
	 * 提现主体
	 */
	@ApiField("withdraw_principal")
	private WithdrawPrincipalDTO withdrawPrincipal;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public WitnessPrincipalDTO getTransOutPrincipal() {
		return this.transOutPrincipal;
	}
	public void setTransOutPrincipal(WitnessPrincipalDTO transOutPrincipal) {
		this.transOutPrincipal = transOutPrincipal;
	}

	public WithdrawPrincipalDTO getWithdrawPrincipal() {
		return this.withdrawPrincipal;
	}
	public void setWithdrawPrincipal(WithdrawPrincipalDTO withdrawPrincipal) {
		this.withdrawPrincipal = withdrawPrincipal;
	}

}

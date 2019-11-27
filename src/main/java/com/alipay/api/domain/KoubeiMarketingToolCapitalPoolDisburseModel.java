package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖金池充值接口
 *
 * @author auto create
 * @since 1.0, 2017-06-09 03:01:02
 */
public class KoubeiMarketingToolCapitalPoolDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 7291872968999617913L;

	/**
	 * 充值支付宝账号
	 */
	@ApiField("debit_account")
	private String debitAccount;

	/**
	 * 奖金池ID
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 充值金额
	 */
	@ApiField("recharge_amount")
	private String rechargeAmount;

	public String getDebitAccount() {
		return this.debitAccount;
	}
	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getRechargeAmount() {
		return this.rechargeAmount;
	}
	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

}

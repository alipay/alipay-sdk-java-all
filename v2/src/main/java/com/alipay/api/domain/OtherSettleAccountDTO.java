package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 其余分账账户信息
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:44
 */
public class OtherSettleAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 1311333611423438994L;

	/**
	 * 真实姓名
	 */
	@ApiField("payee_real_name")
	private String payeeRealName;

	/**
	 * 该账户需分账的比例（百分比）
	 */
	@ApiField("separate_ledger_rate")
	private String separateLedgerRate;

	/**
	 * 需填入支付宝登陆账户
	 */
	@ApiField("settle_account")
	private String settleAccount;

	public String getPayeeRealName() {
		return this.payeeRealName;
	}
	public void setPayeeRealName(String payeeRealName) {
		this.payeeRealName = payeeRealName;
	}

	public String getSeparateLedgerRate() {
		return this.separateLedgerRate;
	}
	public void setSeparateLedgerRate(String separateLedgerRate) {
		this.separateLedgerRate = separateLedgerRate;
	}

	public String getSettleAccount() {
		return this.settleAccount;
	}
	public void setSettleAccount(String settleAccount) {
		this.settleAccount = settleAccount;
	}

}

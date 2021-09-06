package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额冻结结果openApi 数据传输对象
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:06
 */
public class SubAccountBalanceFreezeResultOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 1736841461917359138L;

	/**
	 * 冻结号(实际通过outBizNo作为冻结号)
	 */
	@ApiField("freeze_no")
	private String freezeNo;

	/**
	 * 本次冻结金额
	 */
	@ApiField("freeze_success_amount")
	private MultiCurrencyMoneyOpenApi freezeSuccessAmount;

	/**
	 * 子户余额对象(冻结后)
	 */
	@ApiField("sub_account_balance")
	private SubAccountBalanceOpenApiDTO subAccountBalance;

	public String getFreezeNo() {
		return this.freezeNo;
	}
	public void setFreezeNo(String freezeNo) {
		this.freezeNo = freezeNo;
	}

	public MultiCurrencyMoneyOpenApi getFreezeSuccessAmount() {
		return this.freezeSuccessAmount;
	}
	public void setFreezeSuccessAmount(MultiCurrencyMoneyOpenApi freezeSuccessAmount) {
		this.freezeSuccessAmount = freezeSuccessAmount;
	}

	public SubAccountBalanceOpenApiDTO getSubAccountBalance() {
		return this.subAccountBalance;
	}
	public void setSubAccountBalance(SubAccountBalanceOpenApiDTO subAccountBalance) {
		this.subAccountBalance = subAccountBalance;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.accountdaily.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-21 19:56:38
 */
public class AlipayDataBillAccountdailyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381328825351369466L;

	/** 
	 * 当日充值金额
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/** 
	 * 当日转入金额
	 */
	@ApiField("trans_in_amount")
	private String transInAmount;

	/** 
	 * 当日转出余额
	 */
	@ApiField("trans_out_amount")
	private String transOutAmount;

	/** 
	 * 当日提现金额
	 */
	@ApiField("withdraw_amount")
	private String withdrawAmount;

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositAmount( ) {
		return this.depositAmount;
	}

	public void setTransInAmount(String transInAmount) {
		this.transInAmount = transInAmount;
	}
	public String getTransInAmount( ) {
		return this.transInAmount;
	}

	public void setTransOutAmount(String transOutAmount) {
		this.transOutAmount = transOutAmount;
	}
	public String getTransOutAmount( ) {
		return this.transOutAmount;
	}

	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public String getWithdrawAmount( ) {
		return this.withdrawAmount;
	}

}

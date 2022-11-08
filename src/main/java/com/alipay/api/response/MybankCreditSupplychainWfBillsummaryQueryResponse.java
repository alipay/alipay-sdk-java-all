package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmountWf;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.billsummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:58
 */
public class MybankCreditSupplychainWfBillsummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1873657544936911284L;

	/** 
	 * 未还金额
出账前：只有本金，不包含利息
出账后及逾期后：包含本金+利息+罚息
（原因：只有出账后才会对账单进行结息）
	 */
	@ApiField("balanceamt")
	private AmountWf balanceamt;

	/** 
	 * 逾期金额
	 */
	@ApiField("ovdamt")
	private AmountWf ovdamt;

	/** 
	 * 账单状态（正常/逾期
	 */
	@ApiField("status")
	private String status;

	public void setBalanceamt(AmountWf balanceamt) {
		this.balanceamt = balanceamt;
	}
	public AmountWf getBalanceamt( ) {
		return this.balanceamt;
	}

	public void setOvdamt(AmountWf ovdamt) {
		this.ovdamt = ovdamt;
	}
	public AmountWf getOvdamt( ) {
		return this.ovdamt;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

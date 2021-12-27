package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.repay.initiative.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-02 11:49:15
 */
public class MybankCreditLoantradeRepayInitiativeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7116815347941713241L;

	/** 
	 * 受理事件单编号。
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

}

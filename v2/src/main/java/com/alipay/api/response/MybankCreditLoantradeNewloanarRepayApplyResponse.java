package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.newloanar.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class MybankCreditLoantradeNewloanarRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1341181437472544925L;

	/** 
	 * 受理事件编号
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	/** 
	 * 合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}
	public String getLoanArNo( ) {
		return this.loanArNo;
	}

}

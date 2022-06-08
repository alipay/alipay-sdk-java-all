package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.arrangement.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-17 13:48:12
 */
public class MybankCreditLoanapplyArrangementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2522354416163614459L;

	/** 
	 * 某些场景表示签约的帐号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 业务事件受理的流水号，建议调用方保持此流水号，以方便后续业务处理
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 12:00:56
 */
public class AnttechBlockchainFinanceFsupvBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3683188532894795346L;

	/** 
	 * 管控账户的余额
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 查询账户状态的说明
	 */
	@ApiField("mark")
	private String mark;

	/** 
	 * 账户冻结余额查询状态
	 */
	@ApiField("status")
	private String status;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getMark( ) {
		return this.mark;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

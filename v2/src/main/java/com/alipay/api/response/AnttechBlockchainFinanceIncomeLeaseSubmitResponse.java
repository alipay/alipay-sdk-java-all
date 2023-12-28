package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.income.lease.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:06:43
 */
public class AnttechBlockchainFinanceIncomeLeaseSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7779879233559177143L;

	/** 
	 * 租赁交易登记流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 交易id，租赁交易登记上链后返回
	 */
	@ApiField("trade_id")
	private String tradeId;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getTradeId( ) {
		return this.tradeId;
	}

}

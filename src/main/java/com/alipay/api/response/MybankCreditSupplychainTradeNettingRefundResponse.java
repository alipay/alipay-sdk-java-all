package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.netting.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:17
 */
public class MybankCreditSupplychainTradeNettingRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8877314811754473281L;

	/** 
	 * 业务事件受理的流水号，建议调用方保持此流水号，以方便后续业务处理
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

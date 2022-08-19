package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.pay.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:18
 */
public class MybankCreditSupplychainTradePayConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6177519874561324624L;

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

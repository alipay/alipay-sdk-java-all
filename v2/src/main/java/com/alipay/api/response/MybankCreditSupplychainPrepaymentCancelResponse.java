package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:38:58
 */
public class MybankCreditSupplychainPrepaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5674324621496926489L;

	/** 
	 * 受理事件单编号
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

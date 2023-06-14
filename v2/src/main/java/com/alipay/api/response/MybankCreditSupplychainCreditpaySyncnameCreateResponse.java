package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.syncname.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:48:49
 */
public class MybankCreditSupplychainCreditpaySyncnameCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8589974898535777149L;

	/** 
	 * 业务序列号
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

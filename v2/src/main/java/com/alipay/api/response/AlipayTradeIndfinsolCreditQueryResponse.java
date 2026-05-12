package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.indfinsol.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 16:31:37
 */
public class AlipayTradeIndfinsolCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2759244786245465636L;

	/** 
	 * 银行卡账户
	 */
	@ApiField("bank_card_number")
	private String bankCardNumber;

	/** 
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	public void setBankCardNumber(String bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}
	public String getBankCardNumber( ) {
		return this.bankCardNumber;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

}

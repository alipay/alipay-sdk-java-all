package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.indfinsol.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 16:32:50
 */
public class AlipayTradeIndfinsolCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5193475698769178885L;

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

	/** 
	 * 银行预留手机号
	 */
	@ApiField("mobile")
	private String mobile;

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

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

}

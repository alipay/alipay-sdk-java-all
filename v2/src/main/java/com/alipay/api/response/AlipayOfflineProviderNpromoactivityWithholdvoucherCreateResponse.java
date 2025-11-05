package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npromoactivity.withholdvoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:32:37
 */
public class AlipayOfflineProviderNpromoactivityWithholdvoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6557589673332499341L;

	/** 
	 * 代扣协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 信用单号
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	/** 
	 * 可代扣金额，单位元
	 */
	@ApiField("debiting_amount")
	private String debitingAmount;

	/** 
	 * 代扣单号，获取后调用代扣接口发起代扣。
	 */
	@ApiField("debiting_order_no")
	private String debitingOrderNo;

	/** 
	 * 代扣交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}
	public String getCreditOrderNo( ) {
		return this.creditOrderNo;
	}

	public void setDebitingAmount(String debitingAmount) {
		this.debitingAmount = debitingAmount;
	}
	public String getDebitingAmount( ) {
		return this.debitingAmount;
	}

	public void setDebitingOrderNo(String debitingOrderNo) {
		this.debitingOrderNo = debitingOrderNo;
	}
	public String getDebitingOrderNo( ) {
		return this.debitingOrderNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}

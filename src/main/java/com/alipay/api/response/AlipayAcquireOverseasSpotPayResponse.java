package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.overseas.spot.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireOverseasSpotPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2817653874647273398L;

	/** 
	 * The buyer’s Alipay login Id, the id might be an email or mobile number.
The id is partially masked for privacy
	 */
	@ApiField("alipay_buyer_login_id")
	private String alipayBuyerLoginId;

	/** 
	 * On the partner’s payment request, the alipay system creates a transaction id to handle it.
The alipay_trans_id has one-one association with partner + partner_trans_id
	 */
	@ApiField("alipay_trans_id")
	private String alipayTransId;

	/** 
	 * The currency used for labeling the price of the transaction;
 
Refer to the acronym of currency table
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * To describe the reason of the result_code when it is failed/unknown, leave it blank when result_code is success.
	 */
	@ApiField("error")
	private String error;

	/** 
	 * The rate of conversion the currency given in the request to CNY.
The conversion happens at the time when Alipay’s trade order is created.
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/** 
	 * It indicates that a request is rejected by Alipay gateway.F for rejected
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * Equal to the partner_trans_id given in the request
	 */
	@ApiField("partner_trans_id")
	private String partnerTransId;

	/** 
	 * To describe the response status of a request:
SUCCESS, FAILED, UNKNOW.
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * the transaction amount in the currency given above;

Range: 0.01-100000000.00. Two digits after decimal point.
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/** 
	 * Transaction amount in CNY.
It is the exact amount that the buyer has payed
	 */
	@ApiField("trans_amount_cny")
	private String transAmountCny;

	public void setAlipayBuyerLoginId(String alipayBuyerLoginId) {
		this.alipayBuyerLoginId = alipayBuyerLoginId;
	}
	public String getAlipayBuyerLoginId( ) {
		return this.alipayBuyerLoginId;
	}

	public void setAlipayTransId(String alipayTransId) {
		this.alipayTransId = alipayTransId;
	}
	public String getAlipayTransId( ) {
		return this.alipayTransId;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setError(String error) {
		this.error = error;
	}
	public String getError( ) {
		return this.error;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getExchangeRate( ) {
		return this.exchangeRate;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setPartnerTransId(String partnerTransId) {
		this.partnerTransId = partnerTransId;
	}
	public String getPartnerTransId( ) {
		return this.partnerTransId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransAmount( ) {
		return this.transAmount;
	}

	public void setTransAmountCny(String transAmountCny) {
		this.transAmountCny = transAmountCny;
	}
	public String getTransAmountCny( ) {
		return this.transAmountCny;
	}

}

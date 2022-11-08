package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.overdraft.returnmoney response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-23 10:46:51
 */
public class AlipayTradeOverdraftReturnmoneyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4596618122469464431L;

	/** 
	 * 汇率（仅跨境追款执行成功后返回）
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/** 
	 * 追款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 追款收款账户
	 */
	@ApiField("receive_account")
	private String receiveAccount;

	/** 
	 * 退款时上传的外部请求号
	 */
	@ApiField("refund_out_request_no")
	private String refundOutRequestNo;

	/** 
	 * 追款人民币金额（仅追款执行成功后返回）
	 */
	@ApiField("return_amount")
	private String returnAmount;

	/** 
	 * 追款外币金额（仅跨境追款执行成功后返回）
	 */
	@ApiField("return_foreign_amount")
	private String returnForeignAmount;

	/** 
	 * 追款外币币种（仅跨境追款执行成功后返回）
	 */
	@ApiField("return_foreign_currency")
	private String returnForeignCurrency;

	/** 
	 * 垫资追款结果。枚举值：
SUCCESS：追款成功
FAILED：追款失败
PROCESSING：追款中
	 */
	@ApiField("return_result")
	private String returnResult;

	/** 
	 * 垫付追款完成时间
	 */
	@ApiField("success_time")
	private String successTime;

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getExchangeRate( ) {
		return this.exchangeRate;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	public String getReceiveAccount( ) {
		return this.receiveAccount;
	}

	public void setRefundOutRequestNo(String refundOutRequestNo) {
		this.refundOutRequestNo = refundOutRequestNo;
	}
	public String getRefundOutRequestNo( ) {
		return this.refundOutRequestNo;
	}

	public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}
	public String getReturnAmount( ) {
		return this.returnAmount;
	}

	public void setReturnForeignAmount(String returnForeignAmount) {
		this.returnForeignAmount = returnForeignAmount;
	}
	public String getReturnForeignAmount( ) {
		return this.returnForeignAmount;
	}

	public void setReturnForeignCurrency(String returnForeignCurrency) {
		this.returnForeignCurrency = returnForeignCurrency;
	}
	public String getReturnForeignCurrency( ) {
		return this.returnForeignCurrency;
	}

	public void setReturnResult(String returnResult) {
		this.returnResult = returnResult;
	}
	public String getReturnResult( ) {
		return this.returnResult;
	}

	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}
	public String getSuccessTime( ) {
		return this.successTime;
	}

}

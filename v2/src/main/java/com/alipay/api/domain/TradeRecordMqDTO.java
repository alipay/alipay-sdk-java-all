package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易流水消息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 19:00:35
 */
public class TradeRecordMqDTO extends AlipayObject {

	private static final long serialVersionUID = 8218311715115979864L;

	/**
	 * 付款账号，非uid
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 专属账号
	 */
	@ApiField("account_no_ex")
	private String accountNoEx;

	/**
	 * 余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务参考号
	 */
	@ApiField("biz_ref_no")
	private String bizRefNo;

	/**
	 * 业务摘要
	 */
	@ApiField("biz_summary")
	private String bizSummary;

	/**
	 * 手续费金额
	 */
	@ApiField("charges_amount")
	private String chargesAmount;

	/**
	 * 手续费币种
	 */
	@ApiField("charges_currency_type")
	private String chargesCurrencyType;

	/**
	 * 收款金额
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/**
	 * 币种
	 */
	@ApiField("currency_type")
	private String currencyType;

	/**
	 * 付款金额
	 */
	@ApiField("debit_amount")
	private String debitAmount;

	/**
	 * 汇率
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 长沙银行
	 */
	@ApiField("other_side_account_name")
	private String otherSideAccountName;

	/**
	 * 收方账号，非uid
	 */
	@ApiField("other_side_account_no")
	private String otherSideAccountNo;

	/**
	 * 对方账号币种
	 */
	@ApiField("other_side_currency_type")
	private String otherSideCurrencyType;

	/**
	 * 其他摘要
	 */
	@ApiField("other_summary")
	private String otherSummary;

	/**
	 * 支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 支付币种
	 */
	@ApiField("payment_currency_type")
	private String paymentCurrencyType;

	/**
	 * 流程实例号
	 */
	@ApiField("process_no")
	private String processNo;

	/**
	 * 用途
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * 摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 时间戳
	 */
	@ApiField("sync_date")
	private Long syncDate;

	/**
	 * 影子标,只有为true才会是影子流量，false或者空都是正式流量
	 */
	@ApiField("test_mode")
	private Boolean testMode;

	/**
	 * 时间戳
	 */
	@ApiField("trade_date")
	private Long tradeDate;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 唯一编码
	 */
	@ApiField("unique_no")
	private String uniqueNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNoEx() {
		return this.accountNoEx;
	}
	public void setAccountNoEx(String accountNoEx) {
		this.accountNoEx = accountNoEx;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizRefNo() {
		return this.bizRefNo;
	}
	public void setBizRefNo(String bizRefNo) {
		this.bizRefNo = bizRefNo;
	}

	public String getBizSummary() {
		return this.bizSummary;
	}
	public void setBizSummary(String bizSummary) {
		this.bizSummary = bizSummary;
	}

	public String getChargesAmount() {
		return this.chargesAmount;
	}
	public void setChargesAmount(String chargesAmount) {
		this.chargesAmount = chargesAmount;
	}

	public String getChargesCurrencyType() {
		return this.chargesCurrencyType;
	}
	public void setChargesCurrencyType(String chargesCurrencyType) {
		this.chargesCurrencyType = chargesCurrencyType;
	}

	public String getCreditAmount() {
		return this.creditAmount;
	}
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getCurrencyType() {
		return this.currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getDebitAmount() {
		return this.debitAmount;
	}
	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getOtherSideAccountName() {
		return this.otherSideAccountName;
	}
	public void setOtherSideAccountName(String otherSideAccountName) {
		this.otherSideAccountName = otherSideAccountName;
	}

	public String getOtherSideAccountNo() {
		return this.otherSideAccountNo;
	}
	public void setOtherSideAccountNo(String otherSideAccountNo) {
		this.otherSideAccountNo = otherSideAccountNo;
	}

	public String getOtherSideCurrencyType() {
		return this.otherSideCurrencyType;
	}
	public void setOtherSideCurrencyType(String otherSideCurrencyType) {
		this.otherSideCurrencyType = otherSideCurrencyType;
	}

	public String getOtherSummary() {
		return this.otherSummary;
	}
	public void setOtherSummary(String otherSummary) {
		this.otherSummary = otherSummary;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrencyType() {
		return this.paymentCurrencyType;
	}
	public void setPaymentCurrencyType(String paymentCurrencyType) {
		this.paymentCurrencyType = paymentCurrencyType;
	}

	public String getProcessNo() {
		return this.processNo;
	}
	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getSyncDate() {
		return this.syncDate;
	}
	public void setSyncDate(Long syncDate) {
		this.syncDate = syncDate;
	}

	public Boolean getTestMode() {
		return this.testMode;
	}
	public void setTestMode(Boolean testMode) {
		this.testMode = testMode;
	}

	public Long getTradeDate() {
		return this.tradeDate;
	}
	public void setTradeDate(Long tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getUniqueNo() {
		return this.uniqueNo;
	}
	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

}

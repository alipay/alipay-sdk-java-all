package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付收单明细的交易明细数据
 *
 * @author auto create
 * @since 1.0, 2026-04-23 10:07:52
 */
public class AcquirePayFlowTransDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5133181159592773825L;

	/**
	 * 支付宝交易金额（按月汇总，单位：元）
	 */
	@ApiField("alipay_total_amt")
	private String alipayTotalAmt;

	/**
	 * 支付宝交易笔数（按月汇总）
	 */
	@ApiField("alipay_total_cnt")
	private String alipayTotalCnt;

	/**
	 * 现金支付交易金额（按月汇总，单位：元）
	 */
	@ApiField("cash_amt")
	private String cashAmt;

	/**
	 * 现金支付交易笔数（按月汇总）
	 */
	@ApiField("cash_cnt")
	private String cashCnt;

	/**
	 * 信用卡(贷记卡) 交易金额（按月汇总，单位：元）
	 */
	@ApiField("credit_card_amt")
	private String creditCardAmt;

	/**
	 * 信用卡(贷记卡) 交易笔数（按月汇总）
	 */
	@ApiField("credit_card_cnt")
	private String creditCardCnt;

	/**
	 * 储蓄卡(借记银行卡) 交易金额（按月汇总，单位：元）
	 */
	@ApiField("debit_card_amt")
	private String debitCardAmt;

	/**
	 * 储蓄卡(借记银行卡) 交易笔数（按月汇总)
	 */
	@ApiField("debit_card_cnt")
	private String debitCardCnt;

	/**
	 * 虚假交易金额（按月汇总，单位：元）
	 */
	@ApiField("fraud_amt")
	private String fraudAmt;

	/**
	 * 虚假交易笔数（按月汇总）
	 */
	@ApiField("fraud_cnt")
	private String fraudCnt;

	/**
	 * 其他移动支付工具(非支付宝和微信)交易金额（按月汇总，单位：元）
	 */
	@ApiField("other_amt")
	private String otherAmt;

	/**
	 * 其他移动支付工具(非支付宝和微信)交易笔数（按月汇总）
	 */
	@ApiField("other_cnt")
	private String otherCnt;

	/**
	 * 总交易金额（单位：元）
	 */
	@ApiField("total_amt")
	private String totalAmt;

	/**
	 * 总交易笔数
	 */
	@ApiField("total_cnt")
	private String totalCnt;

	/**
	 * 统计月份
	 */
	@ApiField("vintage")
	private String vintage;

	/**
	 * 微信支付交易金额（按月汇总，单位：元）
	 */
	@ApiField("wx_total_amt")
	private String wxTotalAmt;

	/**
	 * 微信支付交易笔数（按月汇总）
	 */
	@ApiField("wx_total_cnt")
	private String wxTotalCnt;

	public String getAlipayTotalAmt() {
		return this.alipayTotalAmt;
	}
	public void setAlipayTotalAmt(String alipayTotalAmt) {
		this.alipayTotalAmt = alipayTotalAmt;
	}

	public String getAlipayTotalCnt() {
		return this.alipayTotalCnt;
	}
	public void setAlipayTotalCnt(String alipayTotalCnt) {
		this.alipayTotalCnt = alipayTotalCnt;
	}

	public String getCashAmt() {
		return this.cashAmt;
	}
	public void setCashAmt(String cashAmt) {
		this.cashAmt = cashAmt;
	}

	public String getCashCnt() {
		return this.cashCnt;
	}
	public void setCashCnt(String cashCnt) {
		this.cashCnt = cashCnt;
	}

	public String getCreditCardAmt() {
		return this.creditCardAmt;
	}
	public void setCreditCardAmt(String creditCardAmt) {
		this.creditCardAmt = creditCardAmt;
	}

	public String getCreditCardCnt() {
		return this.creditCardCnt;
	}
	public void setCreditCardCnt(String creditCardCnt) {
		this.creditCardCnt = creditCardCnt;
	}

	public String getDebitCardAmt() {
		return this.debitCardAmt;
	}
	public void setDebitCardAmt(String debitCardAmt) {
		this.debitCardAmt = debitCardAmt;
	}

	public String getDebitCardCnt() {
		return this.debitCardCnt;
	}
	public void setDebitCardCnt(String debitCardCnt) {
		this.debitCardCnt = debitCardCnt;
	}

	public String getFraudAmt() {
		return this.fraudAmt;
	}
	public void setFraudAmt(String fraudAmt) {
		this.fraudAmt = fraudAmt;
	}

	public String getFraudCnt() {
		return this.fraudCnt;
	}
	public void setFraudCnt(String fraudCnt) {
		this.fraudCnt = fraudCnt;
	}

	public String getOtherAmt() {
		return this.otherAmt;
	}
	public void setOtherAmt(String otherAmt) {
		this.otherAmt = otherAmt;
	}

	public String getOtherCnt() {
		return this.otherCnt;
	}
	public void setOtherCnt(String otherCnt) {
		this.otherCnt = otherCnt;
	}

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTotalCnt() {
		return this.totalCnt;
	}
	public void setTotalCnt(String totalCnt) {
		this.totalCnt = totalCnt;
	}

	public String getVintage() {
		return this.vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}

	public String getWxTotalAmt() {
		return this.wxTotalAmt;
	}
	public void setWxTotalAmt(String wxTotalAmt) {
		this.wxTotalAmt = wxTotalAmt;
	}

	public String getWxTotalCnt() {
		return this.wxTotalCnt;
	}
	public void setWxTotalCnt(String wxTotalCnt) {
		this.wxTotalCnt = wxTotalCnt;
	}

}

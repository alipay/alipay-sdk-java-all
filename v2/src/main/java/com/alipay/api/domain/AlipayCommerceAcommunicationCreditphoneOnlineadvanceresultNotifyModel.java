package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购在线提前结清单支付结果通知
 *
 * @author auto create
 * @since 1.0, 2026-04-15 20:57:45
 */
public class AlipayCommerceAcommunicationCreditphoneOnlineadvanceresultNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6384268396643624424L;

	/**
	 * 支付宝在线提前结清测算单号
	 */
	@ApiField("alipay_online_advance_pay_order_no")
	private String alipayOnlineAdvancePayOrderNo;

	/**
	 * 机构侧测算单号
	 */
	@ApiField("inst_pay_order_no")
	private String instPayOrderNo;

	/**
	 * 机构侧支付单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 交易金额，单位 元
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易完成时间
	 */
	@ApiField("trade_finish_time")
	private Date tradeFinishTime;

	/**
	 * 支付宝侧支付单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAlipayOnlineAdvancePayOrderNo() {
		return this.alipayOnlineAdvancePayOrderNo;
	}
	public void setAlipayOnlineAdvancePayOrderNo(String alipayOnlineAdvancePayOrderNo) {
		this.alipayOnlineAdvancePayOrderNo = alipayOnlineAdvancePayOrderNo;
	}

	public String getInstPayOrderNo() {
		return this.instPayOrderNo;
	}
	public void setInstPayOrderNo(String instPayOrderNo) {
		this.instPayOrderNo = instPayOrderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Date getTradeFinishTime() {
		return this.tradeFinishTime;
	}
	public void setTradeFinishTime(Date tradeFinishTime) {
		this.tradeFinishTime = tradeFinishTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

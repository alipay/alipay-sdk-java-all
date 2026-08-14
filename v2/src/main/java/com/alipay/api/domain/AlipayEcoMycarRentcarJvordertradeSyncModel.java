package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车JV租车交易同步
 *
 * @author auto create
 * @since 1.0, 2026-08-14 14:43:09
 */
public class AlipayEcoMycarRentcarJvordertradeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2486174762441387634L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * JV租车交易所属的订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 交易关联的JV租车主订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * JV租车交易流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * JV租车交易流水对应的交易单号
	 */
	@ApiField("out_trade_order_no")
	private String outTradeOrderNo;

	/**
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 交易金额，单位分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 发生交易的小程序appId
	 */
	@ApiField("trade_app_id")
	private String tradeAppId;

	/**
	 * 发生交易的小程序名称
	 */
	@ApiField("trade_app_name")
	private String tradeAppName;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 发生交易的商户pid
	 */
	@ApiField("trade_pid")
	private String tradePid;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	/**
	 * 交易类型,用于区分是支付还是退款
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOutTradeOrderNo() {
		return this.outTradeOrderNo;
	}
	public void setOutTradeOrderNo(String outTradeOrderNo) {
		this.outTradeOrderNo = outTradeOrderNo;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeAppId() {
		return this.tradeAppId;
	}
	public void setTradeAppId(String tradeAppId) {
		this.tradeAppId = tradeAppId;
	}

	public String getTradeAppName() {
		return this.tradeAppName;
	}
	public void setTradeAppName(String tradeAppName) {
		this.tradeAppName = tradeAppName;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradePid() {
		return this.tradePid;
	}
	public void setTradePid(String tradePid) {
		this.tradePid = tradePid;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

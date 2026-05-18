package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trafficshare.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 21:22:42
 */
public class AlipayCommerceTransportTrafficshareTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6833575618316125728L;

	/** 
	 * 金额单位
	 */
	@ApiField("amount_unit")
	private String amountUnit;

	/** 
	 * 平台优惠金额。单位：取自amount_unit
，元或者分
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 商户业务号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 用户实际支付金额。单位：取自amount_unit
，元或者分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 实收金额。该金额为本笔交易，商户账户能够实际收到的金额。单位：取自amount_unit
，元或者分
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 交易的订单金额，该参数的值为支付时传入的total_amount。单位：取自amount_unit
，元或者分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAmountUnit(String amountUnit) {
		this.amountUnit = amountUnit;
	}
	public String getAmountUnit( ) {
		return this.amountUnit;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}

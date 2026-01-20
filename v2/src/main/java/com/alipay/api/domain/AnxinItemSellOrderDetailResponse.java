package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心卡售卖详情
 *
 * @author auto create
 * @since 1.0, 2024-05-28 11:04:34
 */
public class AnxinItemSellOrderDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 2239257554924938457L;

	/**
	 * 买家openid
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 买家uid
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 安心卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 订单创建日期，格式为yyyy-MM-dd
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 订单总价，单位：元,精确到小数点后两位
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 实收金额，单位：元,精确到小数点后两位
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 订单退款金额，单位：元,精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiscountDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.aggregate.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 09:43:08
 */
public class KoubeiTradeOrderAggregatePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1215397965792248424L;

	/** 
	 * 买家ID, 支付成功时才返回
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 付款用户类型； 支付宝(alipay)/微信(weixin)，支付成功时才返回
	 */
	@ApiField("buyer_id_type")
	private String buyerIdType;

	/** 
	 * 用户实付金额，支付成功时才返回
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/** 
	 * 本交易支付时使用的所有优惠券信息
	 */
	@ApiListField("discount_detail_list")
	@ApiField("discount_detail_info")
	private List<DiscountDetailInfo> discountDetailList;

	/** 
	 * 支付成功时间
	 */
	@ApiField("gmt_payment_time")
	private String gmtPaymentTime;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * SUCCESS - 支付成功
FAILED - 支付失败
PROCESSING - 处理中
CLOSED - 关单
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商家请求订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付渠道； 支付宝(alipay)/微信(wechat)
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/** 
	 * 实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝/微信交易号； 支付成功时才返回
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setBuyerIdType(String buyerIdType) {
		this.buyerIdType = buyerIdType;
	}
	public String getBuyerIdType( ) {
		return this.buyerIdType;
	}

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
	}

	public void setDiscountDetailList(List<DiscountDetailInfo> discountDetailList) {
		this.discountDetailList = discountDetailList;
	}
	public List<DiscountDetailInfo> getDiscountDetailList( ) {
		return this.discountDetailList;
	}

	public void setGmtPaymentTime(String gmtPaymentTime) {
		this.gmtPaymentTime = gmtPaymentTime;
	}
	public String getGmtPaymentTime( ) {
		return this.gmtPaymentTime;
	}

	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}
	public String getMerchantDiscountAmount( ) {
		return this.merchantDiscountAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}
	public String getPayChannel( ) {
		return this.payChannel;
	}

	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}
	public String getPlatformDiscountAmount( ) {
		return this.platformDiscountAmount;
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

}

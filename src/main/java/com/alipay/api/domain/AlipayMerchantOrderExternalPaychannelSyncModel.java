package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单平台外部渠道支付结果同步消息
 *
 * @author auto create
 * @since 1.0, 2021-04-14 14:38:01
 */
public class AlipayMerchantOrderExternalPaychannelSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7286671896612963143L;

	/**
	 * isv侧的业务订单号，等同于支付接口spi.alipay.merchant.order.commonisv.pay
中的isv_order_no
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务单状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 买家实付金额 - 仅针对支付
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/**
	 * 平台优惠金额 - 仅针对支付
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 交易支付使用的资金渠道
	 */
	@ApiField("fund_bill_list")
	private String fundBillList;

	/**
	 * 支付成功时间 - 仅针对支付
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/**
	 * 商家优惠金额 - 仅针对支付
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/**
	 * 通知时间
	 */
	@ApiField("notify_time")
	private Date notifyTime;

	/**
	 * 通知类型
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 原始第三方支付结构的交易号，比如支付宝、微信交易号。等同于支付接口spi.alipay.merchant.order.commonisv.pay 中的channel_order_no
	 */
	@ApiField("origin_trade_no")
	private String originTradeNo;

	/**
	 * 外部业务号，等同于支付接口spi.alipay.merchant.order.commonisv.pay中的merchant_order_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部请求号 - 仅针对退款
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付通道类型，001：支付宝，002：微信，003：qq钱包，004：京东钱包，005：口碑，006：翼支付，007：银联二维码，008：和包支付（仅限和包通道），009：百度钱包，010：苏宁钱包，100：自动识别类型等
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 实收金额 - 仅针对支付
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 本次退款金额（非累计） - 仅针对退款
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 累计退款总金额 - 仅针对退款
	 */
	@ApiField("refund_total_amount")
	private String refundTotalAmount;

	/**
	 * 业务单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getBuyerPayAmount() {
		return this.buyerPayAmount;
	}
	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getFundBillList() {
		return this.fundBillList;
	}
	public void setFundBillList(String fundBillList) {
		this.fundBillList = fundBillList;
	}

	public Date getGmtPayment() {
		return this.gmtPayment;
	}
	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

	public String getMdiscountAmount() {
		return this.mdiscountAmount;
	}
	public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
	}

	public Date getNotifyTime() {
		return this.notifyTime;
	}
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getOriginTradeNo() {
		return this.originTradeNo;
	}
	public void setOriginTradeNo(String originTradeNo) {
		this.originTradeNo = originTradeNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
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

	public String getRefundTotalAmount() {
		return this.refundTotalAmount;
	}
	public void setRefundTotalAmount(String refundTotalAmount) {
		this.refundTotalAmount = refundTotalAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

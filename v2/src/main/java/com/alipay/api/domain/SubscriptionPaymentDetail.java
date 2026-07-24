package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-15 10:12:54
 */
public class SubscriptionPaymentDetail extends AlipayObject {

	private static final long serialVersionUID = 8847446231814724749L;

	/**
	 * 事件发生时间，针对subscription_create、subscription_upgrade、subscription_cycle为支付成功时间；subscription_refund为立即取消的请求时间（退款为异步退款），实际退款时间可以参考refund_details退款明细中的refund_time
	 */
	@ApiField("gmt_occur")
	private Date gmtOccur;

	/**
	 * 订阅支付单号/退款单号。正向支付时，order_no为subscription_create、subscription_upgrade、subscription_cycle对应的order_no；逆向退款时order_no为取消接口返回的refund_order_id
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 交易状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 交易类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * null
	 */
	@ApiListField("refund_details")
	@ApiField("subscription_batch_refund_detail")
	private List<SubscriptionBatchRefundDetail> refundDetails;

	/**
	 * 总支付或退款金额，单位元。注意当pay_type= subscription_refund时，该字段代表总退款金额，实际退款金额以refund_details中退款成功的金额为准
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 交易单号。注意当pay_type= subscription_refund时，无该字段，退款可能涉及到多笔订单的退款，退款的交易明细可以通过refund_details确认
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Date getGmtOccur() {
		return this.gmtOccur;
	}
	public void setGmtOccur(Date gmtOccur) {
		this.gmtOccur = gmtOccur;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public List<SubscriptionBatchRefundDetail> getRefundDetails() {
		return this.refundDetails;
	}
	public void setRefundDetails(List<SubscriptionBatchRefundDetail> refundDetails) {
		this.refundDetails = refundDetails;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

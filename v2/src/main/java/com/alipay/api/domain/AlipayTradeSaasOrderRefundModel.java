package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas订单退款
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2413519516263979578L;

	/**
	 * SaaS客户ID。传入时用于增强订单归属校验。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * SaaS交易订单号。与out_trade_no、trade_no至少传入一个，多个字段同时传入时必须指向同一笔交易。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户退款请求号。部分退款时必填，用于退款幂等；整单退款时可不传。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。与order_no、trade_no至少传入一个，多个字段同时传入时必须指向同一笔交易。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款返回字段控制，数组JSON字符串格式。当前支持refund_detail_item_list、gmt_refund_pay。
	 */
	@ApiField("query_options")
	private String queryOptions;

	/**
	 * 退款金额，单位为元，精确到小数点后2位。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 下游支付渠道交易号。与order_no、out_trade_no至少传入一个，多个字段同时传入时必须指向同一笔交易。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(String queryOptions) {
		this.queryOptions = queryOptions;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

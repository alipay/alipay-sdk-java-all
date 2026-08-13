package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas订单查询
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:50
 */
public class AlipayTradeSaasOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4819525569843587155L;

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
	 * 商户订单号。与 order_no、trade_no 至少传入一个，三个字段同时传入多个时，必须指向同一笔交易。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 查询返回字段控制，数组JSON字符串格式。当前支持fund_bill_list。
	 */
	@ApiField("query_options")
	private String queryOptions;

	/**
	 * 下游支付渠道交易号。与 order_no、out_trade_no 至少传入一个，三个字段同时传入多个时，必须指向同一笔交易。
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

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

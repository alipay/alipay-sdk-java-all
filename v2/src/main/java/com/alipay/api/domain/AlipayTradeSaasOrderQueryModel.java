package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas订单查询
 *
 * @author auto create
 * @since 1.0, 2026-08-25 21:17:52
 */
public class AlipayTradeSaasOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1235634392143836541L;

	/**
	 * SaaS客户ID。传入时用于增强订单归属校验。
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * SaaS交易订单号。与out_trade_no、trade_no至少传入一个；同时传入多个时必须指向同一笔交易。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户订单号。与order_no、trade_no至少传入一个；同时传入多个时必须指向同一笔交易。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 查询返回字段控制，使用JSON数组字符串格式。当前仅支持不传或传空数组。
	 */
	@ApiField("query_options")
	private String queryOptions;

	/**
	 * 下游支付渠道交易号。与order_no、out_trade_no至少传入一个；同时传入多个时必须指向同一笔交易。
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

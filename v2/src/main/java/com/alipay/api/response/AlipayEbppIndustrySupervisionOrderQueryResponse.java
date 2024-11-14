package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-21 10:27:01
 */
public class AlipayEbppIndustrySupervisionOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3245952877634165135L;

	/** 
	 * 冻资单地址
	 */
	@ApiField("alipay_order_detail_url")
	private String alipayOrderDetailUrl;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 订单金额，整数，单位分
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 默认CNY
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 冻资单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 外部请求下单时传入订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 外部商户订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 已缴金额，整数，单位分
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/** 
	 * 待缴金额 整数，(单位：分)
	 */
	@ApiField("unpaid_amount")
	private String unpaidAmount;

	public void setAlipayOrderDetailUrl(String alipayOrderDetailUrl) {
		this.alipayOrderDetailUrl = alipayOrderDetailUrl;
	}
	public String getAlipayOrderDetailUrl( ) {
		return this.alipayOrderDetailUrl;
	}

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPaidAmount( ) {
		return this.paidAmount;
	}

	public void setUnpaidAmount(String unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}
	public String getUnpaidAmount( ) {
		return this.unpaidAmount;
	}

}

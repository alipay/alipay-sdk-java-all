package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单支付接口
 *
 * @author auto create
 * @since 1.0, 2020-01-03 14:49:08
 */
public class KoubeiTradeOrderAggregatePayModel extends AlipayObject {

	private static final long serialVersionUID = 7129698991569491636L;

	/**
	 * 微信或支付宝授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 订单来源， 客如云填写: keruyun
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 商家请求订单号;
同一商户下必须唯一，用来控制幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单标题，报送至支付宝或微信
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 支付超时时间；默认3m;
该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额； 若不可打折金额等于订单金额，则屏蔽营销
	 */
	@ApiField("un_discount_amount")
	private String unDiscountAmount;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUnDiscountAmount() {
		return this.unDiscountAmount;
	}
	public void setUnDiscountAmount(String unDiscountAmount) {
		this.unDiscountAmount = unDiscountAmount;
	}

}

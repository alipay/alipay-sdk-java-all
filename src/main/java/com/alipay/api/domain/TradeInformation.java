package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单贷贸易信息
 *
 * @author auto create
 * @since 1.0, 2021-11-16 15:55:38
 */
public class TradeInformation extends AlipayObject {

	private static final long serialVersionUID = 8372485453795265399L;

	/**
	 * 商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 是否LC订单，Y - 是 /  N - 否，不传默认为N
	 */
	@ApiField("is_l_c_order")
	private String isLCOrder;

	/**
	 * 一达通是否收到信用证正本，是否LC订单，Y - 是 / N - 否
	 */
	@ApiField("is_l_c_received_by_one_touch")
	private String isLCReceivedByOneTouch;

	/**
	 * 订单金额，币种最小单位，如果是CNY，则单位分
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIsLCOrder() {
		return this.isLCOrder;
	}
	public void setIsLCOrder(String isLCOrder) {
		this.isLCOrder = isLCOrder;
	}

	public String getIsLCReceivedByOneTouch() {
		return this.isLCReceivedByOneTouch;
	}
	public void setIsLCReceivedByOneTouch(String isLCReceivedByOneTouch) {
		this.isLCReceivedByOneTouch = isLCReceivedByOneTouch;
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

}

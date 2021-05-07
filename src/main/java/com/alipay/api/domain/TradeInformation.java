package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单贷贸易信息
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:07:57
 */
public class TradeInformation extends AlipayObject {

	private static final long serialVersionUID = 4475211914671959272L;

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

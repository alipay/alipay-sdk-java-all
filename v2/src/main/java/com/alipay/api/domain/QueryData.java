package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-23 10:47:52
 */
public class QueryData extends AlipayObject {

	private static final long serialVersionUID = 5383557915567985243L;

	/**
	 * SAAS履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * SAAS订单ID
	 */
	@ApiField("trade_order_id")
	private String tradeOrderId;

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getTradeOrderId() {
		return this.tradeOrderId;
	}
	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

}

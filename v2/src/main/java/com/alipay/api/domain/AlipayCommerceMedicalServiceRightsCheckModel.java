package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务项权益校验
 *
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:49
 */
public class AlipayCommerceMedicalServiceRightsCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7714368971696785999L;

	/**
	 * SAAS履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 支付宝uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * SAAS订单ID
	 */
	@ApiField("trade_order_id")
	private String tradeOrderId;

	/**
	 * 履约类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTradeOrderId() {
		return this.tradeOrderId;
	}
	public void setTradeOrderId(String tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

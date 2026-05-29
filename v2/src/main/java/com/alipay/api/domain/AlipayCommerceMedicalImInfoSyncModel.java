package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV消息同步
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:02:45
 */
public class AlipayCommerceMedicalImInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8354499851688985158L;

	/**
	 * SAAS履约单ID
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 问诊类消息列表
	 */
	@ApiField("msg_data")
	private MsgDataParam msgData;

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

	public MsgDataParam getMsgData() {
		return this.msgData;
	}
	public void setMsgData(MsgDataParam msgData) {
		this.msgData = msgData;
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

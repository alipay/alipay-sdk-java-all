package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.gift.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-10 11:47:28
 */
public class AlipayTradeGiftStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5539898571225714772L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("recipient_open_id")
	private String recipientOpenId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("recipient_user_id")
	private String recipientUserId;

	/** 
	 * 关联订单组id,一送多收的场景
	 */
	@ApiField("tb_og_id")
	private String tbOgId;

	/** 
	 * 淘宝订单id
	 */
	@ApiField("tb_order_id")
	private String tbOrderId;

	public void setRecipientOpenId(String recipientOpenId) {
		this.recipientOpenId = recipientOpenId;
	}
	public String getRecipientOpenId( ) {
		return this.recipientOpenId;
	}

	public void setRecipientUserId(String recipientUserId) {
		this.recipientUserId = recipientUserId;
	}
	public String getRecipientUserId( ) {
		return this.recipientUserId;
	}

	public void setTbOgId(String tbOgId) {
		this.tbOgId = tbOgId;
	}
	public String getTbOgId( ) {
		return this.tbOgId;
	}

	public void setTbOrderId(String tbOrderId) {
		this.tbOrderId = tbOrderId;
	}
	public String getTbOrderId( ) {
		return this.tbOrderId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险权益订单退款
 *
 * @author auto create
 * @since 1.0, 2025-06-19 11:38:11
 */
public class AlipayInsRightsOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1269793637917923942L;

	/**
	 * 业务下单时传入的bizNo值
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 当前下单的实际原始商品id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 说明本次订单退款的原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

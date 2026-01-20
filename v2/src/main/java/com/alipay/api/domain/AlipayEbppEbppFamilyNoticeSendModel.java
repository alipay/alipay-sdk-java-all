package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活缴费家庭消息发送
 *
 * @author auto create
 * @since 1.0, 2025-08-07 11:27:36
 */
public class AlipayEbppEbppFamilyNoticeSendModel extends AlipayObject {

	private static final long serialVersionUID = 3613168695442326361L;

	/**
	 * 发送的消息类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 消息发送变量
	 */
	@ApiField("msg_vars")
	private String msgVars;

	/**
	 * 发送目标用户的支付宝UID,数据来源于用户线上授权
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 共享权益的商品SKUID
	 */
	@ApiField("sku")
	private String sku;

	/**
	 * 发送目标用户的支付宝UID,数据来源于用户线上授权
	 */
	@ApiField("user_id")
	private String userId;

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgVars() {
		return this.msgVars;
	}
	public void setMsgVars(String msgVars) {
		this.msgVars = msgVars;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSku() {
		return this.sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

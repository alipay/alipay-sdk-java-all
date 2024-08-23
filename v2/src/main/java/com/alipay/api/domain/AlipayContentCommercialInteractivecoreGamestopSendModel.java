package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 玩法结束通知
 *
 * @author auto create
 * @since 1.0, 2024-07-23 16:01:13
 */
public class AlipayContentCommercialInteractivecoreGamestopSendModel extends AlipayObject {

	private static final long serialVersionUID = 7714573357184999771L;

	/**
	 * 玩法token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 消息唯一id，用于幂等消费
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 玩法结束原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 毫秒时间戳
	 */
	@ApiField("ts")
	private String ts;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTs() {
		return this.ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}

}

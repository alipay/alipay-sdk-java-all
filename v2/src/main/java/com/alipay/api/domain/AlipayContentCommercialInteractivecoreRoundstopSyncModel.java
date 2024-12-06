package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对局结束通知V2
 *
 * @author auto create
 * @since 1.0, 2024-09-19 13:57:53
 */
public class AlipayContentCommercialInteractivecoreRoundstopSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1155234377118685531L;

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
	 * 对局结束原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 对局id
	 */
	@ApiField("round_id")
	private String roundId;

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

	public String getRoundId() {
		return this.roundId;
	}
	public void setRoundId(String roundId) {
		this.roundId = roundId;
	}

	public String getTs() {
		return this.ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}

}

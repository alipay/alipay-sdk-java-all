package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉取礼物数据
 *
 * @author auto create
 * @since 1.0, 2024-07-23 15:59:57
 */
public class AlipayContentCommercialInteractivecoreGiftpullSendModel extends AlipayObject {

	private static final long serialVersionUID = 8711155658159721442L;

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
	 * 查询开始时间，毫秒时间戳，查询礼物数据的起始时间，最早不超过当前时间的20s
	 */
	@ApiField("query_start_time")
	private String queryStartTime;

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

	public String getQueryStartTime() {
		return this.queryStartTime;
	}
	public void setQueryStartTime(String queryStartTime) {
		this.queryStartTime = queryStartTime;
	}

	public String getTs() {
		return this.ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}

}

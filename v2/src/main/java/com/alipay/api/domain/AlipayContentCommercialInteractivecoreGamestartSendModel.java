package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 玩法启动通知
 *
 * @author auto create
 * @since 1.0, 2024-07-23 16:01:39
 */
public class AlipayContentCommercialInteractivecoreGamestartSendModel extends AlipayObject {

	private static final long serialVersionUID = 5249141195643731451L;

	/**
	 * 用于标识玩法
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 礼物效果信息
	 */
	@ApiListField("gift_batch_info")
	@ApiField("gift_batch_info")
	private List<GiftBatchInfo> giftBatchInfo;

	/**
	 * 消息唯一id，用于幂等消费
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 东八区毫秒时间戳
	 */
	@ApiField("ts")
	private String ts;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<GiftBatchInfo> getGiftBatchInfo() {
		return this.giftBatchInfo;
	}
	public void setGiftBatchInfo(List<GiftBatchInfo> giftBatchInfo) {
		this.giftBatchInfo = giftBatchInfo;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getTs() {
		return this.ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}

}

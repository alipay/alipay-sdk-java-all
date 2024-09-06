package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对局启动通知
 *
 * @author auto create
 * @since 1.0, 2024-08-12 10:25:05
 */
public class AlipayContentCommercialInteractivecoreRoundstartSendModel extends AlipayObject {

	private static final long serialVersionUID = 4613178425547529414L;

	/**
	 * 玩法token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 加入面板信息
	 */
	@ApiListField("join_panel_info")
	@ApiField("join_panel_info")
	private List<JoinPanelInfo> joinPanelInfo;

	/**
	 * 消息唯一id，用于幂等消费
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 对局id，由英文数字组成，不超过20字符，同一玩法内唯一
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

	public List<JoinPanelInfo> getJoinPanelInfo() {
		return this.joinPanelInfo;
	}
	public void setJoinPanelInfo(List<JoinPanelInfo> joinPanelInfo) {
		this.joinPanelInfo = joinPanelInfo;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
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

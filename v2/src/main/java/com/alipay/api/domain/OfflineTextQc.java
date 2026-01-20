package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 离线文本质检
 *
 * @author auto create
 * @since 1.0, 2025-06-30 15:17:31
 */
public class OfflineTextQc extends AlipayObject {

	private static final long serialVersionUID = 1892835824482495582L;

	/**
	 * 热线可以选择传递的号码
	 */
	@ApiField("caller_phone")
	private String callerPhone;

	/**
	 * 渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 对话内容
	 */
	@ApiListField("content")
	@ApiField("qc_dialog")
	private List<QcDialog> content;

	/**
	 * 服务开始时间
	 */
	@ApiField("incoming_time")
	private Date incomingTime;

	/**
	 * 对话轮次
	 */
	@ApiField("rounds")
	private Long rounds;

	public String getCallerPhone() {
		return this.callerPhone;
	}
	public void setCallerPhone(String callerPhone) {
		this.callerPhone = callerPhone;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<QcDialog> getContent() {
		return this.content;
	}
	public void setContent(List<QcDialog> content) {
		this.content = content;
	}

	public Date getIncomingTime() {
		return this.incomingTime;
	}
	public void setIncomingTime(Date incomingTime) {
		this.incomingTime = incomingTime;
	}

	public Long getRounds() {
		return this.rounds;
	}
	public void setRounds(Long rounds) {
		this.rounds = rounds;
	}

}

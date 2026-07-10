package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加密手机号触达用户接口
 *
 * @author auto create
 * @since 1.0, 2026-04-01 11:06:37
 */
public class AlipayCommerceAcommunicationMessageHashSendModel extends AlipayObject {

	private static final long serialVersionUID = 5485651931126574294L;

	/**
	 * 动态参数
	 */
	@ApiField("context")
	private String context;

	/**
	 * 机构侧消息id
	 */
	@ApiField("inst_message_id")
	private String instMessageId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 哈希后的手机号，行业侧保存和用户的对应关系
	 */
	@ApiField("to_mobile_hash")
	private String toMobileHash;

	/**
	 * 代表了当时的触发条件，例如余额不足、出账等情况，行业侧会根据触发条件映射成消息模版，同个条件不同人群可能有多套AB策略
	 */
	@ApiField("trigger_condition")
	private String triggerCondition;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getInstMessageId() {
		return this.instMessageId;
	}
	public void setInstMessageId(String instMessageId) {
		this.instMessageId = instMessageId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getToMobileHash() {
		return this.toMobileHash;
	}
	public void setToMobileHash(String toMobileHash) {
		this.toMobileHash = toMobileHash;
	}

	public String getTriggerCondition() {
		return this.triggerCondition;
	}
	public void setTriggerCondition(String triggerCondition) {
		this.triggerCondition = triggerCondition;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

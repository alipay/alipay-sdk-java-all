package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加密手机号触达用户接口
 *
 * @author auto create
 * @since 1.0, 2024-07-18 16:03:29
 */
public class AlipayCommerceAcommunicationMessageHashSendModel extends AlipayObject {

	private static final long serialVersionUID = 6769335831636844462L;

	/**
	 * 动态参数
	 */
	@ApiField("context")
	private String context;

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

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
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

}

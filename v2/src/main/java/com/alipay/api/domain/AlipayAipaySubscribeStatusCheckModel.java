package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅用户状态判断接口
 *
 * @author auto create
 * @since 1.0, 2025-09-03 19:11:41
 */
public class AlipayAipaySubscribeStatusCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8796425193973226925L;

	/**
	 * 区分智能体平台，本地部署为其他
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 订购计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 客户Id
	 */
	@ApiField("uuid")
	private String uuid;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}

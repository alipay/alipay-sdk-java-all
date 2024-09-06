package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 告警订阅
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:44:03
 */
public class AlarmSubscribe extends AlipayObject {

	private static final long serialVersionUID = 7433664986338469587L;

	/**
	 * webhook/通知组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 订阅ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 订阅类型
	 */
	@ApiListField("subscribe_types")
	@ApiField("string")
	private List<String> subscribeTypes;

	/**
	 * 订阅人(钉钉群聊机器人为绑定ID)
	 */
	@ApiField("subscriber")
	private String subscriber;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getSubscribeTypes() {
		return this.subscribeTypes;
	}
	public void setSubscribeTypes(List<String> subscribeTypes) {
		this.subscribeTypes = subscribeTypes;
	}

	public String getSubscriber() {
		return this.subscriber;
	}
	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}

}

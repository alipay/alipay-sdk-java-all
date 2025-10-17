package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店行业核验后业务结果同步
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:55:21
 */
public class AlipayOpenIotmbsHoteleventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7895596719346467514L;

	/**
	 * 事件类型相关的业务配置，参考接入sop，或者联系对接小二获取。
	 */
	@ApiField("event_config")
	private String eventConfig;

	/**
	 * 业务事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 用户刷脸后核身组件返回的foken
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 推送的消息点击后跳转链接
	 */
	@ApiField("page")
	private String page;

	/**
	 * push消息点击后跳转的支付宝小程序appid
	 */
	@ApiField("target_app_id")
	private String targetAppId;

	public String getEventConfig() {
		return this.eventConfig;
	}
	public void setEventConfig(String eventConfig) {
		this.eventConfig = eventConfig;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getTargetAppId() {
		return this.targetAppId;
	}
	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

}

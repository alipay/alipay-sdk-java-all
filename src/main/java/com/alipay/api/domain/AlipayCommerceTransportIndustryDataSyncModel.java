package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行行业数据同步接口
 *
 * @author auto create
 * @since 1.0, 2021-12-28 16:34:59
 */
public class AlipayCommerceTransportIndustryDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2635568833431749641L;

	/**
	 * 数据请求体，不包含用户信息。
	 */
	@ApiField("sync_content")
	private String syncContent;

	/**
	 * 数据同步事件类型
	 */
	@ApiField("sync_event")
	private String syncEvent;

	/**
	 * 数据请求场景
	 */
	@ApiField("sync_scene")
	private String syncScene;

	/**
	 * 支持商户接入此业务的系统服务商id
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getSyncContent() {
		return this.syncContent;
	}
	public void setSyncContent(String syncContent) {
		this.syncContent = syncContent;
	}

	public String getSyncEvent() {
		return this.syncEvent;
	}
	public void setSyncEvent(String syncEvent) {
		this.syncEvent = syncEvent;
	}

	public String getSyncScene() {
		return this.syncScene;
	}
	public void setSyncScene(String syncScene) {
		this.syncScene = syncScene;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}

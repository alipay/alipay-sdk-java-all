package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备同步消息体
 *
 * @author auto create
 * @since 1.0, 2020-01-09 11:00:40
 */
public class DeviceSyncPayload extends AlipayObject {

	private static final long serialVersionUID = 2115759452779278434L;

	/**
	 * 触发行为:绑定、解绑、变更等
	 */
	@ApiField("action")
	private String action;

	/**
	 * 智能设备唯一ID
	 */
	@ApiField("device_id")
	private String deviceId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息通知消息体
 *
 * @author auto create
 * @since 1.0, 2020-01-09 11:00:29
 */
public class DevicePushPayload extends AlipayObject {

	private static final long serialVersionUID = 7654843585348217211L;

	/**
	 * 设备唯一ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 消息通知数据模型
	 */
	@ApiField("notify_params")
	private String notifyParams;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getNotifyParams() {
		return this.notifyParams;
	}
	public void setNotifyParams(String notifyParams) {
		this.notifyParams = notifyParams;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}

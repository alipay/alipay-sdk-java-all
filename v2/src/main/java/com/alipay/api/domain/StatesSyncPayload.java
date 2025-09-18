package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 状态同步请求payload
 *
 * @author auto create
 * @since 1.0, 2020-01-09 11:01:04
 */
public class StatesSyncPayload extends AlipayObject {

	private static final long serialVersionUID = 1685481574128311766L;

	/**
	 * 智能设备唯一ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 是否在线
	 */
	@ApiField("online")
	private Boolean online;

	/**
	 * 状态信息Json串
	 */
	@ApiField("states")
	private String states;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Boolean getOnline() {
		return this.online;
	}
	public void setOnline(Boolean online) {
		this.online = online;
	}

	public String getStates() {
		return this.states;
	}
	public void setStates(String states) {
		this.states = states;
	}

}

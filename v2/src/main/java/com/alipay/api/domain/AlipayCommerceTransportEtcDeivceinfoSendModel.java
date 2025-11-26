package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC设备信息变更推送
 *
 * @author auto create
 * @since 1.0, 2025-07-03 17:04:45
 */
public class AlipayCommerceTransportEtcDeivceinfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 6441233429297887146L;

	/**
	 * 设备变更信息
	 */
	@ApiField("device_info")
	private EtcDeviceMsgInfo deviceInfo;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	public EtcDeviceMsgInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(EtcDeviceMsgInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC设备信息变更推送
 *
 * @author auto create
 * @since 1.0, 2024-05-21 11:51:09
 */
public class AlipayCommerceTransportEtcDeivceinfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 8877161181934171977L;

	/**
	 * 设备变更信息
	 */
	@ApiField("device_info")
	private EtcDeviceMsgInfo deviceInfo;

	public EtcDeviceMsgInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(EtcDeviceMsgInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

}

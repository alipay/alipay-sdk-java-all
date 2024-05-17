package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC设备信息变更推送
 *
 * @author auto create
 * @since 1.0, 2024-05-15 15:57:03
 */
public class AlipayCommerceTransportEtcDeivceinfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 7727996152217134346L;

	/**
	 * 设备信息
	 */
	@ApiField("device_info")
	private EtcDeviceInfo deviceInfo;

	public EtcDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(EtcDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

}

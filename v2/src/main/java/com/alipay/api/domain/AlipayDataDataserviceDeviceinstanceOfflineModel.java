package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下屏幕解绑
 *
 * @author auto create
 * @since 1.0, 2022-11-11 10:56:46
 */
public class AlipayDataDataserviceDeviceinstanceOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4653412377895999663L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 设备唯一编号
	 */
	@ApiField("device_instance_id")
	private String deviceInstanceId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getDeviceInstanceId() {
		return this.deviceInstanceId;
	}
	public void setDeviceInstanceId(String deviceInstanceId) {
		this.deviceInstanceId = deviceInstanceId;
	}

}

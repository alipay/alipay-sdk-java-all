package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备删除
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:58:52
 */
public class AlipayCommercePropertyDeviceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5615441759431376755L;

	/**
	 * device_id及out_device_id二选一，同时填写时以device_id为准。
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * device_id及out_device_id二选一，同时填写时以device_id为准。
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOutDeviceId() {
		return this.outDeviceId;
	}
	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

}

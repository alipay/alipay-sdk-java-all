package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2018-07-14 11:10:03
 */
public class DeviceResultInfo extends AlipayObject {

	private static final long serialVersionUID = 8876946747285567637L;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 业务数据类型
	 */
	@ApiField("device_label")
	private String deviceLabel;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceLabel() {
		return this.deviceLabel;
	}
	public void setDeviceLabel(String deviceLabel) {
		this.deviceLabel = deviceLabel;
	}

}

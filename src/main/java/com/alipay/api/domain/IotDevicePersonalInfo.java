package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户设备的个性化信息
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:29
 */
public class IotDevicePersonalInfo extends AlipayObject {

	private static final long serialVersionUID = 5796956169617682319L;

	/**
	 * 协议服务商用于唯一标识该设备的设备id(协议服务商定义)
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备备注
	 */
	@ApiField("remark")
	private String remark;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}

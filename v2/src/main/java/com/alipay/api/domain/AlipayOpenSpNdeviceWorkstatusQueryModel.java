package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备作业状态查询
 *
 * @author auto create
 * @since 1.0, 2025-04-30 11:35:23
 */
public class AlipayOpenSpNdeviceWorkstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4173615478222816284L;

	/**
	 * 碰一下设备SN标识
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备类型，主要描述当前碰一下设备类型，如N6E
	 */
	@ApiField("device_type")
	private String deviceType;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

}

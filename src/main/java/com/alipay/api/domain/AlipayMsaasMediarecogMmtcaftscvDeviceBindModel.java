package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉货柜产品化设备注册
 *
 * @author auto create
 * @since 1.0, 2020-04-28 15:17:11
 */
public class AlipayMsaasMediarecogMmtcaftscvDeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 6721846179124849295L;

	/**
	 * IOT统一设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备所属商户pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户设备terminal id
	 */
	@ApiField("isv_tid")
	private String isvTid;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getIsvTid() {
		return this.isvTid;
	}
	public void setIsvTid(String isvTid) {
		this.isvTid = isvTid;
	}

}

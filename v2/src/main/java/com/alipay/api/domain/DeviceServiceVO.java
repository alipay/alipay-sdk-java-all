package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务数据模型
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:34:42
 */
public class DeviceServiceVO extends AlipayObject {

	private static final long serialVersionUID = 1224981829843883253L;

	/**
	 * 拥有服务的设备基础信息
	 */
	@ApiField("device_service_base")
	private DeviceServiceBaseVO deviceServiceBase;

	/**
	 * 如果拥有服务的设备为间联子设备，则这里会带上网关设备信息
	 */
	@ApiField("parent_base")
	private DeviceServiceBaseVO parentBase;

	/**
	 * 服务模型key
	 */
	@ApiField("service_key")
	private String serviceKey;

	/**
	 * 服务模型内部版本号
	 */
	@ApiField("version_no")
	private Long versionNo;

	public DeviceServiceBaseVO getDeviceServiceBase() {
		return this.deviceServiceBase;
	}
	public void setDeviceServiceBase(DeviceServiceBaseVO deviceServiceBase) {
		this.deviceServiceBase = deviceServiceBase;
	}

	public DeviceServiceBaseVO getParentBase() {
		return this.parentBase;
	}
	public void setParentBase(DeviceServiceBaseVO parentBase) {
		this.parentBase = parentBase;
	}

	public String getServiceKey() {
		return this.serviceKey;
	}
	public void setServiceKey(String serviceKey) {
		this.serviceKey = serviceKey;
	}

	public Long getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(Long versionNo) {
		this.versionNo = versionNo;
	}

}

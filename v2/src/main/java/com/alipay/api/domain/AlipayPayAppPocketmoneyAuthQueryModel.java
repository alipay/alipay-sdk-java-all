package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零花钱授权查询
 *
 * @author auto create
 * @since 1.0, 2024-11-19 19:56:53
 */
public class AlipayPayAppPocketmoneyAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4136554886588392612L;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 额外的设备ID
	 */
	@ApiField("extra_device_id")
	private String extraDeviceId;

	/**
	 * 厂商家长ID
	 */
	@ApiField("vendor_parent_id")
	private String vendorParentId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExtraDeviceId() {
		return this.extraDeviceId;
	}
	public void setExtraDeviceId(String extraDeviceId) {
		this.extraDeviceId = extraDeviceId;
	}

	public String getVendorParentId() {
		return this.vendorParentId;
	}
	public void setVendorParentId(String vendorParentId) {
		this.vendorParentId = vendorParentId;
	}

}

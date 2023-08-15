package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零花钱授权查询
 *
 * @author auto create
 * @since 1.0, 2022-09-29 10:34:49
 */
public class AlipayPayAppPocketmoneyAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4782747416251767463L;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

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

	public String getVendorParentId() {
		return this.vendorParentId;
	}
	public void setVendorParentId(String vendorParentId) {
		this.vendorParentId = vendorParentId;
	}

}

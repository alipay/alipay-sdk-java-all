package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零花钱解除授权
 *
 * @author auto create
 * @since 1.0, 2025-04-09 11:04:10
 */
public class AlipayPayAppPocketmoneyAuthExpireModel extends AlipayObject {

	private static final long serialVersionUID = 5354612277762332518L;

	/**
	 * 设备号，openWatchId
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 兼容设备号，openId
	 */
	@ApiField("extra_device_id")
	private String extraDeviceId;

	/**
	 * 厂商名称
	 */
	@ApiField("solution_vendor")
	private String solutionVendor;

	/**
	 * 厂商管理员id
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

	public String getSolutionVendor() {
		return this.solutionVendor;
	}
	public void setSolutionVendor(String solutionVendor) {
		this.solutionVendor = solutionVendor;
	}

	public String getVendorParentId() {
		return this.vendorParentId;
	}
	public void setVendorParentId(String vendorParentId) {
		this.vendorParentId = vendorParentId;
	}

}

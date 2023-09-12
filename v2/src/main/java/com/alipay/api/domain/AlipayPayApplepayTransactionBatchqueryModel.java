package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付记录列表
 *
 * @author auto create
 * @since 1.0, 2022-11-03 15:10:32
 */
public class AlipayPayApplepayTransactionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1818368791361238883L;

	/**
	 * 拉取结果权限authToken
	 */
	@ApiField("authorization")
	private String authorization;

	/**
	 * 设备id
	 */
	@ApiField("device_identifier")
	private String deviceIdentifier;

	/**
	 * 卡id
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * 毫秒级时间戳
	 */
	@ApiField("tag")
	private String tag;

	public String getAuthorization() {
		return this.authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getDeviceIdentifier() {
		return this.deviceIdentifier;
	}
	public void setDeviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

}

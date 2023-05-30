package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay卡状态对象
 *
 * @author auto create
 * @since 1.0, 2020-03-31 13:48:07
 */
public class OpenApiPassStatus extends AlipayObject {

	private static final long serialVersionUID = 2653739136824882338L;

	/**
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * 卡状态
	 */
	@ApiField("state")
	private String state;

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}

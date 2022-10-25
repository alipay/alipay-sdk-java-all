package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay的easy开卡OTP发送
 *
 * @author auto create
 * @since 1.0, 2020-05-29 10:25:04
 */
public class AlipayUserApplepayOtpSendModel extends AlipayObject {

	private static final long serialVersionUID = 3532932634452893915L;

	/**
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * 校验方法标识
	 */
	@ApiField("resolution_method_identifier")
	private String resolutionMethodIdentifier;

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

	public String getResolutionMethodIdentifier() {
		return this.resolutionMethodIdentifier;
	}
	public void setResolutionMethodIdentifier(String resolutionMethodIdentifier) {
		this.resolutionMethodIdentifier = resolutionMethodIdentifier;
	}

}

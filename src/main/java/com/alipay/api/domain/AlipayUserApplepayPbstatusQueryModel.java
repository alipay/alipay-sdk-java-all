package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询卡状态
 *
 * @author auto create
 * @since 1.0, 2020-03-31 13:48:48
 */
public class AlipayUserApplepayPbstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3813274771299825291L;

	/**
	 * 设备接受语言
	 */
	@ApiField("device_accept_language")
	private String deviceAcceptLanguage;

	/**
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * 卡的用户id(由固定前缀+支付宝用户id组成)
	 */
	@ApiField("reference_identifier")
	private String referenceIdentifier;

	public String getDeviceAcceptLanguage() {
		return this.deviceAcceptLanguage;
	}
	public void setDeviceAcceptLanguage(String deviceAcceptLanguage) {
		this.deviceAcceptLanguage = deviceAcceptLanguage;
	}

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

	public String getReferenceIdentifier() {
		return this.referenceIdentifier;
	}
	public void setReferenceIdentifier(String referenceIdentifier) {
		this.referenceIdentifier = referenceIdentifier;
	}

}

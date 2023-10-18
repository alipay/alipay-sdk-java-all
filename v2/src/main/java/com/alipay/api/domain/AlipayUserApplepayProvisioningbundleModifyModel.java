package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管理卡片
 *
 * @author auto create
 * @since 1.0, 2020-05-29 10:26:48
 */
public class AlipayUserApplepayProvisioningbundleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3648325969328768995L;

	/**
	 * 管理动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * otp的值
	 */
	@ApiField("otp_value")
	private String otpValue;

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

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getOtpValue() {
		return this.otpValue;
	}
	public void setOtpValue(String otpValue) {
		this.otpValue = otpValue;
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

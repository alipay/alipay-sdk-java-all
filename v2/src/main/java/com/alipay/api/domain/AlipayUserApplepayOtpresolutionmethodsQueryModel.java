package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay easy开卡OTP校验方法查询
 *
 * @author auto create
 * @since 1.0, 2020-05-29 10:25:32
 */
public class AlipayUserApplepayOtpresolutionmethodsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3243334544473925243L;

	/**
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	public String getProvisioningBundleIdentifier() {
		return this.provisioningBundleIdentifier;
	}
	public void setProvisioningBundleIdentifier(String provisioningBundleIdentifier) {
		this.provisioningBundleIdentifier = provisioningBundleIdentifier;
	}

}

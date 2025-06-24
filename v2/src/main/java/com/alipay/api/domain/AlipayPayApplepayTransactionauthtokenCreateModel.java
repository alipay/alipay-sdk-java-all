package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 注册拉取支付结果的权限authToken
 *
 * @author auto create
 * @since 1.0, 2022-11-03 15:10:21
 */
public class AlipayPayApplepayTransactionauthtokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5568755735866998642L;

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
	 * 卡id列表，与卡id两者不能同时为空
	 */
	@ApiListField("provisioning_bundle_identifiers")
	@ApiField("string")
	private List<String> provisioningBundleIdentifiers;

	/**
	 * 推送通知给wagu设备的token
	 */
	@ApiField("push_token")
	private String pushToken;

	/**
	 * uid
	 */
	@ApiField("reference_identifier")
	private String referenceIdentifier;

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

	public List<String> getProvisioningBundleIdentifiers() {
		return this.provisioningBundleIdentifiers;
	}
	public void setProvisioningBundleIdentifiers(List<String> provisioningBundleIdentifiers) {
		this.provisioningBundleIdentifiers = provisioningBundleIdentifiers;
	}

	public String getPushToken() {
		return this.pushToken;
	}
	public void setPushToken(String pushToken) {
		this.pushToken = pushToken;
	}

	public String getReferenceIdentifier() {
		return this.referenceIdentifier;
	}
	public void setReferenceIdentifier(String referenceIdentifier) {
		this.referenceIdentifier = referenceIdentifier;
	}

}

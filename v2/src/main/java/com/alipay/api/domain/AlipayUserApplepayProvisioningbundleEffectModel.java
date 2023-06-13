package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wagu激活卡片接口
 *
 * @author auto create
 * @since 1.0, 2020-05-29 10:24:09
 */
public class AlipayUserApplepayProvisioningbundleEffectModel extends AlipayObject {

	private static final long serialVersionUID = 1491457476844312733L;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

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

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
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

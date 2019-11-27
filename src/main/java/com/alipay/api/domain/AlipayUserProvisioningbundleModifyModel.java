package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管理卡片
 *
 * @author auto create
 * @since 1.0, 2019-11-12 11:54:17
 */
public class AlipayUserProvisioningbundleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8551258955114442775L;

	/**
	 * 暂无
	 */
	@ApiField("action")
	private String action;

	/**
	 * 暂无
	 */
	@ApiField("provisioning_bundle_identifier")
	private String provisioningBundleIdentifier;

	/**
	 * 暂无
	 */
	@ApiField("reference_identifier")
	private String referenceIdentifier;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
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

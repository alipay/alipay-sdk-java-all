package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体退回开发
 *
 * @author auto create
 * @since 1.0, 2025-06-17 11:27:30
 */
public class AlipayOpenAgentVersionAuditedCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7131328935552443115L;

	/**
	 * 智能体版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 智能体投放的客户端类型。支持如下客户端：支小宝、web服务
	 */
	@ApiField("bundle_id")
	private String bundleId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

}

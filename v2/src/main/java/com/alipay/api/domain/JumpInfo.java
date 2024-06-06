package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跳转支付信息
 *
 * @author auto create
 * @since 1.0, 2024-04-12 15:15:53
 */
public class JumpInfo extends AlipayObject {

	private static final long serialVersionUID = 7145435181122757542L;

	/**
	 * 安卓系统的package名称。注意：必须是安卓系统才有
	 */
	@ApiField("app_identifier")
	private String appIdentifier;

	/**
	 * 用于推进支付流程的 Android App Links 或 iOS Universal Links。
	 */
	@ApiField("applink_url")
	private String applinkUrl;

	/**
	 * HTTPS 地址的 URL，用于同一个浏览器页面跳转至支付方式页面。
	 */
	@ApiField("normal_url")
	private String normalUrl;

	/**
	 * 用于打开支付方式 app 的 scheme URL。
	 */
	@ApiField("scheme_url")
	private String schemeUrl;

	public String getAppIdentifier() {
		return this.appIdentifier;
	}
	public void setAppIdentifier(String appIdentifier) {
		this.appIdentifier = appIdentifier;
	}

	public String getApplinkUrl() {
		return this.applinkUrl;
	}
	public void setApplinkUrl(String applinkUrl) {
		this.applinkUrl = applinkUrl;
	}

	public String getNormalUrl() {
		return this.normalUrl;
	}
	public void setNormalUrl(String normalUrl) {
		this.normalUrl = normalUrl;
	}

	public String getSchemeUrl() {
		return this.schemeUrl;
	}
	public void setSchemeUrl(String schemeUrl) {
		this.schemeUrl = schemeUrl;
	}

}

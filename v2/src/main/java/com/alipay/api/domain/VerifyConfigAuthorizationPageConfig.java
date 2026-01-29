package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权页面配置
 *
 * @author auto create
 * @since 1.0, 2026-01-19 16:47:43
 */
public class VerifyConfigAuthorizationPageConfig extends AlipayObject {

	private static final long serialVersionUID = 6315948397188493972L;

	/**
	 * 授权logoUrl
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 授权主标题
	 */
	@ApiField("main_title")
	private String mainTitle;

	/**
	 * 是否校验间隔限制 -1代表不限制，正数代表限制，单位秒
	 */
	@ApiField("verify_interval_limit")
	private String verifyIntervalLimit;

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMainTitle() {
		return this.mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getVerifyIntervalLimit() {
		return this.verifyIntervalLimit;
	}
	public void setVerifyIntervalLimit(String verifyIntervalLimit) {
		this.verifyIntervalLimit = verifyIntervalLimit;
	}

}

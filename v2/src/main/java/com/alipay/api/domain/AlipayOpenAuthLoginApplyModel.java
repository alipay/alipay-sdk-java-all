package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方信登支付宝
 *
 * @author auto create
 * @since 1.0, 2022-05-13 17:16:38
 */
public class AlipayOpenAuthLoginApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2498834342397964277L;

	/**
	 * 当前登录调用方平台的开发者登录渠道，如阿里云允许用阿里云账号、淘宝账号、支付宝账号、1688账号、钉钉账号、新浪账号登录，可选值有：aliyun、taobao、alipay、dingtalk、1688、sina
	 */
	@ApiField("login_channel")
	private String loginChannel;

	/**
	 * 第三方登录来源
	 */
	@ApiField("sign_from")
	private String signFrom;

	/**
	 * 信登后跳转的目标地址
	 */
	@ApiField("target_url")
	private String targetUrl;

	public String getLoginChannel() {
		return this.loginChannel;
	}
	public void setLoginChannel(String loginChannel) {
		this.loginChannel = loginChannel;
	}

	public String getSignFrom() {
		return this.signFrom;
	}
	public void setSignFrom(String signFrom) {
		this.signFrom = signFrom;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

}

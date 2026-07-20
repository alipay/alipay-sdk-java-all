package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扁鹊跳链配置详情
 *
 * @author auto create
 * @since 1.0, 2026-06-23 13:38:31
 */
public class BianqueJumpChainConfig extends AlipayObject {

	private static final long serialVersionUID = 3643246667837296379L;

	/**
	 * 应用key
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 跳链
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

}

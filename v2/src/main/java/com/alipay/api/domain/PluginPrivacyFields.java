package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方插件信息
 *
 * @author auto create
 * @since 1.0, 2026-07-20 09:58:53
 */
public class PluginPrivacyFields extends AlipayObject {

	private static final long serialVersionUID = 4547924538147517725L;

	/**
	 * 插件所需的隐私权限
	 */
	@ApiField("code")
	private String code;

	/**
	 * 插件所需隐私字段名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 插件名称
	 */
	@ApiField("plugin_name")
	private String pluginName;

	/**
	 * 插件提供者的名称
	 */
	@ApiField("plugin_provider_name")
	private String pluginProviderName;

	/**
	 * 让用户理解为什么需要此插件及权限
	 */
	@ApiField("purpose")
	private String purpose;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPluginName() {
		return this.pluginName;
	}
	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public String getPluginProviderName() {
		return this.pluginProviderName;
	}
	public void setPluginProviderName(String pluginProviderName) {
		this.pluginProviderName = pluginProviderName;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}

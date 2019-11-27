package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.pluginpackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-03 18:53:48
 */
public class AlipayOpenMiniInnerversionPluginpackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5433654269221515632L;

	/** 
	 * 插件的唯一标识
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/** 
	 * 插件的plugin包CDN地址
	 */
	@ApiField("plugin_url")
	private String pluginUrl;

	/** 
	 * 插件的版本号，该版本号为面向开发者的三段式版本号。
	 */
	@ApiField("plugin_version")
	private String pluginVersion;

	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}
	public String getPluginId( ) {
		return this.pluginId;
	}

	public void setPluginUrl(String pluginUrl) {
		this.pluginUrl = pluginUrl;
	}
	public String getPluginUrl( ) {
		return this.pluginUrl;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}
	public String getPluginVersion( ) {
		return this.pluginVersion;
	}

}

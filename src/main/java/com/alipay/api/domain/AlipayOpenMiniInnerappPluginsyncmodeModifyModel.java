package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改插件继承模式
 *
 * @author auto create
 * @since 1.0, 2021-11-08 19:10:21
 */
public class AlipayOpenMiniInnerappPluginsyncmodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1379597528859664728L;

	/**
	 * 来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序应用 ID，
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 插件id
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 模式，SYNC/NONE
	 */
	@ApiField("sync_mode")
	private String syncMode;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getSyncMode() {
		return this.syncMode;
	}
	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}

}

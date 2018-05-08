package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端小程序上架
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:13:58
 */
public class AlipayOpenMiniInnerversionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 1346442179712667562L;

	/**
	 * 下架版本
	 */
	@ApiField("app_offline_version")
	private String appOfflineVersion;

	/**
	 * 上架版本
	 */
	@ApiField("app_online_version")
	private String appOnlineVersion;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppOfflineVersion() {
		return this.appOfflineVersion;
	}
	public void setAppOfflineVersion(String appOfflineVersion) {
		this.appOfflineVersion = appOfflineVersion;
	}

	public String getAppOnlineVersion() {
		return this.appOnlineVersion;
	}
	public void setAppOnlineVersion(String appOnlineVersion) {
		this.appOnlineVersion = appOnlineVersion;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

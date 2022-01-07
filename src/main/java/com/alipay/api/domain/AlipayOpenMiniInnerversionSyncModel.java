package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序包信息推送
 *
 * @author auto create
 * @since 1.0, 2020-02-13 23:50:12
 */
public class AlipayOpenMiniInnerversionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7521931227445761269L;

	/**
	 * 业务参数来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 推送的小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 操作人ID
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 同送方式
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

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

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}

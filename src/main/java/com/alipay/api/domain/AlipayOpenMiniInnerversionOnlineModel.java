package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端小程序上架
 *
 * @author auto create
 * @since 1.0, 2019-05-06 10:47:36
 */
public class AlipayOpenMiniInnerversionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 5413866171332257718L;

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
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 租户code，alipay or taobao
	 */
	@ApiField("inst_code")
	private String instCode;

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

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

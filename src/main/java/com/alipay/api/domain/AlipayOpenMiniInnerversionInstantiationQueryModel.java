package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序实例化关系查询
 *
 * @author auto create
 * @since 1.0, 2019-11-13 17:12:57
 */
public class AlipayOpenMiniInnerversionInstantiationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3791112829112618663L;

	/**
	 * 来源，需要申请
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 实例化小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序appId，仅支持普通小程序、门店小程序
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

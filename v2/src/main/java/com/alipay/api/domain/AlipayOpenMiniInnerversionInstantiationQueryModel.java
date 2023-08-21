package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序实例化关系查询
 *
 * @author auto create
 * @since 1.0, 2021-08-09 11:27:16
 */
public class AlipayOpenMiniInnerversionInstantiationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1184265485176141513L;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
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
	 * 小程序ID，特殊场景专用，普通业务方无需关注该参数。
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

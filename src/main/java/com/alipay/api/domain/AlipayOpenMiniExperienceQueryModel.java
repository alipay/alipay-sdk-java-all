package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序体验版轮询接口
 *
 * @author auto create
 * @since 1.0, 2019-11-13 16:51:36
 */
public class AlipayOpenMiniExperienceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5198673854877116455L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序客户端类型，默认为支付宝端。支付宝端：com.alipay.alipaywallet,DINGDING端：com.alibaba.android.rimet,高德端:com.amap.app,天猫精灵端:com.alibaba.ailabs.genie.webapps,支付宝IOT:com.alipay.iot.xpaas
	 */
	@ApiField("bundle_id")
	private String bundleId;

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

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序生成体验版
 *
 * @author auto create
 * @since 1.0, 2022-12-02 18:02:24
 */
public class AlipayOpenMiniExperienceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4645264361876186124L;

	/**
	 * 商家小程序版本号。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序客户端类型，默认为支付宝端。支持如下客户端：
com.alipay.alipaywallet：支付宝端；
com.alibaba.android.rimet：DINGDING端；
com.amap.app：高德端；
com.alibaba.ailabs.genie.webapps：天猫精灵端；
com.alipay.iot.xpaas：支付宝IoT端。
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

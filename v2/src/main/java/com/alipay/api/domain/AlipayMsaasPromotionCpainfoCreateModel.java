package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 此api为了让第三方渠道端调用 ，记录他们的调用数据，然后根据数据比对进行计费功能
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:38:40
 */
public class AlipayMsaasPromotionCpainfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7248459543688611718L;

	/**
	 * 唯一应用
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 应用版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * bundle_id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 调试数据
	 */
	@ApiField("debug")
	private String debug;

	/**
	 * 扩展信息
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * IDFA
	 */
	@ApiField("idfa")
	private String idfa;

	/**
	 * IOS版本
	 */
	@ApiField("ios_version")
	private String iosVersion;

	/**
	 * MAC
	 */
	@ApiField("mac")
	private String mac;

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
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

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getDebug() {
		return this.debug;
	}
	public void setDebug(String debug) {
		this.debug = debug;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getIdfa() {
		return this.idfa;
	}
	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getIosVersion() {
		return this.iosVersion;
	}
	public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

}

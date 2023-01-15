package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本信息
 *
 * @author auto create
 * @since 1.0, 2019-10-31 11:18:51
 */
public class MiniVersionBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2336198526559838425L;

	/**
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序所属来源
	 */
	@ApiField("build_source")
	private String buildSource;

	/**
	 * com.alipay.alipaywallet:支付宝，com.amap.app:高德
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序开发者ID
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 小程序灰度值
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	/**
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序状态
	 */
	@ApiField("status")
	private String status;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBuildSource() {
		return this.buildSource;
	}
	public void setBuildSource(String buildSource) {
		this.buildSource = buildSource;
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

	public String getGrayStrategy() {
		return this.grayStrategy;
	}
	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

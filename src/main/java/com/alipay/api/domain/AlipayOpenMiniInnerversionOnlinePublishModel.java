package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路小程序上架
 *
 * @author auto create
 * @since 1.0, 2020-09-29 14:32:17
 */
public class AlipayOpenMiniInnerversionOnlinePublishModel extends AlipayObject {

	private static final long serialVersionUID = 5839819876535518263L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 否服务降级，如果降级，拉包策略如果端上有本地包，则使用本地包打开，同时异步下载新包，待下次打开则使用新包
	 */
	@ApiField("downgrade")
	private Boolean downgrade;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序所属PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * normal默认普通发布，high 高保发布
	 */
	@ApiField("release_type")
	private String releaseType;

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

	public Boolean getDowngrade() {
		return this.downgrade;
	}
	public void setDowngrade(Boolean downgrade) {
		this.downgrade = downgrade;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getReleaseType() {
		return this.releaseType;
	}
	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

}

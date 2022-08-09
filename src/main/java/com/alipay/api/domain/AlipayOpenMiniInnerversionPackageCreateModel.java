package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单独构建包信息
 *
 * @author auto create
 * @since 1.0, 2021-04-19 16:34:17
 */
public class AlipayOpenMiniInnerversionPackageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1881822594232376111L;

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
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 打包类型。预发包和覆盖率包
	 */
	@ApiField("package_type")
	private String packageType;

	/**
	 * pid. 伙伴链路（app_origin='HUOBAN'）时必填
	 */
	@ApiField("pid")
	private String pid;

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

	public String getPackageType() {
		return this.packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}

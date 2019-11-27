package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本直接创建(不经过构建，直接创建版本)
 *
 * @author auto create
 * @since 1.0, 2019-04-28 17:42:04
 */
public class AlipayOpenMiniInnerbuildedversionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5263937438787421317L;

	/**
	 * 已经完成构建的包地址
	 */
	@ApiField("build_pkg_url")
	private String buildPkgUrl;

	/**
	 * 源码包地址
	 */
	@ApiField("build_source_pkg_url")
	private String buildSourcePkgUrl;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 上传调试版的接入租户类型。
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序主入口
	 */
	@ApiField("main_url")
	private String mainUrl;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getBuildPkgUrl() {
		return this.buildPkgUrl;
	}
	public void setBuildPkgUrl(String buildPkgUrl) {
		this.buildPkgUrl = buildPkgUrl;
	}

	public String getBuildSourcePkgUrl() {
		return this.buildSourcePkgUrl;
	}
	public void setBuildSourcePkgUrl(String buildSourcePkgUrl) {
		this.buildSourcePkgUrl = buildSourcePkgUrl;
	}

	public String getBuildVersion() {
		return this.buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMainUrl() {
		return this.mainUrl;
	}
	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

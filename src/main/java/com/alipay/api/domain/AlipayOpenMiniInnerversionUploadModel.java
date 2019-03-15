package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建构建任务
 *
 * @author auto create
 * @since 1.0, 2018-12-17 19:24:42
 */
public class AlipayOpenMiniInnerversionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5327299284453638775L;

	/**
	 * IDE开发打包类型
	 */
	@ApiField("build_app_type")
	private String buildAppType;

	/**
	 * 扩展信息
	 */
	@ApiField("build_extra_info")
	private String buildExtraInfo;

	/**
	 * js api 权限文件
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 主入口
	 */
	@ApiField("build_main_url")
	private String buildMainUrl;

	/**
	 * 源码包MD5
	 */
	@ApiField("build_package_md_5")
	private String buildPackageMd5;

	/**
	 * 包名称
	 */
	@ApiField("build_package_name")
	private String buildPackageName;

	/**
	 * 小程序源码包
	 */
	@ApiField("build_package_stream")
	private String buildPackageStream;

	/**
	 * 打包平台扩展信息
	 */
	@ApiField("build_qcloud_info")
	private String buildQcloudInfo;

	/**
	 * 源码包大小
	 */
	@ApiField("build_source_pkg_size")
	private String buildSourcePkgSize;

	/**
	 * 源码包地址
	 */
	@ApiField("build_source_pkg_url")
	private String buildSourcePkgUrl;

	/**
	 * 子入口
	 */
	@ApiField("build_sub_url")
	private String buildSubUrl;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 多端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getBuildAppType() {
		return this.buildAppType;
	}
	public void setBuildAppType(String buildAppType) {
		this.buildAppType = buildAppType;
	}

	public String getBuildExtraInfo() {
		return this.buildExtraInfo;
	}
	public void setBuildExtraInfo(String buildExtraInfo) {
		this.buildExtraInfo = buildExtraInfo;
	}

	public String getBuildJsPermission() {
		return this.buildJsPermission;
	}
	public void setBuildJsPermission(String buildJsPermission) {
		this.buildJsPermission = buildJsPermission;
	}

	public String getBuildMainUrl() {
		return this.buildMainUrl;
	}
	public void setBuildMainUrl(String buildMainUrl) {
		this.buildMainUrl = buildMainUrl;
	}

	public String getBuildPackageMd5() {
		return this.buildPackageMd5;
	}
	public void setBuildPackageMd5(String buildPackageMd5) {
		this.buildPackageMd5 = buildPackageMd5;
	}

	public String getBuildPackageName() {
		return this.buildPackageName;
	}
	public void setBuildPackageName(String buildPackageName) {
		this.buildPackageName = buildPackageName;
	}

	public String getBuildPackageStream() {
		return this.buildPackageStream;
	}
	public void setBuildPackageStream(String buildPackageStream) {
		this.buildPackageStream = buildPackageStream;
	}

	public String getBuildQcloudInfo() {
		return this.buildQcloudInfo;
	}
	public void setBuildQcloudInfo(String buildQcloudInfo) {
		this.buildQcloudInfo = buildQcloudInfo;
	}

	public String getBuildSourcePkgSize() {
		return this.buildSourcePkgSize;
	}
	public void setBuildSourcePkgSize(String buildSourcePkgSize) {
		this.buildSourcePkgSize = buildSourcePkgSize;
	}

	public String getBuildSourcePkgUrl() {
		return this.buildSourcePkgUrl;
	}
	public void setBuildSourcePkgUrl(String buildSourcePkgUrl) {
		this.buildSourcePkgUrl = buildSourcePkgUrl;
	}

	public String getBuildSubUrl() {
		return this.buildSubUrl;
	}
	public void setBuildSubUrl(String buildSubUrl) {
		this.buildSubUrl = buildSubUrl;
	}

	public String getBuildVersion() {
		return this.buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

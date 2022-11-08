package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手淘小程序产物包免构建版本上传
 *
 * @author auto create
 * @since 1.0, 2022-01-17 21:44:56
 */
public class AlipayOpenMiniInnerversionNobuildUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3571544923923291344L;

	/**
	 * 扩展信息，比如adaptorName、tinycliVersion、tinycliName、import-module、allowPrecompile、extJson、allowInstallDependency、aggregationMainAppId，如果没有特殊要求，tinycliVersion版本请用最新的： https://registry.npm.alibaba-inc.com/@alipay/tiny-cli/huoban-prod
	 */
	@ApiField("build_extra_info")
	private String buildExtraInfo;

	/**
	 * jsapi权限文件
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 小程序页面主入口。/index.html#page/component/index，该值需要和extendInfo中的page参数保持一致
	 */
	@ApiField("build_main_url")
	private String buildMainUrl;

	/**
	 * 打包平台扩展信息
	 */
	@ApiField("build_qcloud_info")
	private String buildQcloudInfo;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 已经构建过的amr包大小，单位是字节，主要是给自行构建的场景使用
	 */
	@ApiField("builded_package_size")
	private String buildedPackageSize;

	/**
	 * 已经构建的包地址，目前主要自行构建的场景使用
	 */
	@ApiField("builded_package_url")
	private String buildedPackageUrl;

	/**
	 * 构建好的插件包amr大小
	 */
	@ApiField("builded_plugin_size")
	private String buildedPluginSize;

	/**
	 * 构建好的插件包地址
	 */
	@ApiField("builded_plugin_url")
	private String buildedPluginUrl;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundleId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 组件参数
	 */
	@ApiField("components")
	private String components;

	/**
	 * 上传调试版的接入租户类型
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 2.0已经构建过的amr包大小，单位是字节，主要是给自行构建的场景使用
	 */
	@ApiField("new_builded_package_size")
	private String newBuildedPackageSize;

	/**
	 * 2.0产物包地址
	 */
	@ApiField("new_builded_package_url")
	private String newBuildedPackageUrl;

	/**
	 * 构建好的插件包amr大小
	 */
	@ApiField("new_builded_plugin_size")
	private String newBuildedPluginSize;

	/**
	 * 构建好的插件包地址
	 */
	@ApiField("new_builded_plugin_url")
	private String newBuildedPluginUrl;

	/**
	 * 小程序代码中引用的插件列表，包含插件id和插件版本信息，业务方需要自行解析源码包的app.json里面的plugins信息
	 */
	@ApiListField("plugin_refs")
	@ApiField("mini_app_plugin_reference")
	private List<MiniAppPluginReference> pluginRefs;

	/**
	 * 构建好的分包信息
	 */
	@ApiListField("sub_packages")
	@ApiField("sub_package_info")
	private List<SubPackageInfo> subPackages;

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

	public String getBuildQcloudInfo() {
		return this.buildQcloudInfo;
	}
	public void setBuildQcloudInfo(String buildQcloudInfo) {
		this.buildQcloudInfo = buildQcloudInfo;
	}

	public String getBuildVersion() {
		return this.buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getBuildedPackageSize() {
		return this.buildedPackageSize;
	}
	public void setBuildedPackageSize(String buildedPackageSize) {
		this.buildedPackageSize = buildedPackageSize;
	}

	public String getBuildedPackageUrl() {
		return this.buildedPackageUrl;
	}
	public void setBuildedPackageUrl(String buildedPackageUrl) {
		this.buildedPackageUrl = buildedPackageUrl;
	}

	public String getBuildedPluginSize() {
		return this.buildedPluginSize;
	}
	public void setBuildedPluginSize(String buildedPluginSize) {
		this.buildedPluginSize = buildedPluginSize;
	}

	public String getBuildedPluginUrl() {
		return this.buildedPluginUrl;
	}
	public void setBuildedPluginUrl(String buildedPluginUrl) {
		this.buildedPluginUrl = buildedPluginUrl;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getComponents() {
		return this.components;
	}
	public void setComponents(String components) {
		this.components = components;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getNewBuildedPackageSize() {
		return this.newBuildedPackageSize;
	}
	public void setNewBuildedPackageSize(String newBuildedPackageSize) {
		this.newBuildedPackageSize = newBuildedPackageSize;
	}

	public String getNewBuildedPackageUrl() {
		return this.newBuildedPackageUrl;
	}
	public void setNewBuildedPackageUrl(String newBuildedPackageUrl) {
		this.newBuildedPackageUrl = newBuildedPackageUrl;
	}

	public String getNewBuildedPluginSize() {
		return this.newBuildedPluginSize;
	}
	public void setNewBuildedPluginSize(String newBuildedPluginSize) {
		this.newBuildedPluginSize = newBuildedPluginSize;
	}

	public String getNewBuildedPluginUrl() {
		return this.newBuildedPluginUrl;
	}
	public void setNewBuildedPluginUrl(String newBuildedPluginUrl) {
		this.newBuildedPluginUrl = newBuildedPluginUrl;
	}

	public List<MiniAppPluginReference> getPluginRefs() {
		return this.pluginRefs;
	}
	public void setPluginRefs(List<MiniAppPluginReference> pluginRefs) {
		this.pluginRefs = pluginRefs;
	}

	public List<SubPackageInfo> getSubPackages() {
		return this.subPackages;
	}
	public void setSubPackages(List<SubPackageInfo> subPackages) {
		this.subPackages = subPackages;
	}

}

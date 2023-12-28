package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多端小程序-真机预览接口
 *
 * @author auto create
 * @since 1.0, 2023-07-28 10:33:20
 */
public class AlipayOpenMiniInnerversionPreviewUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8249198521425133349L;

	/**
	 * 构建参数- JSAPI 权限文件, JSON 字符串
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 构建参数-IDE 构建好的包地址，如果是免加签场景该字段对应的是加签后的包地址
	 */
	@ApiField("build_pkg_url")
	private String buildPkgUrl;

	/**
	 * 构建参数-IDE 构建好的plugin包地址，小程序插件的有两个构建产物client包和plugin包，该场景下client包地址通过build_pkg_url传递，plugin包地址通过本参数传递
	 */
	@ApiField("build_plugin_url")
	private String buildPluginUrl;

	/**
	 * 包大小,免加签场景这里指加签包大小
	 */
	@ApiField("builded_package_size")
	private Long buildedPackageSize;

	/**
	 * 构建好的插件包大小，对应免加签场景是加签后的包地址大小
	 */
	@ApiField("builded_plugin_size")
	private Long buildedPluginSize;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 业务扩展属性
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

	/**
	 * 构建参数-IDE 构建好的appx2.0包地址，如果是免加签场景该字段对应的是加签后的包地址
	 */
	@ApiField("new_build_pkg_url")
	private String newBuildPkgUrl;

	/**
	 * 构建参数-IDE 
构建好的plugin包地址，小程序插件的有两个构建产物client包和plugin包，该场景下client包地址通过build_pkg_url传递，plugin包地址通过本参数传递
	 */
	@ApiField("new_build_plugin_url")
	private String newBuildPluginUrl;

	/**
	 * 包大小,免加签场景这里指加签包大小
	 */
	@ApiField("new_builded_package_size")
	private Long newBuildedPackageSize;

	/**
	 * appx2.0构建好的插件包大小,免加签场景是加签后的包大小
	 */
	@ApiField("new_builded_plugin_size")
	private Long newBuildedPluginSize;

	/**
	 * 是否免加签，当true的时候代表不需要加签即传过来的包地址是加签好的地址
	 */
	@ApiField("no_sign")
	private Boolean noSign;

	/**
	 * 小程序代码中引用的插件列表，包含插件id和插件版本信息
	 */
	@ApiListField("plugin_refs")
	@ApiField("mini_app_plugin_reference")
	private List<MiniAppPluginReference> pluginRefs;

	/**
	 * 预览类型，目前分为“DEBUG(调试版)、TRIAL(试用版)”
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 分包信息
	 */
	@ApiListField("sub_packages")
	@ApiField("sub_package")
	private List<SubPackage> subPackages;

	public String getBuildJsPermission() {
		return this.buildJsPermission;
	}
	public void setBuildJsPermission(String buildJsPermission) {
		this.buildJsPermission = buildJsPermission;
	}

	public String getBuildPkgUrl() {
		return this.buildPkgUrl;
	}
	public void setBuildPkgUrl(String buildPkgUrl) {
		this.buildPkgUrl = buildPkgUrl;
	}

	public String getBuildPluginUrl() {
		return this.buildPluginUrl;
	}
	public void setBuildPluginUrl(String buildPluginUrl) {
		this.buildPluginUrl = buildPluginUrl;
	}

	public Long getBuildedPackageSize() {
		return this.buildedPackageSize;
	}
	public void setBuildedPackageSize(Long buildedPackageSize) {
		this.buildedPackageSize = buildedPackageSize;
	}

	public Long getBuildedPluginSize() {
		return this.buildedPluginSize;
	}
	public void setBuildedPluginSize(Long buildedPluginSize) {
		this.buildedPluginSize = buildedPluginSize;
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

	public String getNewBuildPkgUrl() {
		return this.newBuildPkgUrl;
	}
	public void setNewBuildPkgUrl(String newBuildPkgUrl) {
		this.newBuildPkgUrl = newBuildPkgUrl;
	}

	public String getNewBuildPluginUrl() {
		return this.newBuildPluginUrl;
	}
	public void setNewBuildPluginUrl(String newBuildPluginUrl) {
		this.newBuildPluginUrl = newBuildPluginUrl;
	}

	public Long getNewBuildedPackageSize() {
		return this.newBuildedPackageSize;
	}
	public void setNewBuildedPackageSize(Long newBuildedPackageSize) {
		this.newBuildedPackageSize = newBuildedPackageSize;
	}

	public Long getNewBuildedPluginSize() {
		return this.newBuildedPluginSize;
	}
	public void setNewBuildedPluginSize(Long newBuildedPluginSize) {
		this.newBuildedPluginSize = newBuildedPluginSize;
	}

	public Boolean getNoSign() {
		return this.noSign;
	}
	public void setNoSign(Boolean noSign) {
		this.noSign = noSign;
	}

	public List<MiniAppPluginReference> getPluginRefs() {
		return this.pluginRefs;
	}
	public void setPluginRefs(List<MiniAppPluginReference> pluginRefs) {
		this.pluginRefs = pluginRefs;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<SubPackage> getSubPackages() {
		return this.subPackages;
	}
	public void setSubPackages(List<SubPackage> subPackages) {
		this.subPackages = subPackages;
	}

}

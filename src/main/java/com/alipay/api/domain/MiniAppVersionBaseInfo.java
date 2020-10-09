package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 版本模型
 *
 * @author auto create
 * @since 1.0, 2019-06-06 19:04:00
 */
public class MiniAppVersionBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 4496158625889566136L;

	/**
	 * 开发者版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 01 自创建
02 模板构建
	 */
	@ApiField("build_source")
	private String buildSource;

	/**
	 * 端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 版本描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 模板实例化小程序参数
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 灰度开始时间
	 */
	@ApiField("gray_start_time")
	private Date grayStartTime;

	/**
	 * 租户
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 下架时间
	 */
	@ApiField("offline_time")
	private Date offlineTime;

	/**
	 * 包地址
	 */
	@ApiField("package_url")
	private String packageUrl;

	/**
	 * 插件plugin包地址
	 */
	@ApiField("plugin_url")
	private String pluginUrl;

	/**
	 * 回滚时间
	 */
	@ApiField("rollback_time")
	private Date rollbackTime;

	/**
	 * 上架时间
	 */
	@ApiField("shelf_time")
	private Date shelfTime;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子状态
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 构建模板参数
	 */
	@ApiField("template_extra")
	private String templateExtra;

	/**
	 * 模板应用ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板版本
	 */
	@ApiField("template_version")
	private String templateVersion;

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

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGrayStartTime() {
		return this.grayStartTime;
	}
	public void setGrayStartTime(Date grayStartTime) {
		this.grayStartTime = grayStartTime;
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

	public Date getOfflineTime() {
		return this.offlineTime;
	}
	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}
	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
	}

	public String getPluginUrl() {
		return this.pluginUrl;
	}
	public void setPluginUrl(String pluginUrl) {
		this.pluginUrl = pluginUrl;
	}

	public Date getRollbackTime() {
		return this.rollbackTime;
	}
	public void setRollbackTime(Date rollbackTime) {
		this.rollbackTime = rollbackTime;
	}

	public Date getShelfTime() {
		return this.shelfTime;
	}
	public void setShelfTime(Date shelfTime) {
		this.shelfTime = shelfTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getTemplateExtra() {
		return this.templateExtra;
	}
	public void setTemplateExtra(String templateExtra) {
		this.templateExtra = templateExtra;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}

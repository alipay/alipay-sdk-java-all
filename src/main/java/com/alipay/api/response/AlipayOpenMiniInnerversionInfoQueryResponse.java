package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppPluginInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-20 17:42:25
 */
public class AlipayOpenMiniInnerversionInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7773957545395579233L;

	/** 
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/** 
	 * 版本构建类型
	 */
	@ApiField("build_source")
	private String buildSource;

	/** 
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/** 
	 * 版本创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 版本描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 实例化模板参数
	 */
	@ApiField("ext_json")
	private String extJson;

	/** 
	 * 版本更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 版本灰度时间
	 */
	@ApiField("gray_start_time")
	private Date grayStartTime;

	/** 
	 * 小程序灰度比例值
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 版本下架时间
	 */
	@ApiField("offline_time")
	private Date offlineTime;

	/** 
	 * 包地址
	 */
	@ApiField("package_url")
	private String packageUrl;

	/** 
	 * 引用插件信息
	 */
	@ApiListField("plugin_refs")
	@ApiField("mini_app_plugin_info")
	private List<MiniAppPluginInfo> pluginRefs;

	/** 
	 * 审核失败原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 版本回滚时间
	 */
	@ApiField("rollback_time")
	private Date rollbackTime;

	/** 
	 * 安全扫描结果
	 */
	@ApiField("scan_result")
	private String scanResult;

	/** 
	 * 小程序版本截图，多个截图以逗号隔开
	 */
	@ApiField("screen_shot_list")
	private String screenShotList;

	/** 
	 * 版本上架时间
	 */
	@ApiField("shelf_time")
	private Date shelfTime;

	/** 
	 * 源码包地址
	 */
	@ApiField("source_url")
	private String sourceUrl;

	/** 
	 * 版本状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 模板构建参数
	 */
	@ApiField("template_extra")
	private String templateExtra;

	/** 
	 * 模板版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppVersion( ) {
		return this.appVersion;
	}

	public void setBuildSource(String buildSource) {
		this.buildSource = buildSource;
	}
	public String getBuildSource( ) {
		return this.buildSource;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId( ) {
		return this.bundleId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}
	public String getExtJson( ) {
		return this.extJson;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGrayStartTime(Date grayStartTime) {
		this.grayStartTime = grayStartTime;
	}
	public Date getGrayStartTime( ) {
		return this.grayStartTime;
	}

	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}
	public String getGrayStrategy( ) {
		return this.grayStrategy;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}
	public Date getOfflineTime( ) {
		return this.offlineTime;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
	}
	public String getPackageUrl( ) {
		return this.packageUrl;
	}

	public void setPluginRefs(List<MiniAppPluginInfo> pluginRefs) {
		this.pluginRefs = pluginRefs;
	}
	public List<MiniAppPluginInfo> getPluginRefs( ) {
		return this.pluginRefs;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setRollbackTime(Date rollbackTime) {
		this.rollbackTime = rollbackTime;
	}
	public Date getRollbackTime( ) {
		return this.rollbackTime;
	}

	public void setScanResult(String scanResult) {
		this.scanResult = scanResult;
	}
	public String getScanResult( ) {
		return this.scanResult;
	}

	public void setScreenShotList(String screenShotList) {
		this.screenShotList = screenShotList;
	}
	public String getScreenShotList( ) {
		return this.screenShotList;
	}

	public void setShelfTime(Date shelfTime) {
		this.shelfTime = shelfTime;
	}
	public Date getShelfTime( ) {
		return this.shelfTime;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getSourceUrl( ) {
		return this.sourceUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateExtra(String templateExtra) {
		this.templateExtra = templateExtra;
	}
	public String getTemplateExtra( ) {
		return this.templateExtra;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}
	public String getTemplateVersion( ) {
		return this.templateVersion;
	}

}

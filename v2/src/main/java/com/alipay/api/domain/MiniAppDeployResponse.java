package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序发布模型
 *
 * @author auto create
 * @since 1.0, 2020-04-09 11:39:31
 */
public class MiniAppDeployResponse extends AlipayObject {

	private static final long serialVersionUID = 6227731563676732326L;

	/**
	 * 安卓最大版本号
	 */
	@ApiField("android_client_max")
	private String androidClientMax;

	/**
	 * 安卓最低版本号
	 */
	@ApiField("android_client_min")
	private String androidClientMin;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 发布版本
	 */
	@ApiField("deploy_version")
	private String deployVersion;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * iOS最大版本号
	 */
	@ApiField("ios_client_max")
	private String iosClientMax;

	/**
	 * iOS最小版本号
	 */
	@ApiField("ios_client_min")
	private String iosClientMin;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 包大小
	 */
	@ApiField("package_size")
	private String packageSize;

	/**
	 * 发布状态
    INVALID("INVALID", "非法"),
    INIT("INIT", "初始化状态"),
    PRE_ONLINE("PRE_ONLINE", "预发");
    GRAY("GRAY", "灰度"),
    ONLINE("ONLINE", "上架"),
    ABANDON("ABANDON", "废弃"),
	 */
	@ApiField("status")
	private String status;

	public String getAndroidClientMax() {
		return this.androidClientMax;
	}
	public void setAndroidClientMax(String androidClientMax) {
		this.androidClientMax = androidClientMax;
	}

	public String getAndroidClientMin() {
		return this.androidClientMin;
	}
	public void setAndroidClientMin(String androidClientMin) {
		this.androidClientMin = androidClientMin;
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

	public String getDeployVersion() {
		return this.deployVersion;
	}
	public void setDeployVersion(String deployVersion) {
		this.deployVersion = deployVersion;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIosClientMax() {
		return this.iosClientMax;
	}
	public void setIosClientMax(String iosClientMax) {
		this.iosClientMax = iosClientMax;
	}

	public String getIosClientMin() {
		return this.iosClientMin;
	}
	public void setIosClientMin(String iosClientMin) {
		this.iosClientMin = iosClientMin;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPackageSize() {
		return this.packageSize;
	}
	public void setPackageSize(String packageSize) {
		this.packageSize = packageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

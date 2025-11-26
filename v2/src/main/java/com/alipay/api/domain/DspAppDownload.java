package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用下载
 *
 * @author auto create
 * @since 1.0, 2024-05-14 14:17:49
 */
public class DspAppDownload extends AlipayObject {

	private static final long serialVersionUID = 7263624438638188362L;

	/**
	 * 应用下载扩展
	 */
	@ApiListField("app_download_ext_info")
	@ApiField("dsp_app_download_ext_info")
	private List<DspAppDownloadExtInfo> appDownloadExtInfo;

	/**
	 * 应用版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 应用包名
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 操作系统
	 */
	@ApiField("platform")
	private String platform;

	public List<DspAppDownloadExtInfo> getAppDownloadExtInfo() {
		return this.appDownloadExtInfo;
	}
	public void setAppDownloadExtInfo(List<DspAppDownloadExtInfo> appDownloadExtInfo) {
		this.appDownloadExtInfo = appDownloadExtInfo;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

}

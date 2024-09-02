package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpaas应用上架
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:58:02
 */
public class AlipayOpenBpaasAppPublishModel extends AlipayObject {

	private static final long serialVersionUID = 4293676733918293685L;

	/**
	 * 应用版本号, 要求为纯数字，如10.20.1.1等 必须4位
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * bpaas 应用id
	 */
	@ApiField("bpaas_app_id")
	private String bpaasAppId;

	/**
	 * 应用版本变更记录
	 */
	@ApiField("change_log")
	private String changeLog;

	/**
	 * 文件SHA256摘要信息
	 */
	@ApiField("file_digest")
	private String fileDigest;

	/**
	 * 文件MD5值
	 */
	@ApiField("file_md_5")
	private String fileMd5;

	/**
	 * 应用包文件大小
	 */
	@ApiField("package_file_size")
	private Long packageFileSize;

	/**
	 * 应用包下载地址，公开url
	 */
	@ApiField("scm_download_url")
	private String scmDownloadUrl;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBpaasAppId() {
		return this.bpaasAppId;
	}
	public void setBpaasAppId(String bpaasAppId) {
		this.bpaasAppId = bpaasAppId;
	}

	public String getChangeLog() {
		return this.changeLog;
	}
	public void setChangeLog(String changeLog) {
		this.changeLog = changeLog;
	}

	public String getFileDigest() {
		return this.fileDigest;
	}
	public void setFileDigest(String fileDigest) {
		this.fileDigest = fileDigest;
	}

	public String getFileMd5() {
		return this.fileMd5;
	}
	public void setFileMd5(String fileMd5) {
		this.fileMd5 = fileMd5;
	}

	public Long getPackageFileSize() {
		return this.packageFileSize;
	}
	public void setPackageFileSize(Long packageFileSize) {
		this.packageFileSize = packageFileSize;
	}

	public String getScmDownloadUrl() {
		return this.scmDownloadUrl;
	}
	public void setScmDownloadUrl(String scmDownloadUrl) {
		this.scmDownloadUrl = scmDownloadUrl;
	}

}

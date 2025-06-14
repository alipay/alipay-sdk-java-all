package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询OB制品信息结果DTO
 *
 * @author auto create
 * @since 1.0, 2025-04-09 16:56:05
 */
public class QueryObArtifactListDTO extends AlipayObject {

	private static final long serialVersionUID = 7695696448753227411L;

	/**
	 * 制品版本
	 */
	@ApiField("artifact_version")
	private String artifactVersion;

	/**
	 * 下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 制品名称
	 */
	@ApiField("fullname")
	private String fullname;

	/**
	 * 制品项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 制品大小
	 */
	@ApiField("size")
	private String size;

	/**
	 * md5值
	 */
	@ApiField("unique_data_key")
	private String uniqueDataKey;

	/**
	 * 制品使用类型
	 */
	@ApiField("use_type_str")
	private String useTypeStr;

	/**
	 * 制品版本tag字符串
	 */
	@ApiField("version_tag_str")
	private String versionTagStr;

	public String getArtifactVersion() {
		return this.artifactVersion;
	}
	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFullname() {
		return this.fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getUniqueDataKey() {
		return this.uniqueDataKey;
	}
	public void setUniqueDataKey(String uniqueDataKey) {
		this.uniqueDataKey = uniqueDataKey;
	}

	public String getUseTypeStr() {
		return this.useTypeStr;
	}
	public void setUseTypeStr(String useTypeStr) {
		this.useTypeStr = useTypeStr;
	}

	public String getVersionTagStr() {
		return this.versionTagStr;
	}
	public void setVersionTagStr(String versionTagStr) {
		this.versionTagStr = versionTagStr;
	}

}

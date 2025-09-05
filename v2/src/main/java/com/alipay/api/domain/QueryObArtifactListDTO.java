package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询OB制品信息结果DTO
 *
 * @author auto create
 * @since 1.0, 2025-06-19 15:44:02
 */
public class QueryObArtifactListDTO extends AlipayObject {

	private static final long serialVersionUID = 3788747777532129453L;

	/**
	 * 制品版本
	 */
	@ApiField("artifact_version")
	private String artifactVersion;

	/**
	 * OB制品产品ID
	 */
	@ApiField("boss_id")
	private Long bossId;

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

	public Long getBossId() {
		return this.bossId;
	}
	public void setBossId(Long bossId) {
		this.bossId = bossId;
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

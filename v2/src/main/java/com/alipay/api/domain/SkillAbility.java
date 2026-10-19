package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SKILL schema 信息
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class SkillAbility extends AlipayObject {

	private static final long serialVersionUID = 7299341158527898895L;

	/**
	 * 下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * SKILL.md 文件内容
	 */
	@ApiField("skill_md")
	private String skillMd;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSkillMd() {
		return this.skillMd;
	}
	public void setSkillMd(String skillMd) {
		this.skillMd = skillMd;
	}

}

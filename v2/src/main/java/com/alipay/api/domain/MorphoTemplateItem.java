package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶模板列表项
 *
 * @author auto create
 * @since 1.0, 2019-12-10 16:02:01
 */
public class MorphoTemplateItem extends AlipayObject {

	private static final long serialVersionUID = 4695887831984971358L;

	/**
	 * 最近更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 模板名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模板开发者
	 */
	@ApiField("owner")
	private MorphoUser owner;

	/**
	 * 模板截图
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 模板描述
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 模板版本
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 模板标题
	 */
	@ApiField("title")
	private String title;

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public MorphoUser getOwner() {
		return this.owner;
	}
	public void setOwner(MorphoUser owner) {
		this.owner = owner;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

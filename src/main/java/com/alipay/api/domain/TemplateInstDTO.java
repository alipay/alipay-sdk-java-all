package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版实例
 *
 * @author auto create
 * @since 1.0, 2021-12-22 20:12:17
 */
public class TemplateInstDTO extends AlipayObject {

	private static final long serialVersionUID = 2521421469984139197L;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * html的oss地址
	 */
	@ApiField("html_oss_url")
	private String htmlOssUrl;

	/**
	 * html预览地址
	 */
	@ApiField("html_preview_url")
	private String htmlPreviewUrl;

	/**
	 * 模版实例id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * word的oss地址
	 */
	@ApiField("oss_url")
	private String ossUrl;

	/**
	 * word预览地址
	 */
	@ApiField("preview_url")
	private String previewUrl;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getHtmlOssUrl() {
		return this.htmlOssUrl;
	}
	public void setHtmlOssUrl(String htmlOssUrl) {
		this.htmlOssUrl = htmlOssUrl;
	}

	public String getHtmlPreviewUrl() {
		return this.htmlPreviewUrl;
	}
	public void setHtmlPreviewUrl(String htmlPreviewUrl) {
		this.htmlPreviewUrl = htmlPreviewUrl;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOssUrl() {
		return this.ossUrl;
	}
	public void setOssUrl(String ossUrl) {
		this.ossUrl = ossUrl;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

}

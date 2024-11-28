package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板中心模板实例模型
 *
 * @author auto create
 * @since 1.0, 2023-09-07 18:56:20
 */
public class AgmTemplateInstanceDTO extends AlipayObject {

	private static final long serialVersionUID = 8423644899486497799L;

	/**
	 * 模板文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * html文件OSS路径
	 */
	@ApiField("html_oss_url")
	private String htmlOssUrl;

	/**
	 * HTML文件下载地址
	 */
	@ApiField("html_preview_url")
	private String htmlPreviewUrl;

	/**
	 * 模板实例id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * OSS文件路径
	 */
	@ApiField("oss_url")
	private String ossUrl;

	/**
	 * 实例文件下载地址
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

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

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}

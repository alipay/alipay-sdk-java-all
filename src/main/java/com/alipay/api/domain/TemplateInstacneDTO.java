package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板实例
 *
 * @author auto create
 * @since 1.0, 2022-09-19 19:07:59
 */
public class TemplateInstacneDTO extends AlipayObject {

	private static final long serialVersionUID = 5461236131292249678L;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * html oss文件key
	 */
	@ApiField("html_oss_url")
	private String htmlOssUrl;

	/**
	 * html文件预览地址
	 */
	@ApiField("html_preview_url")
	private String htmlPreviewUrl;

	/**
	 * 模版实例id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * oss 文件fileKey
	 */
	@ApiField("oss_url")
	private String ossUrl;

	/**
	 * 预览地址
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 标签列表
	 */
	@ApiListField("tags")
	@ApiField("agm_tag_d_t_o")
	private List<AgmTagDTO> tags;

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

	public List<AgmTagDTO> getTags() {
		return this.tags;
	}
	public void setTags(List<AgmTagDTO> tags) {
		this.tags = tags;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品介绍的文件
 *
 * @author auto create
 * @since 1.0, 2026-06-10 15:38:01
 */
public class FileInfoClasses extends AlipayObject {

	private static final long serialVersionUID = 2328673785472722963L;

	/**
	 * orc识别文件内容markdown格式
	 */
	@ApiField("agent_recognized_content")
	private String agentRecognizedContent;

	/**
	 * 文件产品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 文件链接
	 */
	@ApiField("url")
	private String url;

	public String getAgentRecognizedContent() {
		return this.agentRecognizedContent;
	}
	public void setAgentRecognizedContent(String agentRecognizedContent) {
		this.agentRecognizedContent = agentRecognizedContent;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}

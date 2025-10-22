package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违规凭证
 *
 * @author auto create
 * @since 1.0, 2023-07-24 10:47:06
 */
public class AuditEvidenceInfo extends AlipayObject {

	private static final long serialVersionUID = 7666381525744115622L;

	/**
	 * 文件类型。包括.jpg .png .jpeg .pdf等
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件url
	 */
	@ApiField("url")
	private String url;

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}

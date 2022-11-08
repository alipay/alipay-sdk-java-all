package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违规凭证
 *
 * @author auto create
 * @since 1.0, 2022-06-10 17:42:41
 */
public class AuditEvidenceInfo extends AlipayObject {

	private static final long serialVersionUID = 3594716544175625942L;

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

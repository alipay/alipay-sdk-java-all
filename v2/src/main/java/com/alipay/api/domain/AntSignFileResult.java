package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署完成的文件列表
 *
 * @author auto create
 * @since 1.0, 2023-05-17 14:19:44
 */
public class AntSignFileResult extends AlipayObject {

	private static final long serialVersionUID = 7494869654971732344L;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件osskey
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件http链接
	 */
	@ApiField("http_file_url")
	private String httpFileUrl;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getHttpFileUrl() {
		return this.httpFileUrl;
	}
	public void setHttpFileUrl(String httpFileUrl) {
		this.httpFileUrl = httpFileUrl;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待签署文件列表
 *
 * @author auto create
 * @since 1.0, 2024-09-05 15:23:12
 */
public class AntSignFileRequest extends AlipayObject {

	private static final long serialVersionUID = 4447119459375356263L;

	/**
	 * 文件可预览下载链接（业务方需保证文件存在和完整性）
file_http_url和file_key 二选一，网关请求传递file_http_url
	 */
	@ApiField("file_http_url")
	private String fileHttpUrl;

	/**
	 * 文件fileId 映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件osskey 通过oss上传的文件此值必传
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型，目前仅支持pdf，切勿传它值，默认传递：pdf
	 */
	@ApiField("file_type")
	private String fileType;

	public String getFileHttpUrl() {
		return this.fileHttpUrl;
	}
	public void setFileHttpUrl(String fileHttpUrl) {
		this.fileHttpUrl = fileHttpUrl;
	}

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

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}

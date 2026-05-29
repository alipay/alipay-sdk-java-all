package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件信息
 *
 * @author auto create
 * @since 1.0, 2026-04-30 17:01:15
 */
public class RegisterFileList extends AlipayObject {

	private static final long serialVersionUID = 1738785819795349351L;

	/**
	 * 文件格式
	 */
	@ApiField("file_format")
	private String fileFormat;

	/**
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileFormat() {
		return this.fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
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

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}

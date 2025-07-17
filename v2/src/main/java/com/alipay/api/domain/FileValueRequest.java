package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 百宝箱多模态文件输入类型
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:40
 */
public class FileValueRequest extends AlipayObject {

	private static final long serialVersionUID = 1247478833636474434L;

	/**
	 * aftsId，为蚂蚁中间件返回
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件大小，单位B
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 文件类型,支持 "txt", "md", "mdx", "markdown", "pdf", "xlsx", "xls", "doc", "docx","csv", "eml", "msg", "pptx", "ppt", "epub"
	 */
	@ApiField("file_type")
	private String fileType;

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

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能对话请求附件列表
 *
 * @author auto create
 * @since 1.0, 2025-05-07 15:29:40
 */
public class FileAttachment extends AlipayObject {

	private static final long serialVersionUID = 3723918775134973974L;

	/**
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 附件文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件访问链接
	 */
	@ApiField("file_url")
	private String fileUrl;

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

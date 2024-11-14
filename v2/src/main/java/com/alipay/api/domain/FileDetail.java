package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件信息
 *
 * @author auto create
 * @since 1.0, 2024-09-12 09:51:02
 */
public class FileDetail extends AlipayObject {

	private static final long serialVersionUID = 3348294322619119238L;

	/**
	 * 需要通过alipay.open.file.upload(支付宝文件上传接口)上传文件，获取对应的file_id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 带后缀文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
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

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}

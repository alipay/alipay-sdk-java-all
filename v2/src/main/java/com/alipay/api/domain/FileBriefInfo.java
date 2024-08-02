package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件摘要信息
 *
 * @author auto create
 * @since 1.0, 2024-08-01 21:15:13
 */
public class FileBriefInfo extends AlipayObject {

	private static final long serialVersionUID = 2475546564853894285L;

	/**
	 * 文件id，该字段唯一表示一份文件，并在上传文件时候由问答系统生成。
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 上传的文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 文件修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

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

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}

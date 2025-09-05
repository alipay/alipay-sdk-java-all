package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 版权材料文件
 *
 * @author auto create
 * @since 1.0, 2025-05-09 13:05:22
 */
public class CopyrightMaterialFile extends AlipayObject {

	private static final long serialVersionUID = 1828754756566511644L;

	/**
	 * 授权文件通过上传接口上传后得到的文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 授权文件的名称，用于页面展示
	 */
	@ApiField("file_name")
	private String fileName;

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

}

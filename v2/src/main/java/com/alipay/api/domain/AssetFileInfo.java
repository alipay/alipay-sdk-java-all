package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料文件信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 11:35:03
 */
public class AssetFileInfo extends AlipayObject {

	private static final long serialVersionUID = 8779343425625659398L;

	/**
	 * 物料的文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 物料生产资料的文件链接
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}

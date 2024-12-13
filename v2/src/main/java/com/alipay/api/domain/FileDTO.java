package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:17:50
 */
public class FileDTO extends AlipayObject {

	private static final long serialVersionUID = 8617177943897236988L;

	/**
	 * 附件下载地址
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}

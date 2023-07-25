package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取文件下载路径响应
 *
 * @author auto create
 * @since 1.0, 2023-06-15 14:48:43
 */
public class DownloadUrlResponse extends AlipayObject {

	private static final long serialVersionUID = 6474966498156381469L;

	/**
	 * 文件下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}

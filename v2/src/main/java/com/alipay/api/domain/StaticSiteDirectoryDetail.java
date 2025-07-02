package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点文件夹对象
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:18:42
 */
public class StaticSiteDirectoryDetail extends AlipayObject {

	private static final long serialVersionUID = 6718195347249659323L;

	/**
	 * 文件夹ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件夹名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 上次更新时间
	 */
	@ApiField("last_modified")
	private String lastModified;

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

	public String getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

}

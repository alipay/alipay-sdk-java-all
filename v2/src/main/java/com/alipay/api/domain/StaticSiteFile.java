package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点文件信息
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:18:31
 */
public class StaticSiteFile extends AlipayObject {

	private static final long serialVersionUID = 7182715678949137435L;

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
	 * 最后更新时间
	 */
	@ApiField("last_modified")
	private String lastModified;

	/**
	 * 文件大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 文件状态
	 */
	@ApiField("status")
	private String status;

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

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

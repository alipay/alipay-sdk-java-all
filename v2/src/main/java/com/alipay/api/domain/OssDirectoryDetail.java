package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OSS文件夹透出类型
 *
 * @author auto create
 * @since 1.0, 2023-08-02 14:18:55
 */
public class OssDirectoryDetail extends AlipayObject {

	private static final long serialVersionUID = 1254543715794663852L;

	/**
	 * 文件夹ACL
	 */
	@ApiField("acl")
	private String acl;

	/**
	 * 文件夹ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件夹上次更新时间
	 */
	@ApiField("last_modified")
	private String lastModified;

	public String getAcl() {
		return this.acl;
	}
	public void setAcl(String acl) {
		this.acl = acl;
	}

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

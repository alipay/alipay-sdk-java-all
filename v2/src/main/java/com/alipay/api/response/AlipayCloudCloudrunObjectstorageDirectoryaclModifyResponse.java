package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.directoryacl.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:00:58
 */
public class AlipayCloudCloudrunObjectstorageDirectoryaclModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2795264496299276712L;

	/** 
	 * 访问属性
	 */
	@ApiField("acl")
	private String acl;

	/** 
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件夹名
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 上次更新时间
	 */
	@ApiField("last_modified")
	private String lastModified;

	public void setAcl(String acl) {
		this.acl = acl;
	}
	public String getAcl( ) {
		return this.acl;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getLastModified( ) {
		return this.lastModified;
	}

}

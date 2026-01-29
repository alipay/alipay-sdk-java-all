package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.objectacl.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:03:03
 */
public class AlipayCloudCloudrunObjectstorageObjectaclModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8739354699286491522L;

	/** 
	 * 文件acl，取值default：默认，acl继承自桶的acl；private: 私有，公网无法直接访问获取；public-read: 公开，公网可以直接访问获取
	 */
	@ApiField("acl")
	private String acl;

	/** 
	 * 文件ID(唯一)，文件的唯一索引ID，上传文件后系统会创建返回该文件的文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 文件大小，单位为Byte
	 */
	@ApiField("size")
	private String size;

	/** 
	 * 文件状态
	 */
	@ApiField("status")
	private String status;

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

	public void setSize(String size) {
		this.size = size;
	}
	public String getSize( ) {
		return this.size;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}

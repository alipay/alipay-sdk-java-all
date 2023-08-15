package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.uploadurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-01 16:21:53
 */
public class AlipayCloudCloudrunObjectstorageUploadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6181386732184349399L;

	/** 
	 * 文件ID(唯一)，文件的唯一索引ID，上传文件后系统会创建返回该文件的文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件上传地址，该文件的上传地址
	 */
	@ApiField("upload_url")
	private String uploadUrl;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
	public String getUploadUrl( ) {
		return this.uploadUrl;
	}

}

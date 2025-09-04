package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.uploadurl.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 14:37:02
 */
public class AlipayCloudCloudrunStaticsiteUploadurlCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8361288329418329443L;

	/** 
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 上传文件的URL
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

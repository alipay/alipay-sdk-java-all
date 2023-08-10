package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.directory.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-02 19:01:54
 */
public class AlipayCloudCloudrunObjectstorageDirectoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5598782177629777879L;

	/** 
	 * 文件夹的File ID
	 */
	@ApiField("file_id")
	private String fileId;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}

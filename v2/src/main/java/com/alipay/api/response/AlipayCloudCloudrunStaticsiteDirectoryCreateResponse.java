package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.directory.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 10:19:59
 */
public class AlipayCloudCloudrunStaticsiteDirectoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4836748161571279386L;

	/** 
	 * 文件夹ID
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

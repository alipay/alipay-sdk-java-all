package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.directory.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:02:01
 */
public class AlipayCloudCloudrunStaticsiteDirectoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2842939266618575674L;

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

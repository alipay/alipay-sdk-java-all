package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-10 19:24:04
 */
public class MybankEcnyFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6419937149248594969L;

	/** 
	 * 文件ID
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

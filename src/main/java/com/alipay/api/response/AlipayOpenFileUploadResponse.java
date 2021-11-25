package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-18 19:15:33
 */
public class AlipayOpenFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3684821588683128166L;

	/** 
	 * 文件id，用于提供后后续业务调用使用
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

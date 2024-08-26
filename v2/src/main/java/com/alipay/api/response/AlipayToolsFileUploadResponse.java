package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.tools.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipayToolsFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6372219125292784833L;

	/** 
	 * 文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

}

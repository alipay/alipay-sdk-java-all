package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.tools.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-14 17:15:39
 */
public class AlipayToolsFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1136828499619594814L;

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

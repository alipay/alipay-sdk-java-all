package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 11:02:36
 */
public class AlipayOpenAppItemFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4657768873823265775L;

	/** 
	 * 文件可访问地址
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

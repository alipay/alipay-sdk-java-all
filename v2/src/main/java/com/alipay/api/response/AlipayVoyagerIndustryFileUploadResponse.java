package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.industry.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 14:57:37
 */
public class AlipayVoyagerIndustryFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7364668896143788815L;

	/** 
	 * 文件上传成功后的链接
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

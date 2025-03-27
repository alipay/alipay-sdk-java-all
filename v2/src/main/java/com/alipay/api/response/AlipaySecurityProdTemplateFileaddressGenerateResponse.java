package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.fileaddress.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:53:09
 */
public class AlipaySecurityProdTemplateFileaddressGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6315178329928183969L;

	/** 
	 * 复制后的文件url
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

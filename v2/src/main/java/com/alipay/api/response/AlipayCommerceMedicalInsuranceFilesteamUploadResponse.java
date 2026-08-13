package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.filesteam.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:27
 */
public class AlipayCommerceMedicalInsuranceFilesteamUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6287425791344857191L;

	/** 
	 * 文件url
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

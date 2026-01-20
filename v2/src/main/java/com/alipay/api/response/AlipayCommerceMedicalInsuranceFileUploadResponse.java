package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 17:57:42
 */
public class AlipayCommerceMedicalInsuranceFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8832828551856771513L;

	/** 
	 * 文件唯一编码
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

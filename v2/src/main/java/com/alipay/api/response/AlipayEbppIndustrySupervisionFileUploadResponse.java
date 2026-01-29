package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-12 20:27:42
 */
public class AlipayEbppIndustrySupervisionFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4392267272651134674L;

	/** 
	 * 凭证文件唯一标识，由ATFS返回
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

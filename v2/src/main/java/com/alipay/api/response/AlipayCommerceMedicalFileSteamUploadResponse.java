package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.file.steam.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 11:12:56
 */
public class AlipayCommerceMedicalFileSteamUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7199748539934274485L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件访问url
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

}

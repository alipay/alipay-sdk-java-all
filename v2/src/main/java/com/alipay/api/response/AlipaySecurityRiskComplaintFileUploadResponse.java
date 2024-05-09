package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.complaint.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-11 15:05:04
 */
public class AlipaySecurityRiskComplaintFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2798936332772561316L;

	/** 
	 * 本次上传的文件生成的key
	 */
	@ApiField("file_key")
	private String fileKey;

	/** 
	 * 本次上传的文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 本次上传的文件生成的url
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey( ) {
		return this.fileKey;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

}

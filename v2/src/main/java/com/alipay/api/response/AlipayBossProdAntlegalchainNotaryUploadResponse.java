package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.notary.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:07:41
 */
public class AlipayBossProdAntlegalchainNotaryUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2869361339881728861L;

	/** 
	 * 文件上传返回的fileId，上传失败则无值
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件fileKey,即上传路径，上传失败则无值
	 */
	@ApiField("file_key")
	private String fileKey;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey( ) {
		return this.fileKey;
	}

}

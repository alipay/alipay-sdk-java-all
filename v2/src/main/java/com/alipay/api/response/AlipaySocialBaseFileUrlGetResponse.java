package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.file.url.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:53:19
 */
public class AlipaySocialBaseFileUrlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8533743216691866875L;

	/** 
	 * 带文件拓展名的文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 所下载文件fileid 如果需要转码为转码后的fileId
	 */
	@ApiField("target_file_id")
	private String targetFileId;

	/** 
	 * 文件访问url
	 */
	@ApiField("url")
	private String url;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setTargetFileId(String targetFileId) {
		this.targetFileId = targetFileId;
	}
	public String getTargetFileId( ) {
		return this.targetFileId;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}

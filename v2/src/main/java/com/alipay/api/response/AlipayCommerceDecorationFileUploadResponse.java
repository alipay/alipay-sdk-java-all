package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 14:07:45
 */
public class AlipayCommerceDecorationFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1783914535741526315L;

	/** 
	 * 文件所在业务场景下关联的支付宝侧业务ID，与bizScene字段配合使用
	 */
	@ApiField("biz_file_id")
	private String bizFileId;

	/** 
	 * 文件key
	 */
	@ApiField("file_key")
	private String fileKey;

	/** 
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 文件访问URL, 有效期1年
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setBizFileId(String bizFileId) {
		this.bizFileId = bizFileId;
	}
	public String getBizFileId( ) {
		return this.bizFileId;
	}

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

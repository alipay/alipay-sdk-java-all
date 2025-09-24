package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 21:52:26
 */
public class AlipayCommercePropertyFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6239989249121632237L;

	/** 
	 * 文件所在业务场景下关联的支付宝侧业务ID，与bizScene字段配合使用
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 文件存储系统标识
	 */
	@ApiField("file_key")
	private String fileKey;

	/** 
	 * 当该字段为空时，系统会尝试获取上传文件的原始文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 文件访问链接
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
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

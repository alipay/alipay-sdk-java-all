package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.template.instance.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-09 21:12:44
 */
public class AnttechOceanbaseTemplateInstanceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2134386723382395668L;

	/** 
	 * 业务主键
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 业务身份
	 */
	@ApiField("biz_key")
	private String bizKey;

	/** 
	 * 根据身份接入申请而来的动态code
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 过期时间，秒
	 */
	@ApiField("expires_at")
	private Long expiresAt;

	/** 
	 * 文件名称
	 */
	@ApiField("file_key")
	private String fileKey;

	/** 
	 * 跟渲染类型一样
	 */
	@ApiField("file_type")
	private String fileType;

	/** 
	 * 文件下载地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}
	public String getBizKey( ) {
		return this.bizKey;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setExpiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
	}
	public Long getExpiresAt( ) {
		return this.expiresAt;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey( ) {
		return this.fileKey;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType( ) {
		return this.fileType;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:52:05
 */
public class AlipayCloudCloudpromoAichatFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6321575789139837431L;

	/** 
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件标签
	 */
	@ApiField("file_tag")
	private String fileTag;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setFileTag(String fileTag) {
		this.fileTag = fileTag;
	}
	public String getFileTag( ) {
		return this.fileTag;
	}

}

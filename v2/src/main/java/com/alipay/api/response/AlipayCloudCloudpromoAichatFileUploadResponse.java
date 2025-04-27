package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 15:17:03
 */
public class AlipayCloudCloudpromoAichatFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2245325812921522986L;

	/** 
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 文件tag，文件存入oss后生成的tag值。用户可基于该值判断本次上传的文件和上次上传的文件是否一致。
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

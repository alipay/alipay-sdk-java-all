package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.version.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:21
 */
public class AlipayCloudCloudbaseLayerVersionUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1215281523792166111L;

	/** 
	 * 上传id
	 */
	@ApiField("upload_id")
	private String uploadId;

	/** 
	 * 文件当前保存路径
	 */
	@ApiField("url")
	private String url;

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}
	public String getUploadId( ) {
		return this.uploadId;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}

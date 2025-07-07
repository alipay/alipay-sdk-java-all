package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:20
 */
public class AlipayCloudCloudbaseFunctionUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8333134858767447446L;

	/** 
	 * 部署任务id
	 */
	@ApiField("upload_id")
	private String uploadId;

	/** 
	 * 上传使用的url链接
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

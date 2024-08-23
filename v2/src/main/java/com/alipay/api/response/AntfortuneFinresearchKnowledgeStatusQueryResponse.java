package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.knowledge.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:59
 */
public class AntfortuneFinresearchKnowledgeStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6643329161624256653L;

	/** 
	 * 文件处理状态
	 */
	@ApiField("upload_status")
	private String uploadStatus;

	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	public String getUploadStatus( ) {
		return this.uploadStatus;
	}

}

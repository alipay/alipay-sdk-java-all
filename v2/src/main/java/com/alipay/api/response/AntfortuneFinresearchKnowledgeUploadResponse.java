package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.knowledge.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:59
 */
public class AntfortuneFinresearchKnowledgeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3524541479638372795L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}

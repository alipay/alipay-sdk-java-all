package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.document.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 19:50:04
 */
public class AlipayCloudCloudpromoDocumentFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5453947635637137316L;

	/** 
	 * 应用数据ID
	 */
	@ApiField("document_id")
	private String documentId;

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocumentId( ) {
		return this.documentId;
	}

}

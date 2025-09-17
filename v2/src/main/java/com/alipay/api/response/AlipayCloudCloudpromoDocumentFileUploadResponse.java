package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.document.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 10:42:36
 */
public class AlipayCloudCloudpromoDocumentFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8888793972214749611L;

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

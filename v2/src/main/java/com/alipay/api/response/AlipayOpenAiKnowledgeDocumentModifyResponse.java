package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.ai.knowledge.document.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 10:37:57
 */
public class AlipayOpenAiKnowledgeDocumentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5229286271578937216L;

	/** 
	 * 文档上传后的资源id
	 */
	@ApiField("data_source_id")
	private String dataSourceId;

	/** 
	 * 文档id
	 */
	@ApiField("document_id")
	private String documentId;

	/** 
	 * ACCEPTED：已受理
	 */
	@ApiField("submit_status")
	private String submitStatus;

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}
	public String getDataSourceId( ) {
		return this.dataSourceId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocumentId( ) {
		return this.documentId;
	}

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
	}
	public String getSubmitStatus( ) {
		return this.submitStatus;
	}

}

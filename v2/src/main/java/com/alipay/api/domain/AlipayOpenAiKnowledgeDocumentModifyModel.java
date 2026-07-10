package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件上传更新知识库内容
 *
 * @author auto create
 * @since 1.0, 2026-06-25 10:37:57
 */
public class AlipayOpenAiKnowledgeDocumentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2464432875178183427L;

	/**
	 * 文档的id，需要和知识库id对应
	 */
	@ApiField("document_id")
	private String documentId;

	/**
	 * 上传后的文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 知识库的id
	 */
	@ApiField("knowledge_base_id")
	private String knowledgeBaseId;

	/**
	 * OVERWRITE：覆盖更新；
UPSERT：增量更新
	 */
	@ApiField("update_mode")
	private String updateMode;

	public String getDocumentId() {
		return this.documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}
	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public String getUpdateMode() {
		return this.updateMode;
	}
	public void setUpdateMode(String updateMode) {
		this.updateMode = updateMode;
	}

}

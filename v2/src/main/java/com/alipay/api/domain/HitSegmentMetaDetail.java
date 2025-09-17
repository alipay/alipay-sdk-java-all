package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 命中的片段元数据
 *
 * @author auto create
 * @since 1.0, 2025-09-05 16:57:38
 */
public class HitSegmentMetaDetail extends AlipayObject {

	private static final long serialVersionUID = 3882873184968334931L;

	/**
	 * 应用数据ID
	 */
	@ApiField("document_id")
	private String documentId;

	/**
	 * 应用数据名称
	 */
	@ApiField("document_name")
	private String documentName;

	/**
	 * 知识库ID
	 */
	@ApiField("knowledge_base_id")
	private String knowledgeBaseId;

	/**
	 * 分片ID
	 */
	@ApiField("segment_id")
	private String segmentId;

	/**
	 * 分片位置
	 */
	@ApiField("segment_position")
	private Long segmentPosition;

	public String getDocumentId() {
		return this.documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return this.documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}
	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public String getSegmentId() {
		return this.segmentId;
	}
	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

	public Long getSegmentPosition() {
		return this.segmentPosition;
	}
	public void setSegmentPosition(Long segmentPosition) {
		this.segmentPosition = segmentPosition;
	}

}

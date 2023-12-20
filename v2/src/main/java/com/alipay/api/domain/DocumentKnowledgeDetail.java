package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文档知识信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:04:40
 */
public class DocumentKnowledgeDetail extends AlipayObject {

	private static final long serialVersionUID = 2122591185527568975L;

	/**
	 * 文档答案
	 */
	@ApiField("document_answer")
	private String documentAnswer;

	/**
	 * 关联的文档片段
	 */
	@ApiListField("related_document_fragments")
	@ApiField("related_document_fragments")
	private List<RelatedDocumentFragments> relatedDocumentFragments;

	public String getDocumentAnswer() {
		return this.documentAnswer;
	}
	public void setDocumentAnswer(String documentAnswer) {
		this.documentAnswer = documentAnswer;
	}

	public List<RelatedDocumentFragments> getRelatedDocumentFragments() {
		return this.relatedDocumentFragments;
	}
	public void setRelatedDocumentFragments(List<RelatedDocumentFragments> relatedDocumentFragments) {
		this.relatedDocumentFragments = relatedDocumentFragments;
	}

}

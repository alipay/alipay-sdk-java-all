package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文档知识信息
 *
 * @author auto create
 * @since 1.0, 2024-03-20 10:00:34
 */
public class DocumentKnowledgeDetail extends AlipayObject {

	private static final long serialVersionUID = 1742412746764384547L;

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

	/**
	 * 是否以流形式输出
	 */
	@ApiField("stream_output")
	private Boolean streamOutput;

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

	public Boolean getStreamOutput() {
		return this.streamOutput;
	}
	public void setStreamOutput(Boolean streamOutput) {
		this.streamOutput = streamOutput;
	}

}

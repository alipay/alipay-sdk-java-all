package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐知识点
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:52:16
 */
public class RecommendDetail extends AlipayObject {

	private static final long serialVersionUID = 7195728232915469251L;

	/**
	 * 知识点id
	 */
	@ApiField("knowledge_id")
	private Long knowledgeId;

	/**
	 * 知识库id
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 知识点标题
	 */
	@ApiField("title")
	private String title;

	public Long getKnowledgeId() {
		return this.knowledgeId;
	}
	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}

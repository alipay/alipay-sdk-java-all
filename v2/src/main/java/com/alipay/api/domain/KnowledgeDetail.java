package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识点信息
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:52:16
 */
public class KnowledgeDetail extends AlipayObject {

	private static final long serialVersionUID = 7844915843651699813L;

	/**
	 * 附件列表
	 */
	@ApiListField("attachments")
	@ApiField("attachment_detail_info")
	private List<AttachmentDetailInfo> attachments;

	/**
	 * 知识点内容（含HTML）
	 */
	@ApiField("content")
	private String content;

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

	public List<AttachmentDetailInfo> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<AttachmentDetailInfo> attachments) {
		this.attachments = attachments;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

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

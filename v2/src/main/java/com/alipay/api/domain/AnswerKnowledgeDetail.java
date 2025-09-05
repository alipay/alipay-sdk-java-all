package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人问答接口中返回的知识点详情
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class AnswerKnowledgeDetail extends AlipayObject {

	private static final long serialVersionUID = 7563923451148787745L;

	/**
	 * 知识点内容
	 */
	@ApiField("knowledge_content")
	private String knowledgeContent;

	/**
	 * 知识点id
	 */
	@ApiField("knowledge_id")
	private String knowledgeId;

	/**
	 * 知识点标题
	 */
	@ApiField("knowledge_title")
	private String knowledgeTitle;

	/**
	 * 知识点返回类型。枚举值对应如下
RICH_TEXT:富文本类型
MARKDOWN:markdown类型
JSON:json字符串类型
	 */
	@ApiField("knowledge_type")
	private String knowledgeType;

	public String getKnowledgeContent() {
		return this.knowledgeContent;
	}
	public void setKnowledgeContent(String knowledgeContent) {
		this.knowledgeContent = knowledgeContent;
	}

	public String getKnowledgeId() {
		return this.knowledgeId;
	}
	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public String getKnowledgeTitle() {
		return this.knowledgeTitle;
	}
	public void setKnowledgeTitle(String knowledgeTitle) {
		this.knowledgeTitle = knowledgeTitle;
	}

	public String getKnowledgeType() {
		return this.knowledgeType;
	}
	public void setKnowledgeType(String knowledgeType) {
		this.knowledgeType = knowledgeType;
	}

}

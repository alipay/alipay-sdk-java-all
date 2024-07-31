package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机器人答案
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:52:16
 */
public class RobotAnswer extends AlipayObject {

	private static final long serialVersionUID = 7888519362211145936L;

	/**
	 * 文档知识
	 */
	@ApiField("document_knowledge")
	private DocumentKnowledgeDetail documentKnowledge;

	/**
	 * 多轮问答内容
	 */
	@ApiField("dst")
	private DstDetail dst;

	/**
	 * 知识点
	 */
	@ApiField("knowledge")
	private KnowledgeDetail knowledge;

	/**
	 * 推荐知识点
	 */
	@ApiListField("recommends")
	@ApiField("recommend_detail")
	private List<RecommendDetail> recommends;

	/**
	 * 文本内容
	 */
	@ApiField("text")
	private TextDetail text;

	public DocumentKnowledgeDetail getDocumentKnowledge() {
		return this.documentKnowledge;
	}
	public void setDocumentKnowledge(DocumentKnowledgeDetail documentKnowledge) {
		this.documentKnowledge = documentKnowledge;
	}

	public DstDetail getDst() {
		return this.dst;
	}
	public void setDst(DstDetail dst) {
		this.dst = dst;
	}

	public KnowledgeDetail getKnowledge() {
		return this.knowledge;
	}
	public void setKnowledge(KnowledgeDetail knowledge) {
		this.knowledge = knowledge;
	}

	public List<RecommendDetail> getRecommends() {
		return this.recommends;
	}
	public void setRecommends(List<RecommendDetail> recommends) {
		this.recommends = recommends;
	}

	public TextDetail getText() {
		return this.text;
	}
	public void setText(TextDetail text) {
		this.text = text;
	}

}

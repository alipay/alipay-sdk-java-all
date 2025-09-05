package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机器人对话回答内容
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class BotAnswer extends AlipayObject {

	private static final long serialVersionUID = 8225427316668484563L;

	/**
	 * 机器人对话问答返回的澄清卡片详情
	 */
	@ApiListField("clarify_card")
	@ApiField("answer_clarify_card_detail")
	private List<AnswerClarifyCardDetail> clarifyCard;

	/**
	 * 机器人对话问答返回的推荐事项
	 */
	@ApiListField("item")
	@ApiField("answer_item_detail")
	private List<AnswerItemDetail> item;

	/**
	 * 机器人对话问答返回的知识点内容
	 */
	@ApiListField("knowledge")
	@ApiField("answer_knowledge_detail")
	private List<AnswerKnowledgeDetail> knowledge;

	/**
	 * 机器人对话问答返回的推荐服务
	 */
	@ApiListField("service")
	@ApiField("answer_service_detail")
	private List<AnswerServiceDetail> service;

	/**
	 * 机器人对话问答返回的流式详情
	 */
	@ApiField("stream")
	private AnswerStreamDetail stream;

	/**
	 * 机器人问答返回文本类型
	 */
	@ApiListField("text")
	@ApiField("answer_text_detail")
	private List<AnswerTextDetail> text;

	public List<AnswerClarifyCardDetail> getClarifyCard() {
		return this.clarifyCard;
	}
	public void setClarifyCard(List<AnswerClarifyCardDetail> clarifyCard) {
		this.clarifyCard = clarifyCard;
	}

	public List<AnswerItemDetail> getItem() {
		return this.item;
	}
	public void setItem(List<AnswerItemDetail> item) {
		this.item = item;
	}

	public List<AnswerKnowledgeDetail> getKnowledge() {
		return this.knowledge;
	}
	public void setKnowledge(List<AnswerKnowledgeDetail> knowledge) {
		this.knowledge = knowledge;
	}

	public List<AnswerServiceDetail> getService() {
		return this.service;
	}
	public void setService(List<AnswerServiceDetail> service) {
		this.service = service;
	}

	public AnswerStreamDetail getStream() {
		return this.stream;
	}
	public void setStream(AnswerStreamDetail stream) {
		this.stream = stream;
	}

	public List<AnswerTextDetail> getText() {
		return this.text;
	}
	public void setText(List<AnswerTextDetail> text) {
		this.text = text;
	}

}

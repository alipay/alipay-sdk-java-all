package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大模型im对象
 *
 * @author auto create
 * @since 1.0, 2024-09-10 20:01:19
 */
public class LlmServiceDTO extends AlipayObject {

	private static final long serialVersionUID = 5498917938148782858L;

	/**
	 * 对话内容列表，流式输出中大模型的每次输出语句块
	 */
	@ApiListField("answer")
	@ApiField("medical_llm_answer_d_t_o")
	private List<MedicalLlmAnswerDTO> answer;

	/**
	 * 卡片返回内容
	 */
	@ApiListField("answer_card")
	@ApiField("llm_answer_card_d_t_o")
	private List<LlmAnswerCardDTO> answerCard;

	/**
	 * 表示回答内容类型
	 */
	@ApiField("answer_type")
	private String answerType;

	/**
	 * 会话ID，蚂蚁侧生成
	 */
	@ApiField("ant_session_id")
	private String antSessionId;

	/**
	 * 对话ID，每次提问都会产生一个新的对话ID，蚂蚁侧生成
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 通用内容列表，存放挂号agent的相关卡片数据
	 */
	@ApiListField("content_list")
	@ApiField("chat_content_d_t_o")
	private List<ChatContentDTO> contentList;

	/**
	 * 只返回智能导诊意图
医疗科普——MEDICALSCI
用药指南——
DRUGGUIDE
智能导诊——
DEPARTGUIDE——只返回这个
	 */
	@ApiField("intention")
	private String intention;

	/**
	 * true：已结束
false：未结束，还有内容
	 */
	@ApiField("is_finished")
	private Boolean isFinished;

	/**
	 * true：需要撤回
false：无需撤回
	 */
	@ApiField("is_with_draw")
	private Boolean isWithDraw;

	/**
	 * query_type
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 卫健委通用助理——WJWCOMASS
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 服务结果列表页
	 */
	@ApiListField("service_result")
	@ApiField("external_service_d_t_o")
	private List<ExternalServiceDTO> serviceResult;

	/**
	 * 推荐问题。
	 */
	@ApiField("suggest_questions")
	private SuggestQuestionsDTO suggestQuestions;

	/**
	 * 目前只有文字模板
	 */
	@ApiField("template_id")
	private String templateId;

	public List<MedicalLlmAnswerDTO> getAnswer() {
		return this.answer;
	}
	public void setAnswer(List<MedicalLlmAnswerDTO> answer) {
		this.answer = answer;
	}

	public List<LlmAnswerCardDTO> getAnswerCard() {
		return this.answerCard;
	}
	public void setAnswerCard(List<LlmAnswerCardDTO> answerCard) {
		this.answerCard = answerCard;
	}

	public String getAnswerType() {
		return this.answerType;
	}
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public String getAntSessionId() {
		return this.antSessionId;
	}
	public void setAntSessionId(String antSessionId) {
		this.antSessionId = antSessionId;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public List<ChatContentDTO> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<ChatContentDTO> contentList) {
		this.contentList = contentList;
	}

	public String getIntention() {
		return this.intention;
	}
	public void setIntention(String intention) {
		this.intention = intention;
	}

	public Boolean getIsFinished() {
		return this.isFinished;
	}
	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Boolean getIsWithDraw() {
		return this.isWithDraw;
	}
	public void setIsWithDraw(Boolean isWithDraw) {
		this.isWithDraw = isWithDraw;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public List<ExternalServiceDTO> getServiceResult() {
		return this.serviceResult;
	}
	public void setServiceResult(List<ExternalServiceDTO> serviceResult) {
		this.serviceResult = serviceResult;
	}

	public SuggestQuestionsDTO getSuggestQuestions() {
		return this.suggestQuestions;
	}
	public void setSuggestQuestions(SuggestQuestionsDTO suggestQuestions) {
		this.suggestQuestions = suggestQuestions;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}

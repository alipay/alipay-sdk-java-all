package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消息
 *
 * @author auto create
 * @since 1.0, 2024-05-21 11:42:39
 */
public class NbMessage extends AlipayObject {

	private static final long serialVersionUID = 3564624184478423782L;

	/**
	 * 创作者平台agentId
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 模型回答，如果media_type=text，answer为文本内容，如果media_type=image，answer为url列表
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 会话id
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 由应用定义的对话输入变量，具体内容参考青蓝平台应用定义，JSON格式的Map，详细解释青蓝平台应用调用接口请求参数解释- inputs
	 */
	@ApiField("inputs")
	private String inputs;

	/**
	 * 返回结果的类型
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 由应用定义的对话输入变量，具体内容参考AI 创作平台智能体定义，生成型应用必选，JSON格式的Map，详细解释AI 创作平台应用调用接口请求参数解释- inputs
	 */
	@ApiField("query")
	private String query;

	/**
	 * 下一步问题建议列表
	 */
	@ApiListField("related_questions")
	@ApiField("string")
	private List<String> relatedQuestions;

	/**
	 * 外部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInputs() {
		return this.inputs;
	}
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public List<String> getRelatedQuestions() {
		return this.relatedQuestions;
	}
	public void setRelatedQuestions(List<String> relatedQuestions) {
		this.relatedQuestions = relatedQuestions;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

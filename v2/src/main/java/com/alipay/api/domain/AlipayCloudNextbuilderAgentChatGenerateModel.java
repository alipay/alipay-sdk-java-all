package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话消息发送接口（非流式）
 *
 * @author auto create
 * @since 1.0, 2024-05-14 20:05:49
 */
public class AlipayCloudNextbuilderAgentChatGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 7794369769276236271L;

	/**
	 * AI 创作平台创建的Agent 的 id，可从AI 创作平台页面获取
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 由应用定义的对话输入变量，具体内容参考青蓝平台应用定义，对话型应用非必选，JSON格式的Map，详细解释<a href="https://opendocs.alipay.com/pre-open/0cbmp8?pathHash=178b1334">青蓝平台应用调用接口请求参数解释- inputs</a>
	 */
	@ApiField("inputs")
	private String inputs;

	/**
	 * 客户调用应用的用户唯一标识
	 */
	@ApiField("outer_user_id")
	private String outerUserId;

	/**
	 * 用户输入的对话文本
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户调用来源侧的唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 会话id,表示一次对话，由服务端生成。首次发起为空，会在Response中返回；基于历史对话需指定。
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getInputs() {
		return this.inputs;
	}
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}

	public String getOuterUserId() {
		return this.outerUserId;
	}
	public void setOuterUserId(String outerUserId) {
		this.outerUserId = outerUserId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}

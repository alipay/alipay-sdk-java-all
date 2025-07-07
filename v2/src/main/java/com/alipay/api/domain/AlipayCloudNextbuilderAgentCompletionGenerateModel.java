package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成型应用调用接口
 *
 * @author auto create
 * @since 1.0, 2025-03-27 11:28:52
 */
public class AlipayCloudNextbuilderAgentCompletionGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 1429485893886141725L;

	/**
	 * AI 创作平台创建的智能体 的 id，可从AI 创作平台页面获取
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * Agent 的配置版本号，当应用有多个发布成功配置版本的情况下用于手动指定调用的具体版本号，若不传默认选择最新的配置版本，该参数可以从"alipay.cloud.nextbuilder.agent.config.get"接口的返回中获取
	 */
	@ApiField("config_version")
	private String configVersion;

	/**
	 * 由应用定义的对话输入变量，具体内容参考AI 创作平台智能体定义，生成型应用必选，JSON格式的Map，详细解释<a href="https://opendocs.alipay.com/pre-open/0cbmp8?pathHash=178b1334">AI 创作平台应用调用接口请求参数解释- inputs</a>
	 */
	@ApiField("inputs")
	private String inputs;

	/**
	 * 纬度数据，如2.247
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 是否接收思维链数据
	 */
	@ApiField("llm_thinking")
	private Boolean llmThinking;

	/**
	 * 经度数据，如48.888
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 客户调用应用的用户唯一标识
	 */
	@ApiField("outer_user_id")
	private String outerUserId;

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

	public String getConfigVersion() {
		return this.configVersion;
	}
	public void setConfigVersion(String configVersion) {
		this.configVersion = configVersion;
	}

	public String getInputs() {
		return this.inputs;
	}
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Boolean getLlmThinking() {
		return this.llmThinking;
	}
	public void setLlmThinking(Boolean llmThinking) {
		this.llmThinking = llmThinking;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOuterUserId() {
		return this.outerUserId;
	}
	public void setOuterUserId(String outerUserId) {
		this.outerUserId = outerUserId;
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

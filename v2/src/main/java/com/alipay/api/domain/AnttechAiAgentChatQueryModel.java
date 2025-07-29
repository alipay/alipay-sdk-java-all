package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字科技Agent智能体对话
 *
 * @author auto create
 * @since 1.0, 2024-12-17 18:33:51
 */
public class AnttechAiAgentChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6388369597589359444L;

	/**
	 * 智能助手标识，由服务提供方发放，用于区别不同服务场景，每个智能助手的服务场景对应不同的配置，如访问的大模型类型、版本、依赖的知识库等等
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 提问内容
	 */
	@ApiListField("chat_contents")
	@ApiField("d_t_agent_chat_content")
	private List<DTAgentChatContent> chatContents;

	/**
	 * 是否使用心跳模式，为true返回event会包含心跳信息
	 */
	@ApiField("heartbeat_mode")
	private Boolean heartbeatMode;

	/**
	 * 业务场景参数，用于特殊场景的定制化入参
	 */
	@ApiField("scene_param")
	private DTAgentSceneParam sceneParam;

	/**
	 * 标识同一次多轮对话的id，sessionId相同表示用户在同一会话中
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public List<DTAgentChatContent> getChatContents() {
		return this.chatContents;
	}
	public void setChatContents(List<DTAgentChatContent> chatContents) {
		this.chatContents = chatContents;
	}

	public Boolean getHeartbeatMode() {
		return this.heartbeatMode;
	}
	public void setHeartbeatMode(Boolean heartbeatMode) {
		this.heartbeatMode = heartbeatMode;
	}

	public DTAgentSceneParam getSceneParam() {
		return this.sceneParam;
	}
	public void setSceneParam(DTAgentSceneParam sceneParam) {
		this.sceneParam = sceneParam;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}

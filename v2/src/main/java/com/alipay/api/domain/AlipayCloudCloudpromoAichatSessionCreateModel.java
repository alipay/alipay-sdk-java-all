package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI智能对话会话session创建
 *
 * @author auto create
 * @since 1.0, 2024-09-02 16:54:17
 */
public class AlipayCloudCloudpromoAichatSessionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8547795181196784518L;

	/**
	 * 智能体自定义数据
	 */
	@ApiField("agent_custom_content")
	private String agentCustomContent;

	/**
	 * 用户唯一标识
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 配置信息查询
	 */
	@ApiField("query_config")
	private QueryAIChatSessionConfigRequest queryConfig;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 会话id，create_type=create（重新唤起）、clear（清空并新建）时必填
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 智能体归属人id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getAgentCustomContent() {
		return this.agentCustomContent;
	}
	public void setAgentCustomContent(String agentCustomContent) {
		this.agentCustomContent = agentCustomContent;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public QueryAIChatSessionConfigRequest getQueryConfig() {
		return this.queryConfig;
	}
	public void setQueryConfig(QueryAIChatSessionConfigRequest queryConfig) {
		this.queryConfig = queryConfig;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}

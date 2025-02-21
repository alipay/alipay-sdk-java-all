package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能对话智能体信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 20:34:14
 */
public class AIChatAgentInfo extends AlipayObject {

	private static final long serialVersionUID = 4711522814119966576L;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 智能体名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 所有者id
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 智能体场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}

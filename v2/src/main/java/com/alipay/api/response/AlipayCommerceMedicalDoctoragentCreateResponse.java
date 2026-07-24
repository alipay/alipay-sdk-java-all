package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctoragent.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:43
 */
public class AlipayCommerceMedicalDoctoragentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3664872456625357149L;

	/** 
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 下游头像id
	 */
	@ApiField("avatar_id")
	private String avatarId;

	/** 
	 * 配置id
	 */
	@ApiField("config_id")
	private String configId;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}
	public String getAvatarId( ) {
		return this.avatarId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getConfigId( ) {
		return this.configId;
	}

}

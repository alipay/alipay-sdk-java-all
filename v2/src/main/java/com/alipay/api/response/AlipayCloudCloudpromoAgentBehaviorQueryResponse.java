package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.agent.behavior.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 11:02:08
 */
public class AlipayCloudCloudpromoAgentBehaviorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4188764282977363752L;

	/** 
	 * 用户偏好信息
	 */
	@ApiField("behavior")
	private String behavior;

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	public String getBehavior( ) {
		return this.behavior;
	}

}

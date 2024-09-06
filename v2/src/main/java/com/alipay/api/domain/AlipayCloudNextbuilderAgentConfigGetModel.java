package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取agent模型配置详情
 *
 * @author auto create
 * @since 1.0, 2024-07-05 10:28:52
 */
public class AlipayCloudNextbuilderAgentConfigGetModel extends AlipayObject {

	private static final long serialVersionUID = 2251156363527874772L;

	/**
	 * 创作者平台agentId
	 */
	@ApiField("agent_id")
	private String agentId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}

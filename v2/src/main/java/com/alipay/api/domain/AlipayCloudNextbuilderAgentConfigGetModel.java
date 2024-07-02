package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取agent模型配置详情
 *
 * @author auto create
 * @since 1.0, 2024-06-18 14:35:49
 */
public class AlipayCloudNextbuilderAgentConfigGetModel extends AlipayObject {

	private static final long serialVersionUID = 6149123837951376696L;

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

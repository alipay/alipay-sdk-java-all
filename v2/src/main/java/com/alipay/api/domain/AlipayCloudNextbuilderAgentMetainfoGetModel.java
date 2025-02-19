package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取agent元数据
 *
 * @author auto create
 * @since 1.0, 2024-07-05 15:24:17
 */
public class AlipayCloudNextbuilderAgentMetainfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 2837597553385877928L;

	/**
	 * AI创作平台agentId
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

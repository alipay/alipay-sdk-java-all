package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取agent元数据
 *
 * @author auto create
 * @since 1.0, 2024-05-23 20:15:49
 */
public class AlipayCloudNextbuilderAgentMetainfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 7338741977637546279L;

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

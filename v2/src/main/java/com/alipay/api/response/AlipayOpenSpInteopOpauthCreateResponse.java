package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgentOperationAuthDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.opauth.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 15:12:38
 */
public class AlipayOpenSpInteopOpauthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8387299472245518819L;

	/** 
	 * 代运营授权信息，记录创建代运营授权子单以及对应的产品信息。
	 */
	@ApiListField("agent_operation_auth_details")
	@ApiField("agent_operation_auth_detail")
	private List<AgentOperationAuthDetail> agentOperationAuthDetails;

	public void setAgentOperationAuthDetails(List<AgentOperationAuthDetail> agentOperationAuthDetails) {
		this.agentOperationAuthDetails = agentOperationAuthDetails;
	}
	public List<AgentOperationAuthDetail> getAgentOperationAuthDetails( ) {
		return this.agentOperationAuthDetails;
	}

}
